package sef.activityFirst;

import org.w3c.dom.css.CSSUnknownRule;

public class Person {
    //attributes
    private String name;
    private String surname;
    private int age;


    //default constructor
    public Person() {
    }

    //constructor
    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    //getter&setters
    public String getName() {
        return name;
    }

    public void setName(String name) throws CustomizedException {
        if (hasDigits(name)) {
          throw new CustomizedException();
        } else {
            this.name = name;
        }
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) throws CustomizedException {
        if (hasDigits(surname)) {
            throw new CustomizedException();
        } else {
            this.surname = surname;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //method
    public void introduceYourself() throws CustomizedException{
        if (!hasDigits(name)) {
            System.out.println("My name is " + name + " " + surname + " and I am " + age + " years old.");
        } else {
            throw new CustomizedException();
        }
    }
    //method
    private static boolean hasDigits(String name) {
        boolean hasDigits = false;

        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);

            if (Character.isDigit(ch)) {
                hasDigits = true;
            }
        }
        return hasDigits;
    }
}
