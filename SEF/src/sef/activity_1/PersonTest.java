package sef.activity_1;

import junit.framework.TestCase;

public class PersonTest extends TestCase {

    protected Person person;

    String name = "Ilze";
    int age = 30;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        person = new Person();
        person.setName(name);
        person.setAge(age);
    }

    public void testIntroduceYourself() {
        String result = person.introduceYourself();
        assertEquals("My name is Ilze and I am 30 years old.", result);
    }
}
