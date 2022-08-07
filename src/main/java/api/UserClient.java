package api;

import io.restassured.response.Response;
import pojo.*;
import static io.restassured.RestAssured.given;

public class UserClient extends RestAssuredClient {

    public static ResponseUser createUser(User user){
        return reqSpec
            .body(user)
            .post(REGISTER)
            .then()
            .extract()
            .body()
            .as(ResponseUser.class);
    }


    public static void deleteUser(String authorization) {
        reqSpec
            .auth()
            .oauth2(authorization)
            .delete(USER)
            .then()
            .statusCode(202);
    }


}
