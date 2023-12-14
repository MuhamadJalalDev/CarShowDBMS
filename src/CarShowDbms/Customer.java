
package CarShowDbms;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Customer {
    private List<Customer> customers;
    private int customerID;
    private String firstName;
    private String lastName;
    private int phoneNumber;
    private String email;

    public Customer(int customerID, String firstName, String lastName, int phoneNumber, String email) {
        this.customerID = customerID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.customers = new ArrayList<>();
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
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

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public void addCustomer(Customer customer) {
        customers.add(customer);
        System.out.println("Customer added successfully!");
    }


    public void removeCustomer(int customerID) {
        customers.removeIf(customer -> customer.getCustomerID() == customerID);
        System.out.println("Customer removed successfully!");
    }

    public void displayAllCustomers() {
        for (Customer customer : customers) {
            System.out.println("Customer ID: " + customer.getCustomerID());
            System.out.println("Name: " + customer.getFirstName() + " " + customer.getLastName());
            System.out.println("Phone: " + customer.getPhoneNumber());
            System.out.println("Email: " + customer.getEmail());
            System.out.println("------------------------");
        }
    }
    
    
    public  void manageCustomers(Customer customerManager, Scanner scanner) {
    while (true) {
        System.out.println("Customer Management:");
        System.out.println("1. Add Customer");
        System.out.println("2. Remove Customer");
        System.out.println("3. View All Customers");
        System.out.println("4. Go Back");

        System.out.print("Enter your choice: ");
        int customerChoice = scanner.nextInt();
        scanner.nextLine();

        switch (customerChoice) {
            case 1:
                Customer customer = new Customer(0,"name","name",0,"email");
               
                System.out.print("Enter Customer ID: ");
                customer.setCustomerID(scanner.nextInt());
                scanner.nextLine(); 
                System.out.print("Enter First Name: ");
                customer.setFirstName(scanner.nextLine());
                System.out.print("Enter Last Name: ");
                customer.setLastName(scanner.nextLine());
                System.out.print("Enter Phone Number: ");
                customer.setPhoneNumber(scanner.nextInt());
                scanner.nextLine(); 
                System.out.print("Enter Email: ");
                customer.setEmail(scanner.nextLine());

                customerManager.addCustomer(customer);
                System.out.println("Customer added successfully!");
                break;
            case 2:
                System.out.print("Enter the Customer ID to remove: ");
                int customerID = scanner.nextInt();
                customerManager.removeCustomer(customerID);
                break;
            case 3:
                customerManager.displayAllCustomers();
                break;
            case 4:
                return;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }
}

}
