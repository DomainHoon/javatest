package sec03.exam01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class GetLineStringFromKeyboard {
	public static void main(String[] args) throws Exception {
		InputStream is = System.in;
		Reader reader = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(reader);
		while(true) {
			System.out.println("�Է��ϼ���>>");
			String lineStr = br.readLine();
			if(lineStr.equals("q") || lineStr.equals("quit"))break;
			System.out.println("�Է³���: " + lineStr);
			System.out.println();
		}
		br.close();
		reader.close();
		is.close();
		System.out.println("�ý�������");
	}

}
