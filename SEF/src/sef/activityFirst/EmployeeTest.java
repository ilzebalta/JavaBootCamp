package sef.activityFirst;

import junit.framework.TestCase;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class EmployeeTest extends TestCase {

    protected Employee employee;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    protected void setUp() throws CustomizedException {
        employee = new Employee();
        employee.setName("Ilze");
        employee.setSurname("Baltā-Krasta");
        employee.setAge(30);
        employee.setJobTitle("Test automation engineer");
        employee.setCompany("Accenture");
        employee.setSalary(2000);
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    public void testWorkIn() {
        employee.workIn();
        assertEquals("I work as Test automation engineer in Accenture.", outputStreamCaptor.toString().trim());
    }

    public void testToString() {
        String result = employee.toString();
        assertEquals("Name: Ilze Baltā-Krasta | age: 30 | job title: Test automation engineer | company: Accenture | salary: 2000",
                result);
    }

    public void testSetAndGetCompany() {
        String companyName = "Accenture";
        employee.setCompany(companyName);
        assertEquals(companyName, employee.getCompany());
    }

    public void testSetAndGetSalary() {
        int salary = 2000;
        employee.setSalary(salary);
        assertEquals(salary, employee.getSalary());
    }

    public void testEmployeeConstructorJobDetails(){
        String jobTitle = "Test automation engineer";
        String company = "Accenture";
        int salary = 2000;

        employee = new Employee(jobTitle, company, salary);

        assertEquals(jobTitle, employee.getJobTitle());
        assertEquals(company, employee.getCompany());
        assertEquals(salary, employee.getSalary());
    }

    public void testEmployeeConstructorFullDetails(){
        String name = "Ilze";
        String surname = "Baltā-Krasta";
        int age = 30;
        String jobTitle = "Test automation engineer";
        String company = "Accenture";
        int salary = 2000;

        employee = new Employee(name, surname, age, jobTitle, company, salary);

        assertEquals(name, employee.getName());
        assertEquals(surname, employee.getSurname());
        assertEquals(age, employee.getAge());
        assertEquals(jobTitle, employee.getJobTitle());
        assertEquals(company, employee.getCompany());
        assertEquals(salary, employee.getSalary());    }
}
