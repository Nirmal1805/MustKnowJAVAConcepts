package EPi_03_FileReadingOperations;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class UsingBufferedReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String location = "UsingBufferedWriter.txt";
		
		FileReader filereader = new FileReader(location);
		
		BufferedReader reader = new BufferedReader(filereader);
		
		//this will read only the frist line
		//String currentline = reader.readLine();
		//System.out.println(currentline);
		
		//this will read all the lines
		String currentline;
		while((currentline=reader.readLine())!=null) {
			System.out.println(currentline);
		}
		
		


	}

}
