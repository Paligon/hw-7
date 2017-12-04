package Utils;
public class MyMath {
	
	public static int factorial(int number) {
		if (number<=1) {
			return 1;
		}
		return number * factorial(number - 1);
	}
		
	public static int factorialLoop(int number) {
		int a = 1;
		int b = 1;
		while( a <= number) {
			
	        a = a * b;
			b++;
		}
		return a;
	}
	
	public static void main(String[] args) {
		System.out.println(factorial(3));
        System.out.println(factorialLoop(3));

 	}
}