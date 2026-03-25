package service;

import model.*;
import util.*;
import java.util.*;

public class VehicleService {
    private ArrayList <Vehicle> vehicles;

    public VehicleService()
    {
        vehicles = FileUtil.loadFile("data/vehicles.dat");
    }

    public void saveVehicles()
    {
        FileUtil.saveData("data/vehicles.dat", vehicles);
    }
    public Vehicle findVehicleById(String vehicleId)
    {
        for(Vehicle v : vehicles)
        {
            if(v.getVehicleId().equals(vehicleId))
                return v;
        }
        return null;
    }
    public void addVehicle(Vehicle vehicle)
    {
        vehicles.add(vehicle);
        FileUtil.saveData("data/vehicles.dat", vehicles);
    }

    public ArrayList<Vehicle> getAllVehicles()
    {
        return vehicles;
    }
}
