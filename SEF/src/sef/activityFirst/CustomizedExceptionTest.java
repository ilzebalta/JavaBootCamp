package sef.activityFirst;

import junit.framework.TestCase;

public class CustomizedExceptionTest extends TestCase {

    protected CustomizedException customizedException;

    protected void setUp() {
        customizedException = new CustomizedException();
    }

    public void testGetMessage() {
        String expectedMessage = "Name must contain only letters";
        String actualMessage = customizedException.getMessage();

        assertEquals(expectedMessage, actualMessage);
    }
}
