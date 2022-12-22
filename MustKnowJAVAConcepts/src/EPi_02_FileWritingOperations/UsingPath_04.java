package EPi_02_FileWritingOperations;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class UsingPath_04 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String location = "UsingPath.txt";
		String content = "Winter is Coming!!!";
		
		Path path = Paths.get(location);
		Files.write(path, content.getBytes());		
	}

}
