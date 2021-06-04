package sef.activity_1;

import junit.framework.TestCase;

public class StudentTest extends TestCase {

    protected Student student;

    protected void setUp() {
        student = new Student();
        student.setName("Ilze");
        student.setAge(30);
        student.setUniversity("Rigas Business School");
    }

    public void testStudyIn() {
        String result = student.studyIn();
        assertEquals("I study in university Rigas Business School.", result);
    }

    public void testStudentConstructor() {
        String name = "Ilze";
        int age = 30;
        String university = "Rigas Business School";

        student = new Student(name, age, university);

        assertEquals(name, student.getName());
        assertEquals(age, student.getAge());
        assertEquals(university, student.getUniversity());
    }
}