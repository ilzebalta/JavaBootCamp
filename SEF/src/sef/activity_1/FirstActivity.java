package sef.activity_1;

import java.util.*;
import java.util.stream.Collectors;

public class FirstActivity {

    public static void main(String arg[]) {
        //Person object
        Person person = new Person("Ilze", 30);
        System.out.println("-------");
        System.out.println("This is Person");
        String message = person.introduceYourself();
        System.out.println(message);

        //Employee object
        Employee employee = new Employee("Ilze", 30, "Test automation engineer", "Accenture", 2000);
        System.out.println("-------");
        System.out.println("This is Employee");
        String introduceMessage = employee.introduceYourself();
        String workMessage = employee.workIn();
        System.out.println(introduceMessage);
        System.out.println(workMessage);

        //Student object
        Student student = new Student("Ilze", 30, "Riga Business School");
        System.out.println("-------");
        System.out.println("This is Student");
        String introduceMessage1 = student.introduceYourself();
        String studyMessage = student.studyIn();
        System.out.println(introduceMessage1);
        System.out.println(studyMessage);
        System.out.println("-------");

        //Employees
        Employee employee1 = new Employee("John", 35, "Senior test automation engineer", "Accenture", 3000);
        Employee employee2 = new Employee("Jane", 25, "Junior Developer", "Accenture", 2500);
        Employee employee3 = new Employee("Mark", 38, "Project Manager", "Accenture", 3500);

        //Employee list
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee);
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);

        //calling on employee sort-and-print method
        FirstActivity firstActivity = new FirstActivity();
        firstActivity.printSortedEmployeeList(employeeList);
    }

    //method for sorting employee list (more to less) and printing it out
    public void printSortedEmployeeList(List<Employee> employeeList) {
        List<Employee> sortedList = employeeList.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .collect(Collectors.toList());
        System.out.println("This is sorted Employee list, by salary from more to less");
        sortedList.forEach(System.out::println);
    }
}
