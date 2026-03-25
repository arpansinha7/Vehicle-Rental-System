import model.*;
import service.*;
import java.util.*;

public class Admin {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        VehicleService vehicleService = new VehicleService();

        while(true)
        {
            System.out.println("\n---Admin Panel---");
            System.out.println("1. Add Vehicle");
            System.out.println("2. View Vehicles");
            System.out.println("3. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch(choice)
            {
                case 1 ->
                {
                    System.out.print("Enter vehicle name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Vehicle Type (Car / Bike): ");
                    String type = sc.nextLine();

                    System.out.print("Enter price per day: ");
                    double price = sc.nextDouble();
                    sc.nextLine();

                    String vehicleId = "V" + System.currentTimeMillis();

                    Vehicle vehicle = new Vehicle(vehicleId, name, type, price);
                    vehicleService.addVehicle(vehicle);

                    System.out.println("Vehicle Added Successfully!");
                }

                case 2 ->
                {
                    System.out.println("\n---All Vehicles----");

                    for(Vehicle v : vehicleService.getAllVehicles())
                    {
                        System.out.println(v.getVehicleId() + " | " + v.getVehicleName() + " - $" + v.getPricePerDay());

                    }
                }
                case 3 -> 
                {
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                }

                default -> System.out.println("Invalid Input");

            }

        }
    }
}
