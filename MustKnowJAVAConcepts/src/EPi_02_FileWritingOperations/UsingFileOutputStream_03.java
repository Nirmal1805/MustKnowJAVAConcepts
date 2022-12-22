package EPi_02_FileWritingOperations;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

import javax.print.DocFlavor.BYTE_ARRAY;

public class UsingFileOutputStream_03 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String location = "UsingFOS.txt";
		String content = "SHare this";

		FileOutputStream outputstream = new FileOutputStream(location);
		byte[] writeThis = content.getBytes();
		outputstream.write(writeThis);
		outputstream.close();

		

	}

}
