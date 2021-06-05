package sef.activityFirst;

public class Person {
    //attributes
    private String name;
    private int age;

    //default constructor
    public Person() {
    }

    //constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //getter&setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //method
    public void introduceYourself() {
        System.out.println("My name is " + name + " and I am " + age + " years old.");
    }
}
