package CompanyEmployeeHierarchy;

class Contractor extends Employee {
    private int hoursWorked;
    private double hourlyRate;

    public Contractor(int id, String name, String department, int hoursWorked, double hourlyRate) {
        super(id, name, department);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public void work() {
        System.out.println(name + " is working as a contractor for " + hoursWorked + " hours.");
    }

    @Override
    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }
}