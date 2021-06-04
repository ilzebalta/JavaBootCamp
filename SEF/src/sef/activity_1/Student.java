package sef.activity_1;

public class Student extends Person {
    //attributes
    private String university;

    //default constructor
    public Student() {
    }

    //constructor
    public Student(String name, int age, String university) {
        super(name, age);
        this.university = university;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    //method
    public String studyIn() {
        String message = "I study in university " + university + ".";
        return message;
    }
}
