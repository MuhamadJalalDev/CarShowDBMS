
package CarShowDbms;


public class Van extends Car {
    private double cargoCapacity;
    private boolean slidingDoor;

    public Van(String make, String model, String color, double price, double shippingFee, int year,
              double cargoCapacity, boolean slidingDoor) {
        super(make, model, color, price, shippingFee, year);
        this.cargoCapacity = cargoCapacity;
        this.slidingDoor = slidingDoor;
    }

    public double getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(double cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    public boolean getSlidingDoor() {
        return slidingDoor;
    }

    public void setSlidingDoor(boolean slidingDoor) {
        this.slidingDoor = slidingDoor;
    }

    @Override
public void displayCarDetails() {
    System.out.println("-------------------------------------------------------------------------------------------------------------------");
    System.out.println("ID\t\tMake\t\tModel\t\tColor\t\tPrice\t\tShipping Fee\t\tYear\t\tCargo Capacity\tSliding Door");
    System.out.println("____________________________________________________________________________________________________________________");
    System.out.println(getVin() + "\t\t" + getMake() + "\t\t" + getModel() + "\t\t" +
            getColor() + "\t\t" + getPrice() + "\t\t" + getShippingFee() + "\t\t\t" + getYear() +
            "\t\t\t" + getCargoCapacity() + "\t\t\t" + getSlidingDoor());
    System.out.println("------------------------");
}

}
