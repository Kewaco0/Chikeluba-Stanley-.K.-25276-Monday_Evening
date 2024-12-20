package CompanyEmployeeHierarchy;

class Developer extends Employee {
    private String programmingLanguage;

    public Developer(int id, String name, String department, String programmingLanguage) {
        super(id, name, department);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void work() {
        System.out.println(name + " is coding in " + programmingLanguage + ".");
    }

    @Override
    public double calculateSalary() {
        return 4000; // Example calculation
    }
}