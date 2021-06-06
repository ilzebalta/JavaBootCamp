package sef.activityFirst;

public class Student extends Person {
    //attributes
    private String university;

    //default constructor
    public Student() {
    }

    //constructor
    public Student(String name, String surname, int age, String university) {
        super(name, surname, age);
        this.university = university;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    //method
    public void studyIn() {
        System.out.println("I study in university " + university + ".");
    }
}
