package sef.activityFirst;

import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertThat;

public class FirstActivityTest extends TestCase {

    protected FirstActivity firstActivity;
    protected Person person;

    protected Employee employee1;


    protected void setUp() {
        firstActivity = new FirstActivity();
        person = new Person();
        employee1 = new Employee();
        employee2 = new Employee();
        employee3 = new Employee();
        List<Employee> employeeList = new ArrayList<>();
    }

//    public void testPersonObject() {
//        String name = "Ilze";
//        int age = 30;
//        person = new Person(name, age);
//        String result = person.introduceYourself();
//        assertEquals("My name is Ilze and I am 30 years old.", result);
//    }


    //    ("John", 35, "Senior test automation engineer", "Accenture", 3000);
    Employee employee2 = new Employee("Jane", 25, "Junior Developer", "Accenture", 2500);
    Employee employee3 = new Employee("Mark", 38, "Project Manager", "Accenture", 3500);


    public void testPrintSortedEmployeeList() {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);

        firstActivity.printSortedEmployeeList(employeeList);
        ;


    }


}