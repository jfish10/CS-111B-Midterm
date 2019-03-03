import java.util.Scanner;

class SortedArray {
	
	public void bubbleSort(int[] numArray) {
		int n = numArray.length;
		int temp = 0;
		
		for(int i = 0; i < n-1; i++) {
			for(int j = 0; j<(n-i-1);j++) {
				if(numArray[j] > numArray[j+1]) {
					//swamp smaller and larger numbers
					temp = numArray[j];
					numArray[j] = numArray[j+1];
					numArray[j+1] = temp;
				}
			}
		}
	}
	
	public void printArray(int[] numArray) {
		int n = numArray.length;
		for(int i = 0; i < n; i++) {
			System.out.print(numArray[i] + " ");
		}
		System.out.println();
	}
	
		
	
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Hello, please enter a positive integer for the size of the array you will create: ");
		int sizeOfArray = Integer.parseInt(scan.nextLine());
		int[] numArray = new int[sizeOfArray];
		
		//initialize array from user input by index
		for (int i = 0; i < numArray.length; i++) {
			System.out.print(" Now, enter the integers you want to store in your array: " + (i+1) + " : ");
			numArray[i] = Integer.parseInt(scan.nextLine());
		}
		
		SortedArray a = new SortedArray();
		//invoking the bubble sort method
		a.bubbleSort(numArray);
		System.out.println("Sorted array ascending order: ");
		//printing once the bubble sort method is completed in ascending order
		a.printArray(numArray);
		
		
		System.out.println("The largest integer in the array is: ");
		
		
		
		
	}
}