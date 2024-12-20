package CompanyEmployeeHierarchy;

class Manager extends Employee {
    private int teamSize;
    private double bonus;

    public Manager(int id, String name, String department, int teamSize, double bonus) {
        super(id, name, department);
        this.teamSize = teamSize;
        this.bonus = bonus;
    }

    @Override
    public void work() {
        System.out.println(name + " is managing a team of " + teamSize + " members.");
    }

    @Override
    public double calculateSalary() {
        return 5000 + bonus; // Example calculation
    }
}