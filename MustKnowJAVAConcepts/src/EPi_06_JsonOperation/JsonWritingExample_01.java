package EPi_06_JsonOperation;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JsonWritingExample_01 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		JSONObject jsonobject = new JSONObject();
		jsonobject.put("Name", "Agniprasath");
		jsonobject.put("Age", 1);
		
		JSONArray jsonarray = new JSONArray();
		jsonarray.add("magical smile");
		jsonarray.add("magnetic eyes"); 
		
		jsonobject.put("Special Qualities", jsonarray);
		
		FileWriter filewriter = new FileWriter("agniprasath.json");
		filewriter.write(jsonobject.toJSONString());
		filewriter.close();

	}

}
