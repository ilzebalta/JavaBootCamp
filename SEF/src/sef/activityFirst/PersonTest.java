package sef.activityFirst;

import junit.framework.TestCase;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class PersonTest extends TestCase {

    protected Person person;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    String name = "Ilze";
    int age = 30;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        person = new Person();
        person.setName(name);
        person.setAge(age);
        System.setOut(new PrintStream(outputStreamCaptor));

    }

    public void testIntroduceYourself() throws CustomizedException {
        person.introduceYourself();
        assertEquals("My name is Ilze and I am 30 years old.", outputStreamCaptor.toString().trim());
    }

    public void testIntroduceYourselfThrowsException() throws CustomizedException {
        try {
            String name = "Ilze123";
            int age = 30;
            person = new Person(name, age);
            person.introduceYourself();
            fail();
        } catch (CustomizedException e) {
            assertEquals("Name must contain only letters", e.getMessage());
        }
    }

    public void testSetNameThrowsException() {
        try {
            String name = "Ilze123";
            person.setName(name);
        } catch (CustomizedException e) {
            assertEquals("Name must contain only letters", e.getMessage());
        }
    }
}
