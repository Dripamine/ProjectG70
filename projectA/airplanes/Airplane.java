package airplanes;

public class Airplane {
    private String brand;
    private double price;
    private int horsepower;

    public Airplane() {
        // Default constructor
        brand = "Unknown";
        price = 0.0;
        horsepower = 0;
    }

    public Airplane(String brand, double price, int horsepower) {
        // Constructor with parameters
        this.brand = brand;
        this.price = price;
        this.horsepower = horsepower;
    }

    public Airplane(Airplane airplane) {
        // Copy constructor
        this.brand = airplane.brand;
        this.price = airplane.price;
        this.horsepower = airplane.horsepower;
    }

    // Getters and setters
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    // toString() method
    
    public String toString() {
        return "Airplane [brand=" + brand + ", price=" + price + ", horsepower=" + horsepower + "]";
    }

    // equals() method
   
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Airplane airplane = (Airplane) obj;
        return Double.compare(airplane.price, price) == 0 &&
                horsepower == airplane.horsepower &&
                brand.equals(airplane.brand);
    }
}
