public  abstract class Vehicle {
    private String brand;
    private String color;


    public Vehicle(String brand,String color) {
        this.brand = brand;
        this.color=color;

    }

    public void startEngine() {
        System.out.println("starting...");
    }

    public void displayDetails() {
        System.out.println("Brand: " + brand +"\n Color: "+color);
    }
}

