package uav;

public class AgriculturalDrone extends UAV {
    private String brand;
    private int carryCapacity;

    public AgriculturalDrone() {
        // Default constructor
        super();
        brand = "Unknown";
        carryCapacity = 0;
    }

    public AgriculturalDrone(double weight, double price, String brand, int carryCapacity) {
        // Constructor with parameters
        super(weight, price);
        this.brand = brand;
        this.carryCapacity = carryCapacity;
    }

    public AgriculturalDrone(AgriculturalDrone agriculturalDrone) {
        // Copy constructor
        super(agriculturalDrone);
        this.brand = agriculturalDrone.brand;
        this.carryCapacity = agriculturalDrone.carryCapacity;
    }

    // Getters and setters
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getCarryCapacity() {
        return carryCapacity;
    }

    public void setCarryCapacity(int carryCapacity) {
        this.carryCapacity = carryCapacity;
    }

    // toString() method
   
    public String toString() {
        return "AgriculturalDrone [brand=" + brand + ", carryCapacity=" + carryCapacity + ", " + super.toString() + "]";
    }

    // equals() method
    
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        if (!super.equals(obj))
            return false;
        AgriculturalDrone agriculturalDrone = (AgriculturalDrone) obj;
        return brand.equals(agriculturalDrone.brand) && carryCapacity == agriculturalDrone.carryCapacity;
    }
}
