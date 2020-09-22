package restassured.concepts;

import java.io.File;
import java.io.FileReader;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JSON_Manipulation {

	public static void main(String[] args) throws Throwable {

		File f = new File(".\\src\\main\\java\\restassured\\concepts\\payload.json");
		FileReader reader = new FileReader(f);
		JSONParser jp = new JSONParser();
		Object object = jp.parse(reader);

		JSONObject jo = (JSONObject) object;
		System.out.println(jo.get("FirstName"));

	}

}
