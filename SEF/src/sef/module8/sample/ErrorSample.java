package sef.module8.sample;
// Needs to be completed
public class ErrorSample {
	
	//This is an example of an error which cannot be handled programmatically 
	public static void main(String arg[]){
		try {
			System.out.println(divide(0, 0));
		} catch (ArithmeticException e) {
			System.out.println("I can't divide number by 0");
		}
		//infinity();
	}
	
	//Below method calls itself and
	//it happens infinite times because there is no exit condition
	//At one point in time, JVM would give up and show StackOverflowError

	public static int divide(int a, int b) {
		return a/b;		
	}

	public static void infinity(){
		//1 - Print a message
		System.out.println("Infinity!");
		//2 - Call infinity()
		infinity();
	}
}
