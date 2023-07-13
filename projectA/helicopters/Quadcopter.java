package helicopters;

public class Quadcopter extends Helicopter {
    private int maxFlyingSpeed;

    public Quadcopter() {
        // Default constructor
        super();
        maxFlyingSpeed = 0;
    }

    public Quadcopter(String brand, double price, int horsepower, int numberOfCylinders, int creationYear,
                      int passengerCapacity, int maxFlyingSpeed) {
        // Constructor with parameters
        super(brand, price, horsepower, numberOfCylinders, creationYear, passengerCapacity);
        this.maxFlyingSpeed = maxFlyingSpeed;
    }

    public Quadcopter(Quadcopter quadcopter) {
        // Copy constructor
        super(quadcopter);
        this.maxFlyingSpeed = quadcopter.maxFlyingSpeed;
    }

    // Getters and setters
    public int getMaxFlyingSpeed() {
        return maxFlyingSpeed;
    }

    public void setMaxFlyingSpeed(int maxFlyingSpeed) {
        this.maxFlyingSpeed = maxFlyingSpeed;
    }

    // toString() method
    
    public String toString() {
        return "Quadcopter [maxFlyingSpeed=" + maxFlyingSpeed + ", " + super.toString() + "]";
    }

    // equals() method
    
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        if (!super.equals(obj))
            return false;
        Quadcopter quadcopter = (Quadcopter) obj;
        return maxFlyingSpeed == quadcopter.maxFlyingSpeed;
    }
}

