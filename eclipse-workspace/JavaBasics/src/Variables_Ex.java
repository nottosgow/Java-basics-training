
public class Variables_Ex {
	int empId = 11111; // global instance variable
	static int countryCode = 91; // global static variable
	
	public static void main(String[] args) {
		
		byte age = 22;
		int salary = 9230902;
		
		System.out.println(Variables_Ex.countryCode);
		
		System.out.println(age + "\t" + salary);
		
		Variables_Ex obj = new Variables_Ex();
		
		System.out.println(obj.empId);
	}
}
