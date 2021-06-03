package sef.module8.activity;
//Needs to be completed
//This program accepts a user name and checks user's validity
//The user name is checked against an array of names.

import sef.module8.sample.CustomException;

import java.util.Arrays;
import java.util.List;

public class CustomExceptionActivityTest {

    //1 - Type main method and call validateUser() from it.
    //Call this method with different names to test it
    //flag stores 1 if a match is found else it should remain 0
    //2 - Write code to check if parameter name contains a value which is found in validUsers array and change flag's value accordingly
    //3 - check if flag is zero, throw CustomExceptionActivity Exception.
    //You may also have to declare this exception in the method call using throws.
    //4 - else if flag is one, print a message "Welcome to Payroll program"

    public static void main(String arg[]) throws CustomExceptionActivity {
        validateUser("John");
        validateUser("Shanti");
        validateUser("Jānis");
    }

    /* Sorry, I did not do it with flag as I think it can be done directly in if statement.
    * I think writing the code using flags can be done using boolean, but I think it would add more lines to the
    * code
    */

    public static void validateUser(String name) throws CustomExceptionActivity {
        List validUsers = Arrays.asList("John","Mike", "Shanti", "Stacie");
            if (!validUsers.contains(name)) {
                System.out.println("Name " + name + " is not found in the list");
                System.out.println("-------");
                throw new CustomExceptionActivity();
            }
            if (validUsers.contains(name)) {
                System.out.println("Welcome to Payroll program " + name);
                System.out.println("-------");
        }
    }
}




