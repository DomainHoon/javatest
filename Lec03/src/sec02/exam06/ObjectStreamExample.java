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
		list.add(new Board(1, "제목1", "내용1", "글쓴이1", new Date()));
		list.add(new Board(2, "제목2", "내용2", "글쓴이2", new Date()));
		list.add(new Board(3, "제목3", "내용3", "글쓴이3", new Date()));
		list.add(new Board(4, "제목4", "내용4", "글쓴이4", new Date()));
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
