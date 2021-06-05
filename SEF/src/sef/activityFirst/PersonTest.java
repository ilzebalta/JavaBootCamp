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

    public void testIntroduceYourself() {
        person.introduceYourself();
        assertEquals("My name is Ilze and I am 30 years old.", outputStreamCaptor.toString().trim());
    }
}
