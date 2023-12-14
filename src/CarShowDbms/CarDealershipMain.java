package CarShowDbms;
import java.util.Scanner;

public class CarDealershipMain {

    public static void main(String[] args) {
        CarManager carManager = new CarManager();
        Employee employee = new Employee(0, "first", "last", "position", 0.0);
        Customer customerManager = new Customer(0, "first", "last", 0770, "mail");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Car Management");
            System.out.println("2. Employee Management");
            System.out.println("3. Customer Management");
            System.out.println("4. View Inventory");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    carManager.manageCars(carManager,scanner);
                    break;
                case 2:
                    employee.manageEmployees(employee,scanner);
                    break;
                case 3:
                    customerManager.manageCustomers(customerManager,scanner);
                    break;
                case 4:
                    carManager.displayAllCars();
                    break;
                case 5:
                    System.out.println("Exiting the program. Thank you!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
