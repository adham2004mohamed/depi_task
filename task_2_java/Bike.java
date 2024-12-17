public class Bike extends Vehicle {
    private int wheelsNum;

    // Constructor
    public Bike(String brand, String color, int wheelsNum) {
        super(brand, color);
        this.wheelsNum = wheelsNum;
    }

    // Overriding the startEngine method
    @Override
    public void startEngine() {
        System.out.println("Bike Starting...");
    }

    // Display additional details
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Numoer Of Wheels : " +wheelsNum);
    }
}
