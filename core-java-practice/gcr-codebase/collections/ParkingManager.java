import java.util.*;

public class ParkingManager {

    static ArrayList<String> vehicles = new ArrayList<>();

    static void enterVehicle(String number) {
        vehicles.add(number);
        System.out.println("Vehicle Entered");
    }

    static void exitVehicle(String number) {
        if (vehicles.remove(number))
            System.out.println("Vehicle Exited");
        else
            System.out.println("Vehicle Not Found");
    }

    static void searchVehicle(String number) {
        if (vehicles.contains(number))
            System.out.println("Vehicle is Parked");
        else
            System.out.println("Vehicle Not Parked");
    }

    static void display() {
        System.out.println("Parked Vehicles:");

        for (String v : vehicles)
            System.out.println(v);

        System.out.println("Occupied Slots = " + vehicles.size());
    }

    public static void main(String[] args) {

        enterVehicle("PB10AB1234");
        enterVehicle("DL09XY5678");
        enterVehicle("HR20CD1111");

        display();

        searchVehicle("DL09XY5678");

        exitVehicle("PB10AB1234");

        display();
    }
}