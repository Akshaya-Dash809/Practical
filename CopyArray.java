package Lab_01_Nov;

//an array program to copy from source to destination
public class CopyArray { // class
	public static void main(String[] args) {
		// declaring a source array
		char[] copyFrom = { 'a', 'k', 's', 'h', 'a', 'y', 'a', 'k' };
		// declaring a Destination array
		char[] copyTo = new char[7];
		System.arraycopy(copyFrom, 2, copyTo, 0, 5);
		// print the destination array
		System.out.println(String.valueOf(copyTo));
	}

}