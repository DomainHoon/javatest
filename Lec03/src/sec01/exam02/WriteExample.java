package sec01.exam02;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Path;
import java.nio.file.Paths;

public class WriteExample {

	public static void main(String[] args) throws IOException {
		String path = System.getProperty("user.dir");
		System.out.println(path);
		Path currentPath = Paths.get("");
		System.out.println(currentPath.toAbsolutePath().toString());
		String path2 = new WriteExample().getClass().getResource("").getPath();
		System.out.println(path2);
		
		OutputStream os = new FileOutputStream(path2 + "test1.db");
			byte[] array = {10,20,30};
			os.write(array);
			os.flush();
			os.close();

	}

}
