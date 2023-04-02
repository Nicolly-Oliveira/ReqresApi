package modulos.Usuario;

import core.BaseTest;
import core.Constantes;
import org.hamcrest.Matchers;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class UsuarioTest extends BaseTest {

    @Test
    public void listarUsuarios(){

        given()
        .when()
            .get("/users")
        .then()
            .statusCode(200)
        ;
    }

    @Test
    public void buscarUsuarioPorID(){

        given()
            .pathParam("id", Constantes.ID_USUARIO)
        .when()
            .get("/users/{id}")
        .then()
            .statusCode(200)
                .body("data.id", Matchers.is(Constantes.ID_USUARIO))
        ;
    }

    @Test
    public void buscarUsuarioPorIDInexistente(){

        given()
            .pathParam("id", 20)
        .when()
            .get("/users/{id}")
        .then()
            .statusCode(404)
        ;
    }

    @Test
    public void atualizarUsuarioPorIDPatch(){

        given()
            .pathParam("id", 4)
        .when()
            .patch("/users/{id}")
        .then()
            .statusCode(200)
            .body("updatedAt", Matchers.notNullValue())
        ;
    }

    @Test
    public void atualizarUsuarioPorIDPut(){

        given()
            .pathParam("id", 4)
        .when()
            .put("/users/{id}")
        .then()
            .statusCode(200)
            .body("updatedAt", Matchers.notNullValue())
        ;
    }

    @Test
    public void deletarUsuarioPorID(){

        given()
            .pathParam("id", 4)
        .when()
            .delete("/users/{id}")
        .then()
            .statusCode(204)
        ;
    }
}
