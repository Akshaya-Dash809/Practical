package Lab_30_Nov;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteArrayOS {

	public static void main(String[] args) throws IOException {
		FileOutputStream f1 = new FileOutputStream("D:\\test.txt");
		FileOutputStream f2 = new FileOutputStream("E:\\test1.txt");
		ByteArrayOutputStream bout = new ByteArrayOutputStream();
		bout.write(65);
		bout.writeTo(f1);
		bout.writeTo(f2);
		bout.flush();
		bout.close();
		System.out.println("Done");

	}

}