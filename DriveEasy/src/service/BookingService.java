package service;
import model.*;
import java.util.*;
import util.*;

public class BookingService {

    private ArrayList<Booking> bookings;

    public BookingService()
    {
        bookings = FileUtil.loadFile("data/bookings.dat");
    }

    
    public void createBooking(String userId, String vehicleId, int days)
    {
       String bookingId = "B" + System.currentTimeMillis();

       VehicleService vehicleService = new VehicleService();
       Vehicle vehicle = vehicleService.findVehicleById(vehicleId);

       Booking booking = new Booking(bookingId, userId, vehicleId, days, vehicle.getPricePerDay());

       bookings.add(booking);
       FileUtil.saveData("data/bookings.dat", bookings);
    }

    public ArrayList<Booking> getAllBookings()
    {
        return bookings;
    }
}