package model;
import java.io.*;
public class Booking implements Serializable {
    
    private String bookingId;
    private String userId;
    private String vehicleId;
    private int daysCount;
    private double amount;

    public Booking(String bookingId, String userId, String vehicleId, int daysCount, double pricePerDay)
    {
        this.bookingId = bookingId;
        this.userId = userId;
        this.vehicleId = vehicleId;
        this.daysCount = daysCount;
        this.amount = daysCount * pricePerDay;
    }

    public String getBookingId()
    {
        return bookingId;
    }
    public String getUserId()
    {
        return userId;
    }
    public String getVehicleId()
    {
        return vehicleId;
    }
    public int getNumberOfDays()
    {
        return daysCount;
    }
    public double getAmount()
    {
        return amount;
    }

    public String toString()
    {
        return "Booking details :\n" + 
        "Booking id: " + bookingId + 
        "\nUser id: " + userId +
        "\nVehicle id: " + vehicleId +
        "\nDays: " + daysCount + 
        "\nTotal Amount: $" + amount;
    }
}
