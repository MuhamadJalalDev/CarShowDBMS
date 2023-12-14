
package CarShowDbms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class CarManager {
    private final List<Car> cars;

    public CarManager() {
        this.cars = new ArrayList<>();
    }

    public void addCar(Car car) {
        cars.add(car);
        System.out.println("Car added successfully!");
    }

    public void deleteCar(int vin) {
    boolean removed = cars.removeIf(car -> car.getVin() == vin);

    if (removed) {
        System.out.println("Car deleted successfully!");
    } else {
        System.out.println("Car not found with ID: " + vin);
    }
}


    public void displayAllCars() {
    for (int i = 0; i < cars.size(); i++) {
        cars.get(i).displayCarDetails();
    }
}

public Car findCarByVin(int vin) {
    for (int i = 0; i < cars.size(); i++) {
        Car car = cars.get(i);
        if (car.getVin() == vin) {
            return car;
        }
    }
    return null;
}



    public void searchCars(String attribute, String value) {
    for (int i = 0; i < cars.size(); i++) {
        Car car = cars.get(i);

        switch (attribute) {
            case "make":
                if (car.getMake().equals(value)) {
                    car.displayCarDetails();
                }
                break;
            case "model":
                if (car.getModel().equals(value)) {
                    car.displayCarDetails();
                }
                break;
            case "color":
                if (car.getColor().equals(value)) {
                    car.displayCarDetails();
                }
                break;
            case "year":
                if (String.valueOf(car.getYear()).equals(value)) {
                    car.displayCarDetails();
                }
                break;
            case "vin":
                if (String.valueOf(car.getVin()).equals(value)) {
                    car.displayCarDetails();
                }
                break;
            default:
                System.out.println("Invalid search attribute: " + attribute);
        }
    }
 }
    public void manageCars(CarManager carManager, Scanner scanner) {
    Car c1 = null;  
    

    while (true) {
        System.out.println("Car Management:");
        System.out.println("1. Add Car");
        System.out.println("2. Delete Car");
        System.out.println("3. View All Cars");
        System.out.println("4. Search Cars");
        System.out.println("5. Update Car");
        System.out.println("6. Go Back");

        System.out.print("Enter your choice: ");
        int carChoice = scanner.nextInt();
        scanner.nextLine(); 

        switch (carChoice) {
            case 1:
                c1 = new Car();
                c1.addCarFromUserInput(carManager, scanner);
                break;
            case 2:
                if (c1 != null) {
                    c1.deleteCarFromUserInput(carManager, scanner);
                } else {
                    System.out.println("Please add a car first.");
                }
                break;
            case 3:
                carManager.displayAllCars();
                break;
            case 4:
                if (c1 != null) {
                    c1.searchCarsFromUserInput(carManager, scanner);
                } else {
                    System.out.println("Please add a car first.");
                }
                break;
            case 5:
                if (c1 != null) {
                    c1.updateCarFromUserInput(carManager, scanner);
                } else {
                    System.out.println("Please add a car first.");
                }
                break;
            case 6:
                return; 
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }
}
    
}