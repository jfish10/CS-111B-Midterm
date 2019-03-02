import java.util.*;

class Array {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Hello, please enter a positive integer for the size of the array you will create: ");
		int sizeOfArray = Integer.parseInt(scan.nextLine());
		int[] numArray = new int[sizeOfArray];
		
		
		for (int i = 0; i < numArray.length; i++) {
			System.out.print(" Now, enter the integers you want to store in your array: " + (i+1) + " : ");
			numArray[i] = Integer.parseInt(scan.nextLine());
		}
		
		for(int i =0; i <numArray.length; i++ ) {
			System.out.print("Index " + (i+1) + " : ");
				System.out.print(numArray[i] + "\n");
		}		
	}
}