package sef.activityFirst;

import java.util.*;
import java.util.stream.Collectors;

public class FirstActivity {

    public static void main(String arg[]) {

        //Person object
        try {
            Person person = new Person();
            person.setName("Ilze");
            person.setAge(30);

            System.out.println("-------");
            System.out.println("This is Person");

            person.introduceYourself();

        } catch (CustomizedException e) {
            System.out.println("This is Person");
            System.out.println("Can not create object, because " + e.getMessage());
        }

        //Employee object
        try {
            Employee employee = new Employee();
            employee.setName("Ilze");
            employee.setAge(30);
            employee.setJobTitle("Test automation engineer");
            employee.setCompany("Accenture");
            employee.setSalary(2000);

            System.out.println("-------");
            System.out.println("This is Employee");

            employee.introduceYourself();
            employee.workIn();
        } catch (CustomizedException e) {
            System.out.println("-------");
            System.out.println("This is Employee");
            System.out.println("Can not create object, because " + e.getMessage());
        }

        //Student object
        try {
            Student student = new Student();
            student.setName("Ilze");
            student.setAge(30);
            student.setUniversity("Riga Business School");

            System.out.println("-------");
            System.out.println("This is Student");

            student.introduceYourself();
            student.studyIn();

            System.out.println("-------");

        } catch (CustomizedException e) {
            System.out.println("-------");
            System.out.println("This is Student");
            System.out.println("Can not create object, because " + e.getMessage());
            System.out.println("-------");
        }

        //Employees
        Employee employee1 = new Employee("John", 35, "Senior test automation engineer", "Accenture", 3000);
        Employee employee2 = new Employee("Jane", 25, "Junior Developer", "Accenture", 2500);
        Employee employee3 = new Employee("Mark", 38, "Project Manager", "Accenture", 3500);

        //Employee list
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);

        //calling on employee sort-and-print method
        FirstActivity firstActivity = new FirstActivity();
        System.out.println("This is sorted Employee list, by salary from more to less");
        firstActivity.printSortedEmployeeList(employeeList);
    }

    //method for sorting employee list (more to less) and printing it out
    public void printSortedEmployeeList(List<Employee> employeeList) {
        List<Employee> sortedList = employeeList.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .collect(Collectors.toList());
        sortedList.forEach(System.out::println);
    }
}
