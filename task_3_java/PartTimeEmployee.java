public class PartTimeEmployee extends Employee {
    private double priceForHour;
    private int hours;

    public PartTimeEmployee(String name, String id, double priceForHour, int hours) {
        super(name, id);
        this.priceForHour = priceForHour;
        this.hours = hours;
    }

    @Override
    public double calculateSalary() {
        return priceForHour * hours;
    }

    @Override
    public void generateReport() {
        System.out.println("Part-Time Employee Report:");
        System.out.println("Name: " + getName());
        System.out.println("ID: " + getId());
        System.out.println("Price For Hour: " + priceForHour);
        System.out.println("Hours Worked: " + hours);
        System.out.println("Total Salary: " + calculateSalary());
    }
}