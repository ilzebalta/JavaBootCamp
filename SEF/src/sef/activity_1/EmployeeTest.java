package sef.activity_1;


import junit.framework.TestCase;

public class EmployeeTest extends TestCase {

    protected Employee employee;

    protected void setUp() {
        employee = new Employee();
        employee.setName("Ilze");
        employee.setAge(30);
        employee.setJobTitle("Test automation engineer");
        employee.setCompany("Accenture");
        employee.setSalary(2000);
    }

    public void testWorkIn() {
        String result = employee.workIn();
        assertEquals("I work as Test automation engineer in Accenture.", result);
    }

    public void testToString() {
        String result = employee.toString();
        assertEquals("Name Ilze age 30 job title Test automation engineer company Accenture salary 2000",
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
        int age = 30;
        String jobTitle = "Test automation engineer";
        String company = "Accenture";
        int salary = 2000;

        employee = new Employee(name, age, jobTitle, company, salary);

        assertEquals(name, employee.getName());
        assertEquals(age, employee.getAge());
        assertEquals(jobTitle, employee.getJobTitle());
        assertEquals(company, employee.getCompany());
        assertEquals(salary, employee.getSalary());    }
}
