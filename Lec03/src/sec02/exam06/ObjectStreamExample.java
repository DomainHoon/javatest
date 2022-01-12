package sec02.exam06;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ObjectStreamExample {

	public static void main(String[] args) throws Exception {
		List<Board> list = new ArrayList<Board>();
		list.add(new Board(1, "����1", "����1", "�۾���1", new Date()));
		list.add(new Board(2, "����2", "����2", "�۾���2", new Date()));
		list.add(new Board(3, "����3", "����3", "�۾���3", new Date()));
		list.add(new Board(4, "����4", "����4", "�۾���4", new Date()));
		FileOutputStream fos = new FileOutputStream("./board.db");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(list);
		oos.flush();
		oos.close();
		
		FileInputStream fis = new FileInputStream("./board.db");
		ObjectInputStream ois = new ObjectInputStream(fis);
		List<Board> outlist = (List<Board>) ois.readObject();
		
		for(Board board: outlist)
			System.out.println(board);

	}

}
