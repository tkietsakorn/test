
public class ClassStatic {
	
	static float PI = 3.14f;
	int number = 100;
	
	public static void main(String[] args) {
		System.out.println(PI);

		ClassStatic instance = new ClassStatic();
		
		System.out.println(instance.number);
	}
}
