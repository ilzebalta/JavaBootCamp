package sef.module7.activity;

public class DrivingActivity {

    public static void main(String arg[]) {
        Moving motorcycle = new Motorcycle();
        Moving car = new Car();

        Driver driver = new Driver("Ilze");

        driver.setDriversMoving(motorcycle);
        driver.driverStartsDriving();

        driver.setDriversMoving(car);
        driver.driverStartsDriving();

    }
}
