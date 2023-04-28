
public class Methods_Ex {
	
	int a = 90;
	int b = 3;
	
	public static int addOfTwo (int a, int b) {
		return a + b;
	}
	
	public void subOfTwo(int a, int b) {
		System.out.println(a - b);
	}

	public static void main(String[] args) {
		
		Methods_Ex obj = new Methods_Ex();
		
		System.out.println(Methods_Ex.addOfTwo(obj.a, obj.b));
		
		
		obj.subOfTwo(obj.a, obj.b);

	}

}
