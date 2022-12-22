package EPi_02_FileWritingOperations;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class UsingBufferedWriter_02 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String location = "UsingBufferedWriter.txt";
		String content = "Winter is Coming!!!";

		FileWriter fileWriter = new FileWriter(location);
		BufferedWriter bufferedwriter = new BufferedWriter(fileWriter); 
		bufferedwriter.write(content);
		bufferedwriter.close();




	}

}
