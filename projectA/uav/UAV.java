package uav;

public class UAV {
    private double weight;
    private double price;

    public UAV() {
        // Default constructor
        weight = 0.0;
        price = 0.0;
    }

    public UAV(double weight, double price) {
        // Constructor with parameters
        this.weight = weight;
        this.price = price;
    }

    public UAV(UAV uav) {
        // Copy constructor
        this.weight = uav.weight;
        this.price = uav.price;
    }

    // Getters and setters
    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // toString() method
    
    public String toString() {
        return "UAV [weight=" + weight + ", price=" + price + "]";
    }

    // equals() method
    
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        UAV uav = (UAV) obj;
        return Double.compare(uav.weight, weight) == 0 && Double.compare(uav.price, price) == 0;
    }
}
