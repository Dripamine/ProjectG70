package uav;

public class MAV extends UAV {
    private String model;
    private double size;

    public MAV() {
        // Default constructor
        super();
        model = "Unknown";
        size = 0.0;
    }

    public MAV(double weight, double price, String model, double size) {
        // Constructor with parameters
        super(weight, price);
        this.model = model;
        this.size = size;
    }

    public MAV(MAV mav) {
        // Copy constructor
        super(mav);
        this.model = mav.model;
        this.size = mav.size;
    }

    // Getters and setters
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    // toString() method
    
    public String toString() {
        return "MAV [model=" + model + ", size=" + size + ", " + super.toString() + "]";
    }

    // equals() method
    
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        if (!super.equals(obj))
            return false;
        MAV mav = (MAV) obj;
        return model.equals(mav.model) && Double.compare(mav.size, size) == 0;
    }
}