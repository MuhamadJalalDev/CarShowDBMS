
package CarShowDbms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Employee {
    private List<Employee> employees;
    private int employeeID;
    private String firstName;
    private String lastName;
    private String position;
    private double salary;
    
    
    

    public Employee(int employeeID, String firstName, String lastName, String position, double salary) {
        this.employeeID = employeeID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.salary = salary;
        this.employees = new ArrayList<>();
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    
    

    public void addEmployee(Employee employee) {
        employees.add(employee);
        System.out.println("Employee added successfully!");
    }

    public void removeEmployee(int employeeID) {
        employees.removeIf(employee -> employee.getEmployeeID() == employeeID);
        System.out.println("Employee removed successfully!");
    }

    public void displayAllEmployees() {
        for (Employee employee : employees) {
            System.out.println("Employee ID: " + employee.getEmployeeID());
            System.out.println("Name: " + employee.getFirstName() + " " + employee.getLastName());
            System.out.println("Position: " + employee.getPosition());
            System.out.println("Salary: " + employee.getSalary());
            System.out.println("------------------------");
        }
    }
   
    public void manageEmployees(Employee employeeManager, Scanner scanner) {
    while (true) {
        System.out.println("Employee Management:");
        System.out.println("1. Add Employee");
        System.out.println("2. Remove Employee");
        System.out.println("3. View All Employees");
        System.out.println("4. Go Back");

        System.out.print("Enter your choice: ");
        int employeeChoice = scanner.nextInt();
        scanner.nextLine(); 

        switch (employeeChoice) {
            case 1:
               
                System.out.print("Enter Employee ID: ");
                int employeeID = scanner.nextInt();
                scanner.nextLine(); 

                System.out.print("Enter First Name: ");
                String firstName = scanner.nextLine();

                System.out.print("Enter Last Name: ");
                String lastName = scanner.nextLine();

                System.out.print("Enter Position: ");
                String position = scanner.nextLine();

                System.out.print("Enter Salary: ");
                double salary = scanner.nextDouble();
                scanner.nextLine(); 

                Employee employee = new Employee(employeeID, firstName, lastName, position, salary);
                employeeManager.addEmployee(employee);
                break;
            case 2:
                System.out.print("Enter the Employee ID to remove: ");
                int removeEmployeeID = scanner.nextInt();
                employeeManager.removeEmployee(removeEmployeeID);
                break;
            case 3:
                employeeManager.displayAllEmployees();
                break;
            case 4:
                return; 
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }
}

}