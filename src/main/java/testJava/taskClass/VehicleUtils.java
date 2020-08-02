package testJava.taskClass;

import java.util.ArrayList;

public class VehicleUtils extends Vehicle {

    //____Task 7____

    public VehicleUtils(String Brand, String dateManufactured, String maxSpeed) {
        super(Brand, dateManufactured, maxSpeed);
    }

    private void vehicleDataPrinter() {
        System.out.println("Brand: " + getBrand());
        System.out.println("Date manufactured: " + getdateManufactured());
        System.out.println("Max speed: " + getmaxSpeed());
    }

    //____Task 8 & 9____

    public static void actionsWithVehicles() {
        //Vehicle addVehicle = new Vehicle("Nissan", "01.01.1990", "90");
        ArrayList<Vehicle> vehicleItems = new ArrayList<Vehicle>();

        vehicleItems.add(new Vehicle("Lada", "01.01.0001", "10"));
        vehicleItems.add(new Vehicle("Tesla", "01.01.0001", "100"));
        vehicleItems.add(new Vehicle("Jeep", "11.02.2013", "120"));
        vehicleItems.add(new Vehicle("Ford", "31.11.0001", "100"));


    //____Task 11 & 12____

        System.out.println("Vechile items: ");
        for (Vehicle str : vehicleItems){
            System.out.println(vehicleItems);
        }

    //____Task 10____

        System.out.println("Count of items in array list : " + vehicleItems.size());
    }
}
