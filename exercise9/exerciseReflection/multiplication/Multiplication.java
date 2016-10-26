package exerciseReflection.multiplication;
public class Multiplication {
	public Multiplication() {
		
	}
	public static void init(String str, int a, int b) {
		int c = a*b;
		System.out.println(str + c);
	}
	public void execInit(String str, int a, int b) {
		init(str, a, b);
	}
}