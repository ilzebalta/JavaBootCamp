package sef.activityFirst;

import java.util.*;
import java.util.stream.Collectors;

public class FirstActivity {

    public static void main(String arg[]) {

        //Person object
        try {
            Person person = new Person();
            person.setName("Ilze");
            person.setSurname("Baltā-Krasta");

            person.setAge(30);

            System.out.println("-------");
            System.out.println("This is Person");

            person.introduceYourself();

        } catch (CustomizedException e) {
            System.out.println("This is Person");
            System.out.println("Can not create a Person object, because " + e.getMessage());
        }

        //Employee object
        try {
            Employee employee = new Employee();
            employee.setName("Ilze");
            employee.setSurname("Baltā-Krasta");
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
            System.out.println("Can not create an Employee object, because " + e.getMessage());
        }

        //Student object
        try {
            Student student = new Student();
            student.setName("Ilze");
            student.setSurname("Baltā-Krasta");
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
            System.out.println("Can not create a Student object, because " + e.getMessage());
            System.out.println("-------");
        }

        //Employees
        Employee employee1 = new Employee("John", "Johnson", 40, "Senior test automation engineer", "Accenture", 3000);
        Employee employee2 = new Employee("Amy", "Zachary", 25, "Junior Developer", "Accenture", 2500);
        Employee employee3 = new Employee("Mark", "Stevenson", 33, "Project Manager", "Accenture", 3500);

        //Employee list
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);

        //calling on employee sort-and-print method by salary, more to less
        FirstActivity firstActivity = new FirstActivity();
        System.out.println("This is Employee list, sorted by salary from more to less");
        firstActivity.printSortedEmployeesBySalary(employeeList);

        //calling on employee sort-and-print method by name from A to Z
        System.out.println("-------");
        System.out.println("This is Employee list, sorted by name from A to Z");
        firstActivity.printSortedEmployeesByName(employeeList);

        //calling on employee sort-and-print method by surname from A to Z
        System.out.println("-------");
        System.out.println("This is Employee list, sorted by surname from A to Z");
        firstActivity.printSortedEmployeesBySurname(employeeList);

        //calling on employee sort-and-print method by age from younger to older
        System.out.println("-------");
        System.out.println("This is Employee list, sorted by age from younger to older");
        firstActivity.printSortedEmployeesByAge(employeeList);
    }

    //method for sorting employee list (salary more to less) and printing it out
    public void printSortedEmployeesBySalary(List<Employee> employeeList) {
        List<Employee> sortedList = employeeList.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .collect(Collectors.toList());
        sortedList.forEach(System.out::println);
    }

    //method for sorting employee list (name A to Z) and printing it out
    public void printSortedEmployeesByName(List<Employee> employeeList) {
        List<Employee> sortedList = employeeList.stream()
                .sorted(Comparator.comparing(Employee::getName))
                .collect(Collectors.toList());
        sortedList.forEach(System.out::println);
    }

    //method for sorting employee list (surname A to Z) and printing it out
    public void printSortedEmployeesBySurname(List<Employee> employeeList) {
        List<Employee> sortedList = employeeList.stream()
                .sorted(Comparator.comparing(Employee::getSurname))
                .collect(Collectors.toList());
        sortedList.forEach(System.out::println);
    }

    //method for sorting employee list (age from younger to older) and printing it out
    public void printSortedEmployeesByAge(List<Employee> employeeList) {
        List<Employee> sortedList = employeeList.stream()
                .sorted(Comparator.comparing(Employee::getAge))
                .collect(Collectors.toList());
        sortedList.forEach(System.out::println);
    }
}
