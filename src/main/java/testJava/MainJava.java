package testJava;

import testJava.taskClass.Vehicle;
import testJava.taskClass.VehicleUtils;
import static testJava.taskClass.VehicleUtils.actionsWithVehicles;

public class MainJava {
    public static void main(String [] args) throws Exception{
        //new Vehicle("BMW", "20.20.2020", "200");
        //new VehicleUtils("Audi", "11.11.2011", "100");

        actionsWithVehicles();

//        System.out.println(Vehicle.Brand);
//        System.out.println(Vehicle.dateManufactured);
//        System.out.println(Vehicle.maxSpeed);

    }
}
