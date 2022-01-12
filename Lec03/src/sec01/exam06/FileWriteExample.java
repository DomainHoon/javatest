package sec01.exam06;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileWriteExample {

	public static void main(String[] args) throws Exception {
		Writer writer = new FileWriter("./test4.txt");
		char a = 'A'; char b = 'B'; char c = 'C';
		writer.write(a);writer.write(b);writer.write(c);
		writer.flush();
		writer.close();

	}

}
