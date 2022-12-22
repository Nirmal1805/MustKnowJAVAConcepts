package EPi_02_FileWritingOperations;

import java.io.FileWriter;
import java.io.IOException;

public class UsingFileWriter_01 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//1. file location  2.  content
		
		String location = "UsingFileWriter.txt";//adding "//D:" in starting 
		//will store the file in that location,this method will store it in the package itself.
		
		String content = "Learning Java is simple!";
		
		FileWriter fileWriter = new FileWriter(location);
		
		fileWriter.write(content);
		fileWriter.close();

	}

}
