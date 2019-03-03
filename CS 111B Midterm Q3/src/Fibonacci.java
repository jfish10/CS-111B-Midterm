class Fibonacci {
	
	
	
	
	public static void sumFib(int num) {
		int prev = 0;
		int curr = 1;
		int total = 0;
		for (int i = 0; i <= num-1; i++) {
			System.out.print(curr + " + ");
			total = prev + curr;
			prev = curr;
			if(curr % 2 != 0) {
				curr = total;
			}		
		}
		}
	
		
		
	
	public static void main(String[] args) {
		
		Fibonacci.sumFib(7);
		
	}
}