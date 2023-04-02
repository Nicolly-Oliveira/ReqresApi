package modulos.Registro;

import core.BaseTest;
import core.Constantes;
import org.hamcrest.Matchers;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class RegistroTest extends BaseTest {

    @Test
    public void RegistrarUsuárioComDadosValidos(){
        Map<String, String> credenciais = new HashMap<>();
        credenciais.put("email", Constantes.EMAIL);
        credenciais.put("password", Constantes.PASSWORD);

        given()
            .body(credenciais)
        .when()
            .post("/register")
        .then()
            .statusCode(200)
            .body("id", Matchers.notNullValue())
            .body("id", Matchers.is(4))
            .body("token", Matchers.notNullValue())
            .body("token", Matchers.is("QpwL5tke4Pnpja7X4"))
        ;
    }

    @Test
    public void RegistrarUsuárioComDadosVazios(){
        Map<String, String> credenciais = new HashMap<>();
        credenciais.put("email", "");
        credenciais.put("password", "");

        given()
            .body(credenciais)
        .when()
            .post("/register")
        .then()
            .statusCode(400)
            .body("error", Matchers.is("Missing email or username"))
        ;

    }

    @Test
    public void RegistrarUsuárioComDadosInvalidos(){
        Map<String, String> credenciais = new HashMap<>();
        credenciais.put("email", "test@test.com");
        credenciais.put("password", "test");

        given()
            .body(credenciais)
        .when()
            .post("/register")
        .then()
            .statusCode(400)
            .body("error", Matchers.is("Note: Only defined users succeed registration"))
        ;

    }

    @Test
    public void RegistrarUsuárioComEmailInvalidoESenhaValida(){
        Map<String, String> credenciais = new HashMap<>();
        credenciais.put("email", "test@test.com");
        credenciais.put("password", Constantes.PASSWORD);

        given()
            .body(credenciais)
        .when()
            .post("/register")
        .then()
            .statusCode(400)
            .body("error", Matchers.is("Note: Only defined users succeed registration"))
        ;

    }

}
