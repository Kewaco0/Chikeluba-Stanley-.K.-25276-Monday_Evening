package CompanyEmployeeHierarchy;

// Main class
public class Main {
    public static void main(String[] args) {
        Employee manager = new Manager(1, "Alice", "Management", 10, 2000);
        Employee developer = new Developer(2, "Bob", "Development", "Java");
        Employee intern = new Intern(3, "Charlie", "HR", 6);
        Employee contractor = new Contractor(4, "Diana", "Finance", 160, 50);

        Employee[] employees = {manager, developer, intern, contractor};

        for (Employee employee : employees) {
            employee.work();
            employee.takeBreak();
            System.out.println("Salary: $" + employee.calculateSalary());
            System.out.println();
        }
    }
}