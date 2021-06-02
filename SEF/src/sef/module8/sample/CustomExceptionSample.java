package sef.module8.sample;
// Needs to be completed
public class CustomExceptionSample {

	//static setAge(int age) which throws CustomException
	//1 - Check if age<0. if yes, then throw CustomException
	//Creating and throwing an instance of CustomException
	//this ensures that CustomException is thrown

	public static void setAge(int age) throws CustomException {
		if(age < 0)
		{
			throw new CustomException();
		}
	}

	//Since CustomException is a checked exception, it's mandatory to call setAge method
	//inside a try catch block. Else the code would not compile.
	//2 - call setAge method with -1 as its parameter and surround this with a try catch block

	public static void main(String arg[]){
		try {
			setAge(-10);
		} catch (CustomException c) {
			System.out.println("Age can not be less then 0");
			System.out.println(c.getMessage());
		}
	}
}
