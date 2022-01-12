package sec02.exam04;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import sec02.exam02.ReadLineExample;

public class DataInputOutputStreamExample {

	public static void main(String[] args) throws Exception {
		System.out.println(ReadLineExample.class
				.getResource("").getPath()+"primitive.db");
		String filePath = ReadLineExample.class
				.getResource("").getPath()+"primitive.db";
		FileOutputStream fos = new FileOutputStream(filePath);
		DataOutputStream dos = new DataOutputStream(fos);
		dos.writeUTF("È«±æµ¿");
		dos.writeDouble(95.5);
		dos.writeInt(1);
		dos.writeUTF("±èÀÚ¹Ù");
		dos.writeInt(2);
		dos.flush();dos.close();
		FileInputStream fis = new FileInputStream(filePath);
		DataInputStream dis = new DataInputStream(fis);
		for(int i =0; i <2; i++) {
			String name = dis.readUTF();
			double score = dis.readDouble();
			int order = dis.readInt();
			System.out.println(name + ":" + score + ":" +order);
			
		}
			dis.close();
	}

}
