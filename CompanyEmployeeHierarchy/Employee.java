package CompanyEmployeeHierarchy;

class Employee {
    protected int id;
    protected String name;
    protected String department;

    public Employee(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    public void work() {
        System.out.println(name + " is working.");
    }

    public void takeBreak() {
        System.out.println(name + " is taking a break.");
    }

    public double calculateSalary() {
        return 0.0; // Base implementation
    }
}