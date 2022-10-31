package Lab_31_Oct;

public class Anonymous {

	static void print(int arr[]) { //static print methods store and print array
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
	}
	public static void main(String[] args) {
		print(new int[] {10,20,30,40,50}); //passing random values in the print method's array
	}
}
