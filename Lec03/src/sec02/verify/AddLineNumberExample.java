package sec02.verify;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class AddLineNumberExample {

	public static void main(String[] args) throws Exception {
		String filePath = "D:\\Program Files\\javaweb\\java\\Lec03\\src\\sec02\\verify\\AddLineNumberExample.java";
		FileReader fr = new FileReader(filePath);
		BufferedReader br = new BufferedReader(fr);
		int row = 0;
		String rowData;
		while((rowData = br.readLine()) != null) {
			row +=1;
			System.out.println(row + ":"+rowData);
		}
		br.close();
		fr.close();
		

	}

}
