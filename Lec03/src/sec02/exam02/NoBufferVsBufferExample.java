package sec02.exam02;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

public class NoBufferVsBufferExample {
    private static int data =-1;
    public static long copy(InputStream is, OutputStream os) throws Exception {
    	long start = System.currentTimeMillis();
    	while(true) {
    		data = is.read();
    		if(data == -1) break;
    		os.write(data);
    	}
    	os.flush();
    	long end = System.currentTimeMillis();
    	return (end-start);
    }
	public static void main(String args[]) throws Exception {
    	InputStream is = NoBufferVsBufferExample.class.getClassLoader().
    			getResource("robot.jpg").openStream();
    	
    	FileOutputStream fos = new FileOutputStream("./targetFile1.jpg");    	
    	System.out.println("Nobuffer copy time : " +copy(is, fos));
    	fos.close();    	
    	
    	FileOutputStream fos2 = new FileOutputStream("./targetFile2.jpg");
    	BufferedInputStream bis = new BufferedInputStream(is);
    	BufferedOutputStream bos = new BufferedOutputStream(fos2);    	
		System.out.println("buffered copy time : " +copy(bis, bos));
		is.close();
	    fos2.close();
	    bis.close();
	    bos.close();
	 } //∏ﬁ¿Œ
    
   
    
    
}
