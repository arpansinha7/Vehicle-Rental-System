package model;
import java.io.*;
public class Vehicle implements Serializable {
    
    private String id;
    private double pricePerDay;
    private String vehicleName;
    private String type;
    private boolean isAvailable;

    public Vehicle(String id, String vehicleName, String type, double pricePerDay)
    {
        this.id = id;
        this.pricePerDay = pricePerDay;
        this.vehicleName = vehicleName;
        this.type = type;
        isAvailable = true;

    }

    public String getVehicleId()
    {
        return id;
    }
    public double getPricePerDay()
    {
        return pricePerDay;
    }
    public String getVehicleName()
    {
        return vehicleName;
    }
    public String getVehicleType()
    {
        return type;
    }
    public boolean isAvailable()
    {
        return isAvailable;
    }
    public void setAvailability(boolean status)
    {
        this.isAvailable = status;
    }

}
