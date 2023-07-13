package driver;
import airplanes.Airplane;
import helicopters.Helicopter;
import helicopters.Quadcopter;
import multirotor.Multirotor;
import uav.AgriculturalDrone;
import uav.MAV;
import uav.UAV;

public class Driver {
    public static void main(String[] args) {
        // Create objects from each class
        Airplane airplane1 = new Airplane("Boeing", 1000000.0, 500);
        Helicopter helicopter1 = new Helicopter("Bell", 500000.0, 300, 6, 2020, 4);
        Quadcopter quadcopter1 = new Quadcopter("DJI", 2000.0, 100, 4, 2022, 2, 50);
        Multirotor multirotor1 = new Multirotor("Parrot", 1500.0, 80, 6, 2021, 3, 8);
        UAV uav1 = new UAV(10.0, 1000.0);
        AgriculturalDrone agriculturalDrone1 = new AgriculturalDrone(50.0, 5000.0, "Agridrones", 10);
        MAV mav1 = new MAV(2.0, 200.0, "ModelX", 0.5);
        Airplane airplane2 = new Airplane("Airbus", 1500000.0, 600);
        Helicopter helicopter2 = new Helicopter("Robinson", 400000.0, 250, 4, 2019, 2);
        Quadcopter quadcopter2 = new Quadcopter("Yuneec", 1800.0, 90, 6, 2023, 3, 40);
        Multirotor multirotor2 = new Multirotor("Diatone", 1200.0, 70, 8, 2022, 4, 12);
        UAV uav2 = new UAV(15.0, 1200.0);
        AgriculturalDrone agriculturalDrone2 = new AgriculturalDrone(60.0, 5500.0, "FarmersChoice", 12);
        MAV mav2 = new MAV(1.5, 180.0, "ModelY", 0.4);
        Airplane airplane3 = new Airplane("Cessna", 800000.0, 400);
        Helicopter helicopter3 = new Helicopter("Sikorsky", 600000.0, 350, 6, 2021, 3);
        Airplane airplane4 = new Airplane("Embraer", 1200000.0, 550);
        Airplane airplane5 = new Airplane("Embraer", 2000000.0, 700);
        Helicopter helicopter4 = new Helicopter("Robinson", 600000.0, 400, 4, 2022, 6);
        Quadcopter quadcopter3 = new Quadcopter("Yuneec", 2500.0, 120, 8, 2023, 4, 60);
        Multirotor multirotor3 = new Multirotor("Diatone", 1800.0, 100, 10, 2021, 5, 16);
        Airplane airplane6 = new Airplane("Cessna", 1500000.0, 550);

        
        // Create arrays with 15 objects
        Object[] array1 = { airplane1, helicopter1, quadcopter1, multirotor1, uav1, agriculturalDrone1, mav1,
                            airplane2, helicopter2, quadcopter2, multirotor2, uav2, agriculturalDrone2, mav2,
                            airplane5};
        
        Object[] array2 = { airplane1, helicopter1, quadcopter1, multirotor1, helicopter2, airplane2,
                            quadcopter2,helicopter3,
                            airplane4,airplane5,helicopter4,quadcopter3,airplane3,multirotor3,airplane6 };

        // Call findLeastAndMostExpensiveUAV() with array1
        System.out.println("Array 1:");
        findLeastAndMostExpensiveUAV(array1);

        // Call findLeastAndMostExpensiveUAV() with array2
        System.out.println("Array 2:");
        findLeastAndMostExpensiveUAV(array2);
    }

    public static void findLeastAndMostExpensiveUAV(Object[] objects) {
    	 // Initialize variables for least and most expensive UAVs
        double leastPrice = Double.MAX_VALUE;
        double mostPrice = Double.MIN_VALUE;
        UAV leastExpensiveUAV = null;
        UAV mostExpensiveUAV = null;
        // Iterate through the objects
        for (Object obj : objects) {
            if (obj instanceof UAV) {	// Check if the object is of type UAV
                UAV uav = (UAV) obj; 	// Cast the object to UAV type
                if (uav.getPrice() < leastPrice) {	// Check if the price of the UAV is the least expensive
                    leastPrice = uav.getPrice();
                    leastExpensiveUAV = uav;	// Update leastPrice and leastExpensiveUAV
                }
                if (uav.getPrice() > mostPrice) {	// Check if the price of the UAV is the most expensive
                    mostPrice = uav.getPrice();
                    mostExpensiveUAV = uav;	// Update mostPrice and mostExpensiveUAV
                }
            }
        }

        System.out.println("Least Expensive UAV:");  // Display the least and most expensive UAVs
        if (leastExpensiveUAV != null) {// Check if the least expensive UAV exists
            System.out.println(leastExpensiveUAV); // Display the least expensive UAV
        } else {
            System.out.println("No UAVs found.");  // Otherwise, display that no UAVs were found as the least expensive
        }

        System.out.println("Most Expensive UAV:");   // Check if the most expensive UAV exists
        if (mostExpensiveUAV != null) {
            System.out.println(mostExpensiveUAV); // Display the most expensive UAV
        } else {
            System.out.println("No UAVs found.");// Otherwise, display that no UAVs were found as the most expensive
        }
    }
}

