package sef.activityFirst;

import junit.framework.TestCase;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;

public class FirstActivityTest extends TestCase {

    protected FirstActivity firstActivity;

    private Person person;

    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    protected void setUp() {
        firstActivity = new FirstActivity();
        person = new Person();
        employee1 = new Employee();
        employee2 = new Employee();
        employee3 = new Employee();
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    public void testPersonObject() {
        String name = "Ilze";
        int age = 30;
        person = new Person(name, age);
        assertEquals(name, person.getName());
        assertEquals(age, person.getAge());
    }

    Employee employee1 = new Employee();
    Employee employee2 = new Employee();
    Employee employee3 = new Employee();

    /* this test does prove that expected list is sorted in a way that it is expected to be, but
    * it fails simply because data in the test output are not formatted in the same way.
    * data from actual list with tested method is using special toString method from Employee class
     * did not manage to find find the right solution for this
     */
    public void testPrintSortedEmployeeList() {
        employee1.setSalary(3000);
        employee2.setSalary(2500);
        employee3.setSalary(3500);

        List<Employee> actualList = Arrays.asList(employee1, employee2, employee3);
        List<Employee> expectedList = Arrays.asList(employee3, employee1, employee2);

        firstActivity.printSortedEmployeeList(actualList);

        assertEquals(expectedList.toString().trim(), outputStreamCaptor.toString().trim());
    }
}