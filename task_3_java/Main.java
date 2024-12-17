import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Employee> employees = new ArrayList<>();

        while (true) {
            System.out.println("\nEmployee Management System:");
            System.out.println("1. Add Full-Time Employee");
            System.out.println("2. Add Part-Time Employee");
            System.out.println("3. Generate Reports");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1: {
                    System.out.print("Enter Full-Time Employee Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Employee ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Enter Salary: ");
                    double salary = scanner.nextDouble();
                    scanner.nextLine();

                    employees.add(new FullTimeEmployee(name, id, salary));
                    System.out.println("Full-Time Employee added successfully....");
                    break;
                }
                case 2: {
                    System.out.print("Enter Part-Time Employee Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Employee ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Enter Price for Hour: ");
                    double priceForHour = scanner.nextDouble();
                    System.out.print("Enter Hours Worked: ");
                    int hours = scanner.nextInt();
                    scanner.nextLine();

                    employees.add(new PartTimeEmployee(name, id, priceForHour, hours));
                    System.out.println("Part-Time Employee added successfully...");
                    break;
                }
                case 3:
                    if (employees.isEmpty()) {
                        System.out.println("No employees added yet.");
                    } else {
                        int fullTimeCount = 0;
                        int partTimeCount = 0;
                        for (int i = 0; i < employees.size(); i++) {
                            if (employees.get(i) instanceof FullTimeEmployee) {
                                System.out.println((i + 1) + ". Full-Time Employee " + (++fullTimeCount));
                            } else {
                                System.out.println((i + 1) + ". Part-Time Employee " + (++partTimeCount));
                            }
                        }

                        System.out.print("\nChoose an employee number to view their report: ");
                        int employeeIndex = scanner.nextInt() - 1;

                        if (employeeIndex >= 0 && employeeIndex < employees.size()) {
                            Employee selectedEmployee = employees.get(employeeIndex);
                            selectedEmployee.generateReport();
                        } else {
                            System.out.println("Invalid employee number!");
                        }
                    }
                    break;

                case 4:
                    System.out.println("Exiting the system. Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}