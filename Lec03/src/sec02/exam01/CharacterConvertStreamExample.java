package sec02.exam01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class CharacterConvertStreamExample {

	public static void main(String[] args) throws Exception {
		write("문자 변환 스트림을 저장합니다.", "test2_1.txt");
	    System.out.println("파일 저장");
	    read("test2_1.txt");

	}
	public static void read(String file) throws Exception {
		FileInputStream fis = new FileInputStream(file);
	    Reader reader = new InputStreamReader(fis);
	    char[] buffer = new char[100];
	    int readCharNum = reader.read(buffer);
	    reader.close();
	    String data = new String(buffer, 0, readCharNum);
	    System.out.println(data);
	}
    public static void write(String str, String file) throws Exception {
    	FileOutputStream fos = new FileOutputStream(file);
		Writer writer  = new OutputStreamWriter(fos);
		writer.write(str);
	    writer.flush();
	    writer.close();
    }
}
