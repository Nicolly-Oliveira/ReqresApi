package modulos.Login;

import core.BaseTest;
import core.Constantes;
import io.restassured.http.ContentType;
import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class LoginTest extends BaseTest {

    Map<String, String> credenciais = new HashMap<>();

    @Test
    public void realizarLoginComCredenciaisValidas() {
        credenciais.put("email", Constantes.EMAIL);
        credenciais.put("password", Constantes.PASSWORD);
        given()
            .body(credenciais)
        .when()
            .post("/login")
        .then()
            .statusCode(200)
            .body("token", Matchers.notNullValue())
            .body("token", Matchers.is("QpwL5tke4Pnpja7X4"))
        ;
    }

    @Test
    public void realizarLoginComCredenciaisVazias() {
        credenciais.put("email", "");
        credenciais.put("password", "");

        given()
            .body(credenciais)
        .when()
            .post("/login")
        .then()
            .statusCode(400)
            .body("error", Matchers.is("Missing email or username"));
    }

    @Test
    public void realizarLoginComSenhaVazia() {
        credenciais.put("email", "eve.holt@reqres.in");
        credenciais.put("password", "");

        given()
            .body(credenciais)
        .when()
            .post("/login")
        .then()
            .statusCode(400)
            .body("error", Matchers.is("Missing password"));
    }

    @Test
    public void realizarLoginComEmailVazio() {
        credenciais.put("email", "");
        credenciais.put("password", "pistol");

        given()
            .body(credenciais)
        .when()
            .post("/login")
        .then()
            .statusCode(400)
            .body("error", Matchers.is("Missing email or username"));
    }

    @Test
    public void realizarLoginComCredenciaisInvalidas() {
        credenciais.put("email", "test@test.com");
        credenciais.put("password", "test");

        given()
            .body(credenciais)
        .when()
            .post("/login")
        .then()
            .statusCode(400)
            .body("error", Matchers.is("user not found"));
    }

    @Test
    public void realizarLoginComCredencialEmailInvalida() {
        credenciais.put("email", "test@test.com");
        credenciais.put("password", "pistol");

        given()
            .body(credenciais)
        .when()
            .post("/login")
        .then()
            .statusCode(400)
            .body("error", Matchers.is("user not found"));
    }

    @Test
    public void realizarLoginComCredencialSenhaInvalida() {
        credenciais.put("email", "eve.holt@reqres.in");
        credenciais.put("password", "test");

        given()
            .body(credenciais)
        .when()
            .post("/login")
        .then()
            .statusCode(400)
        ;
    }

    @Test
    public void realizarLogout() {

        given()
        .when()
            .post("/logout")
        .then()
                .statusCode(200)
        ;
    }
}

