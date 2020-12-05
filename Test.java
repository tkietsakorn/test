
public class Test {
	
	Test (){
		System.out.println("Default constructor");
	}
	
	Test (int a, int b){
		System.out.println("Parameterized constructor: " + a + " " + b);
	}
	 
	Test (int a, float b){
		
	}
	
	public static void main(String[] args) {
		Test obj1 = new Test();
		Test obj2 = new Test(5, 9);
	}
}
