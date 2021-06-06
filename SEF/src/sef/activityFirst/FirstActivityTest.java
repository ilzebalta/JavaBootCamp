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

    /* comment about the following 3 test methods:
     * these tests proves that lists are sorted in a way that they are expected to be, but
     * tests fails simply because data from actual and expected lists in the test output are not formatted
     * in the same way (you will see if you click on 'see difference';
     * data from actual list with tested method is using special toString method from Employee class;
     * did not manage to find find the right solution how to solve this;
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

    public void testPrintSortedEmployeesByName() throws CustomizedException {
        employee1.setName("John");
        employee2.setName("Amy");
        employee3.setName("Mark");

        List<Employee> actualList = Arrays.asList(employee1, employee2, employee3);
        List<Employee> expectedList = Arrays.asList(employee2, employee1, employee3);

        firstActivity.printSortedEmployeesByName(actualList);

        assertEquals(expectedList.toString().trim(), outputStreamCaptor.toString().trim());
    }

    public void testPrintSortedEmployeesByAge() {
        employee1.setAge(30);
        employee2.setAge(40);
        employee3.setAge(20);

        List<Employee> actualList = Arrays.asList(employee1, employee2, employee3);
        List<Employee> expectedList = Arrays.asList(employee3, employee1, employee2);

        firstActivity.printSortedEmployeesByAge(actualList);

        assertEquals(expectedList.toString().trim(), outputStreamCaptor.toString().trim());
    }
}