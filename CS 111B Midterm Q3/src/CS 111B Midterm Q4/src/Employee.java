class Employee {
	//instance variables
	private int ID;
	private int wages;
	private String name;
	private int hours;
	private int rate;
	

	//implement the getters and setters for the Employee class
	public int getId() {
		return ID;
	}
	
	public int getWages() {
		return hours * rate;
	}
	
	public String getName() {
		return name;
	}
	
	public int getHours() {
		return hours;
	}
	
	public double getRate() {
		return rate;
	}
	public void setInfo(int id, String nombre,int hourlySchedule, int hourlyRate ) {
		ID = id;
		name = nombre;
		hours = hourlySchedule;
		rate = hourlyRate;
		wages = hourlySchedule * hourlyRate;
	}
	
	static void printArray(Employee[] e) { //prints info for each employee
		for(int i = 0; i < e.length; i++) {
			System.out.println("Employee " + i + " ID number is: " + e[i].getId());
			System.out.println("Employee " + i + " weekly salary is: " + e[i].getWages());
			System.out.println("Employee " + i + " name is: " + e[i].getName());
			System.out.println("Employee " + i + " hours worked a week is: " + e[i].getHours());
			System.out.println("Employee " + i + " hourly rate is: " + e[i].getRate() +"\n");
		}
	}
	
	static void selectionSort(int[] e) {
		int n = e.length;
		for(int i = 0; i < n-1; i++) {
			int min_index = i;
			for(int j = i+1; j < n; j++) {
				if(e[j] < e[min_index]) {
					min_index = j;
				}
				//swap the found minimum elements
				int temp = e[min_index];
				e[min_index] = e[i];
				e[i] = temp;
			}
			System.out.println(e[4]);
			
		}
	}
	
	
	
 	
	public static void main(String[] args) {
		Employee[] e = new Employee[5];
		
		for(int i = 0; i < e.length; i++) {
			e[i] = new Employee();
		}
		
		e[0].setInfo(123, "John Smith", 40, 25);
		e[1].setInfo(234, "John Rolph", 25, 30);
		e[2].setInfo(345, "Kobe Bryant", 40, 40);
		e[3].setInfo(456, "Lebron James", 15, 80);
		e[4].setInfo(789, "Jon Fisher", 40, 60);
		
		Employee.printArray(e);
	
		
		
		
	}
}