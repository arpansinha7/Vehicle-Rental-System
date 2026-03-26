import model.*;
import service.*;
import java.util.*;

public class Main{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        UserService userService = new UserService();
        VehicleService vehicleService = new VehicleService();
        BookingService bookingService = new BookingService();

        User currentUser = null;

        while(true)
        {
            System.out.println("\n---VEHICLE RENTAL SYSTEM---");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. View Vehicles");
            System.out.println("4. Book Vehicle");
            System.out.println("5. View Bookings");
            System.out.println("6. Logout");;
            System.out.println("7. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch(choice)
            {
                case 1 -> 
                {
                    System.out.print("Enter Name : ");
                    String name = sc.nextLine();

                    System.out.print("Enter E-Mail: ");
                    String email = sc.nextLine();

                    System.out.print("Enter password : ");
                    String password = sc.nextLine();

                    String userId = "U" + System.currentTimeMillis();
                    User user = new User(userId, name, email, password);
                    userService.registerUser(user);

                    System.out.println("User Registered Successfully");
                }

                case 2 ->
                {
                    System.out.print("Enter E-Mail : ");
                    String email = sc.nextLine();

                    System.out.print("Enter password : ");
                    String password = sc.nextLine();

                    currentUser = userService.loginUser(email, password);

                    if(currentUser != null)
                    {
                        System.out.println("Login Successful!");
                    }
                    else
                    {
                        System.out.println("Invalid Credentials!");
                    }
                }

                case 3 ->
                {
                    ArrayList <Vehicle> vehicles = vehicleService.getAllVehicles();

                    System.out.println("\n---Vehicles---");

                    for(int i=0;i<vehicles.size();i++)
                    {
                        String status = vehicles.get(i).isAvailable() ? "Available" : "Not Available";

                        System.out.println((i+1) + ". " + vehicles.get(i).getVehicleName() + " - $" + vehicles.get(i).getPricePerDay() + " | " + status);
                    }

                }

                case 4 ->
                {
                    if(currentUser == null)
                    {
                        System.out.println("Please Login First");
                        break;
                    }

                    ArrayList <Vehicle> list = vehicleService.getAllVehicles();
                    
                    System.out.println("\n---Select Vehicle---");
                    int count = 1;
                    for(int i=0;i<list.size();i++)
                    {
                        if(list.get(i).isAvailable())
                        {
                        System.out.println(count + ". " + list.get(i).getVehicleName() + " - $" + list.get(i).getPricePerDay());
                        count++;
                        }
                    }

                    System.out.print("Enter choice: ");
                    int vChoice = sc.nextInt();

                    if(vChoice < 1 || vChoice > list.size())
                    {
                        System.out.println("Invalid Choice");
                        break;
                    }
                    System.out.print("Enter number of days: ");
                    int days = sc.nextInt();
                    if(days < 1)
                    {
                        System.out.println("Invalid Days");
                        break;
                    }

                    ArrayList<Vehicle> available = new ArrayList<>();

                    for(Vehicle v : list)
                    {
                        if(v.isAvailable())
                            available.add(v);
                    }

                    Vehicle selected = available.get(vChoice - 1);
                    
                    if(!selected.isAvailable())
                    {
                        System.out.println("Vehicle Not Available");
                        break;
                    }

                    bookingService.createBooking(currentUser.getUserId(), selected.getVehicleId(), days);
                    selected.setAvailability(false);
                    vehicleService.saveVehicles();;
                    System.out.println("Booking Successful!");
                }

                case 5 ->
                {
                    ArrayList <Booking> bookings = bookingService.getAllBookings();

                    System.out.println("\n---All Bookings---");
                    for(Booking b : bookings)
                    {
                        if(currentUser != null && b.getUserId().equals(currentUser.getUserId()))
                        {
                        System.out.println(b);
                        System.out.println("----------------------");
                        }
                    }
                }

                case 6 ->
                {
                    currentUser = null;
                    System.out.println("Logged out successfully");
                }
                case 7 ->
                {
                    System.out.println("Exiting....");
                    sc.close();
                    return;
                }

                default -> System.out.println("Invalid Choice");
            }

        }
        
    }
}