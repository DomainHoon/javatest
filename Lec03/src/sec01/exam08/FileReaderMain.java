package sec01.exam08;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class FileReaderMain {

	public static void main(String[] args) throws Exception {
		Reader reader = new FileReader("./test4.txt");
		while(true) {
			int data = reader.read();
			if(data == -1)break;
			System.out.println(data);
		}reader.close();
		
	}

}
