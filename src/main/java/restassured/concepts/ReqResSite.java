package restassured.concepts;

import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class ReqResSite {
	public static String url = "https://reqres.in/";

	@Test(priority = 4)
	public void listUsers() {
		given().get(url + "api/users?page=2").then().statusCode(200);
		System.out.println(when().get(url + "api/users?page=2").getBody().jsonPath().getInt("total"));

	}

	@Test(priority = 3)
	public void singleUser() {
		given().get(url + "api/users/2").then().statusCode(200);

	}

	@Test(priority = 2)
	public void singleUserNotFound() {
		given().get(url + "api/users/23").then().statusCode(404);
	}

	@Test(priority = 1)
	public void createUser() {
		JSONObject map = new JSONObject();
		map.put("name", "Karthik");
		map.put("job", "leader");

		given().contentType(ContentType.JSON)
				.body(map.toJSONString()).when()
				.post(url + "api/users").then().statusCode(201).log().all();

	}

}
