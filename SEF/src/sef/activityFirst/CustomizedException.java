package sef.activityFirst;

public class CustomizedException extends Exception {

    public String getMessage() {
        String message = "Name must contain only letters";
        return message;
    }
}
