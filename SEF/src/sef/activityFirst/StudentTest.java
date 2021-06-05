package sef.activityFirst;

import junit.framework.TestCase;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class StudentTest extends TestCase {

    protected Student student;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    protected void setUp() throws CustomizedException {
        student = new Student();
        student.setName("Ilze");
        student.setAge(30);
        student.setUniversity("Rigas Business School");
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    public void testStudyIn() {
        student.studyIn();
        assertEquals("I study in university Rigas Business School.", outputStreamCaptor.toString().trim());
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