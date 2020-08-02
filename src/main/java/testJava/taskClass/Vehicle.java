package testJava.taskClass;

public class Vehicle {

    //____Task 5____

    public static String Brand;
    public static String dateManufactured;
    public static String maxSpeed;

    public Vehicle(String brand,
                   String dateManufactured,
                   String maxSpeed) {
        Vehicle.Brand = brand;
        Vehicle.dateManufactured = dateManufactured;
        Vehicle.maxSpeed = maxSpeed;
    }

    public String getBrand() { return Brand; }
    public String getdateManufactured() { return dateManufactured; }
    public String getmaxSpeed() { return maxSpeed; }

}
