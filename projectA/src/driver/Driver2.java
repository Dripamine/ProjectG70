package driver;

import airplanes.Airplane;
import helicopters.Helicopter;
import helicopters.Quadcopter;
import multirotor.Multirotor;
import uav.AgriculturalDrone;
import uav.MAV;
import uav.UAV;

public class Driver2 {
    public static void main(String[] args) {
        // Create an array of flying objects
        Object[] flyingObjects = {
                new Airplane("Boeing", 1000000.0, 500),
                new Helicopter("Bell", 500000.0, 300, 6, 2020, 4),
                new Quadcopter("DJI", 2000.0, 100, 4, 2022, 2, 50),
                new Multirotor("Parrot", 1500.0, 80, 6, 2021, 3, 8),
                new UAV(10.0, 1000.0),
                new AgriculturalDrone(50.0, 5000.0, "Agridrones", 10),
                new MAV(2.0, 200.0, "ModelX", 0.5),
                new Airplane("Airbus", 1500000.0, 600),
                new Helicopter("Robinson", 400000.0, 250, 4, 2019, 2),
                new Quadcopter("Yuneec", 1800.0, 90, 6, 2023, 3, 40),
                new Multirotor("Diatone", 1200.0, 70, 8, 2022, 4, 12),
                new UAV(15.0, 1200.0),
                new AgriculturalDrone(60.0, 5500.0, "FarmersChoice", 12),
                new MAV(1.5, 180.0, "ModelY", 0.4),
                new Airplane("Embraer", 2000000.0, 700),
                new Helicopter("Robinson", 600000.0, 400, 4, 2022, 6),
                new Quadcopter("Yuneec", 2500.0, 120, 8, 2023, 4, 60),
                new Multirotor("Diatone", 1800.0, 100, 10, 2021, 5, 16),
                new Airplane("Cessna", 1500000.0, 550),
                new Helicopter("Sikorsky", 900000.0, 350, 6, 2020, 4)
        };

        // Call copyFlyingObjects() method to create a copy of the array
        Object[] copiedObjects = copyFlyingObjects(flyingObjects);

        // Display the original and copied arrays
        System.out.println("Original Objects:");
        displayObjects(flyingObjects);

        System.out.println("\nCopied Objects:");
        displayObjects(copiedObjects);
    }

    public static Object[] copyFlyingObjects(Object[] objects) {
        Object[] copiedObjects = new Object[objects.length];// Create a new array to store copied objects

        for (int i = 0; i < objects.length; i++) {	// Iterate through the objects array
            if (objects[i] instanceof Airplane) {		// Check the type of each object				
                Airplane airplane = (Airplane) objects[i]; // Cast the object to the corresponding class and create a new object using the copy constructor
                copiedObjects[i] = new Airplane(airplane);	// Assign the new object to the corresponding index in the copiedObjects array
            } else if (objects[i] instanceof Helicopter) {
                Helicopter helicopter = (Helicopter) objects[i];
                copiedObjects[i] = new Helicopter(helicopter);
            } else if (objects[i] instanceof Quadcopter) {
                Quadcopter quadcopter = (Quadcopter) objects[i];
                copiedObjects[i] = new Quadcopter(quadcopter);
            } else if (objects[i] instanceof Multirotor) {
                Multirotor multirotor = (Multirotor) objects[i];
                copiedObjects[i] = new Multirotor(multirotor);
            } else if (objects[i] instanceof UAV) {
                UAV uav = (UAV) objects[i];
                copiedObjects[i] = new UAV(uav);
            } else if (objects[i] instanceof AgriculturalDrone) {
                AgriculturalDrone agriculturalDrone = (AgriculturalDrone) objects[i];
                copiedObjects[i] = new AgriculturalDrone(agriculturalDrone);
            } else if (objects[i] instanceof MAV) {
                MAV mav = (MAV) objects[i];
                copiedObjects[i] = new MAV(mav);
            }
        }

        return copiedObjects;	// Return the copiedObjects array
    }

    public static void displayObjects(Object[] objects) { // Iterate through the objects array and display each object
        for (Object obj : objects) {
            System.out.println(obj);
        }
    }
}


