package CompanyEmployeeHierarchy;

class Intern extends Employee {
    private int duration; // in months

    public Intern(int id, String name, String department, int duration) {
        super(id, name, department);
        this.duration = duration;
    }

    @Override
    public void work() {
        System.out.println(name + " is in training for " + duration + " months.");
    }

    @Override
    public void takeBreak() {
        System.out.println(name + " is taking a short break (restricted to 15 minutes).");
    }

    @Override
    public double calculateSalary() {
        return 1000; // Example calculation
    }
}