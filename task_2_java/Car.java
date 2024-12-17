public class Car extends Vehicle{
    private int seating;

    public Car(String brand,String color, int seating) {
        super(brand,color);
        this.seating = seating;
    }

    @Override
    public void startEngine() {
        System.out.println("Car Starting...");
    }

    public void chargeBattery() {
        System.out.println("Car Charging...");
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Seating Capacity: " + seating);
    }
}

