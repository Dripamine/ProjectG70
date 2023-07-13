package multirotor;

import helicopters.Helicopter;

public class Multirotor extends Helicopter {
    private int numberOfRotors;

    public Multirotor() {
        // Default constructor
        super();
        numberOfRotors = 0;
    }

    public Multirotor(String brand, double price, int horsepower, int numberOfCylinders, int creationYear,
                      int passengerCapacity, int numberOfRotors) {
        // Constructor with parameters
        super(brand, price, horsepower, numberOfCylinders, creationYear, passengerCapacity);
        this.numberOfRotors = numberOfRotors;
    }

    public Multirotor(Multirotor multirotor) {
        // Copy constructor
        super(multirotor);
        this.numberOfRotors = multirotor.numberOfRotors;
    }

    // Getters and setters
    public int getNumberOfRotors() {
        return numberOfRotors;
    }

    public void setNumberOfRotors(int numberOfRotors) {
        this.numberOfRotors = numberOfRotors;
    }

    // toString() method
    
    public String toString() {
        return "Multirotor [numberOfRotors=" + numberOfRotors + ", " + super.toString() + "]";
    }

    // equals() method
    
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        if (!super.equals(obj))
            return false;
        Multirotor multirotor = (Multirotor) obj;
        return numberOfRotors == multirotor.numberOfRotors;
    }
}
