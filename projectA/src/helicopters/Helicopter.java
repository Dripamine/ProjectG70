package helicopters;

import airplanes.Airplane;

public class Helicopter extends Airplane {
    private int numberOfCylinders;
    private int creationYear;
    private int passengerCapacity;

    public Helicopter() {
        // Default constructor 
    	super();
        numberOfCylinders = 0;
        creationYear = 0;
        passengerCapacity = 0;
    }

    public Helicopter(String brand, double price, int horsepower, int numberOfCylinders, int creationYear, int passengerCapacity) {
        // Constructor with parameters
        super(brand, price, horsepower);
        this.numberOfCylinders = numberOfCylinders;
        this.creationYear = creationYear;
        this.passengerCapacity = passengerCapacity;
    }

    public Helicopter(Helicopter helicopter) {
        // Copy constructor
        super(helicopter);
        this.numberOfCylinders = helicopter.numberOfCylinders;
        this.creationYear = helicopter.creationYear;
        this.passengerCapacity = helicopter.passengerCapacity;
    }

    // Getters and setters
    public int getNumberOfCylinders() {
        return numberOfCylinders;
    }

    public void setNumberOfCylinders(int numberOfCylinders) {
        this.numberOfCylinders = numberOfCylinders;
    }

    public int getCreationYear() {
        return creationYear;
    }

    public void setCreationYear(int creationYear) {
        this.creationYear = creationYear;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    // toString() method
    
    public String toString() {
        return "Helicopter [numberOfCylinders=" + numberOfCylinders + ", creationYear=" + creationYear +
                ", passengerCapacity=" + passengerCapacity + ", " + super.toString() + "]";
    }

    // equals() method
    
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        if (!super.equals(obj))
            return false;
        Helicopter helicopter = (Helicopter) obj;
        return numberOfCylinders == helicopter.numberOfCylinders &&
                creationYear == helicopter.creationYear &&
                passengerCapacity == helicopter.passengerCapacity;
    }
}
