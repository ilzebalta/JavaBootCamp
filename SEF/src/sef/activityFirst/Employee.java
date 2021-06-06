package sef.activityFirst;

public class Employee extends Person {
    // attributes
    private String jobTitle;
    private String company;
    private int salary;

    //default constructor
    public Employee() {
    }

    //constructor
    public Employee(String jobTitle, String company, int salary) {
        this.jobTitle = jobTitle;
        this.company = company;
        this.salary = salary;
    }

    //constructor
    public Employee(String name, String surname, int age, String jobTitle, String company, int salary) {
        super(name, surname, age);
        this.jobTitle = jobTitle;
        this.company = company;
        this.salary = salary;
    }

    //getters & setters
    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    //method
    public void workIn() {
        System.out.println("I work as " + jobTitle + " in " + company + ".");
    }

    //method for printing out employee list in readable way
    @Override
    public String toString() {
        String printToString = "Name: " + getName() + " " + getSurname() + " | age: " + getAge() + " | job title: " + getJobTitle()
                + " | company: " + company + " | salary: " + salary;
        return printToString;
    }
}
