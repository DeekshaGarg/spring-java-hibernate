package demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;

public class Test {

	public static void main(String[] args) {
		String REQUEST_URL = "";

		try {
			URL url = new URL("https://crunchify.com/wp-content/uploads/code/json.sample.txt");
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			// conn.connect();
			BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			String inputLine;
			String jsonString = "";
			while ((inputLine = in.readLine()) != null) {
				jsonString += inputLine;
				// System.out.println(inputLine);
			}
			in.close();

			System.out.println(jsonString);
			System.out.println("=======================================");

			Map jsonJavaRootObject = new Gson().fromJson(jsonString, Map.class);

			Map<String, Object> javaRootMapObject = new Gson().fromJson(jsonString, Map.class);

			System.out.println(((Map) ((List) ((Map) (javaRootMapObject.get("data"))).get("translations")).get(0))
					.get("translatedText"));

			// Create gson
			/*
			 * Gson gson = new GsonBuilder().create(); Response r =
			 * gson.fromJson(jsonString, Response.class);
			 */
			System.out.println(jsonJavaRootObject);
			/// LOG.info("MyGSON:" + r.toString());
		} catch (IOException e) {
			e.getMessage();
			e.printStackTrace();
		} catch (Exception e) {
			e.getMessage();
			e.printStackTrace();
		}

	}

}