public class FullTimeEmployee extends Employee {
    private double salary;


    public FullTimeEmployee(String name, String id, double salary) {
        super(name, id);
        this.salary = salary;
    }

    @Override
    public double calculateSalary() {
        return salary ;
    }

    @Override
    public void generateReport() {
        System.out.println("Full-Time Employee Report:");
        System.out.println("Name: " + getName());
        System.out.println("ID: " + getId());
        System.out.println("Basic Salary: " + salary);
        System.out.println("Total Salary: " + calculateSalary());
    }
}
