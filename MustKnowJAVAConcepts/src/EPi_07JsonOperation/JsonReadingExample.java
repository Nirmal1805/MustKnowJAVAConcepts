package EPi_07JsonOperation;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonReadingExample {

	public static void main(String[] args) throws IOException, ParseException {
		// TODO Auto-generated method stub

		JSONParser jsonparser = new JSONParser();

		FileReader filereader = new FileReader("agniprasath.json");

		Object parsedObject = jsonparser.parse(filereader);

		JSONObject jsonobject = (JSONObject) parsedObject;//typecast

		String name = (String)jsonobject.get("Name");
		System.out.println("Name is : "+name);

		Long age = (Long)jsonobject.get("Age");
		System.out.println("Age is : "+age);

		JSONArray array = (JSONArray)jsonobject.get("Special Qualities");
		Iterator iterator = array.iterator();
		while(iterator.hasNext()) {
			System.out.println("Special Quality : "+iterator.next());
		}

	}

}
