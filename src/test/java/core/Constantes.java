package core;

import io.restassured.http.ContentType;

public interface Constantes {

    String API_BASE_URL = "https://reqres.in";
    //Integer PORT;
    String API_BASE_PATH = "/api";
    Integer ID_USUARIO = 4;

    String EMAIL = "eve.holt@reqres.in";
    String PASSWORD = "pistol";

    ContentType API_CONTENT_TYPE = ContentType.JSON;

    Long MAX_TIMEOUT = 3000l;
}
