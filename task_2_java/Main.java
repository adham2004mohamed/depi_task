import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Vehicle> vehicles = new ArrayList();

        while (true) {
            System.out.println("\nVehicle Management System:");
            System.out.println("1. Add a Car");
            System.out.println("2. Add a Bike");
            System.out.println("3. Operations");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 : {
                    System.out.print("Enter Car Brand: ");
                    String carBrand = scanner.nextLine();
                    System.out.print("Enter Car Color: ");
                    String carColor = scanner.nextLine();
                    System.out.print("Enter Seating Capacity: ");
                    int seating = scanner.nextInt();
                    scanner.nextLine();


                    Vehicle car = new Car(carBrand, carColor, seating);
                    vehicles.add(car);
                    System.out.println("Car added successfully....");
                    break;
                }
                case 2 : {
                    System.out.print("Enter Bike Brand: ");
                    String bikeBrand = scanner.nextLine();
                    System.out.print("Enter Bike Color: ");
                    String bikeColor = scanner.nextLine();
                    System.out.print("Enter Number of Wheels: ");
                    int wheelsNum = scanner.nextInt();
                    scanner.nextLine();

                    Vehicle bike = new Bike(bikeBrand, bikeColor, wheelsNum);
                    vehicles.add(bike);
                    System.out.println("Bike added successfully!");
                    break;
                }
                case 3 : {
                    if (vehicles.isEmpty()) {
                        System.out.println("No vehicles added yet.");
                    } else {
                        int carNum=0;
                        int bikeNum=0;
                        for (int i = 0; i < vehicles.size(); i++) {

                            if( vehicles.get(i) instanceof Car)
                            {

                                System.out.println((i + 1) + ". " + "Car "+ (++carNum));
                            }
                            else
                            {
                                System.out.println((i + 1) + ". " + "Bike"+ (++bikeNum));

                            }
                        }

                        System.out.print("\nChoose a vehicle number to do operations on it: ");
                        int vehicleIndex = scanner.nextInt() - 1;

                        if (vehicleIndex >= 0 && vehicleIndex < vehicles.size()) {
                            Vehicle selectedVehicle = vehicles.get(vehicleIndex);

                            System.out.println("\nWhat do you want to do?");
                            System.out.println("1. Display Details");
                            System.out.println("2. Start Engine");
                            if (selectedVehicle instanceof Car) {
                                System.out.println("3. Charge Battery");
                            }
                            System.out.print("Choose an action: ");
                            int action = scanner.nextInt();

                            switch (action) {
                                case 1 : {
                                    selectedVehicle.displayDetails();
                                    break;
                                }
                                case 2 : {
                                    selectedVehicle.startEngine();
                                    break;
                                }
                                case 3 :{
                                    if (selectedVehicle instanceof Car) {
                                        ((Car) selectedVehicle).chargeBattery();
                                    } else {
                                        System.out.println("This vehicle does not support charging.");
                                    }
                                    break;
                                }
                                default : System.out.println("Invalid action!");
                            }
                        } else {
                            System.out.println("Invalid vehicle number!");
                        }
                    }
                    break;

                }
                case 4: {
                    System.out.println("Exiting the system. Goodbye!");
                    scanner.close();
                    return;
                }
                default : System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
