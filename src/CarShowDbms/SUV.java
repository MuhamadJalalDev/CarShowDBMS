
package CarShowDbms;


public class SUV extends Car {
    private boolean offRoadCapability;
    private int seatingCapacity;

    public SUV(String make, String model, String color, double price, double shippingFee, int year,
               boolean offRoadCapability, int seatingCapacity) {
        super(make, model, color, price, shippingFee, year);
        this.offRoadCapability = offRoadCapability;
        this.seatingCapacity = seatingCapacity;
    }

    public boolean getOffRoadCapability() {
        return offRoadCapability;
    }

    public void setOffRoadCapability(boolean offRoadCapability) {
        this.offRoadCapability = offRoadCapability;
    }

    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    public void setSeatingCapacity(int seatingCapacity) {
        this.seatingCapacity = seatingCapacity;
    }

   @Override
public void displayCarDetails() {
    System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------");
    System.out.println("ID\t\tMake\t\tModel\t\tColor\t\tPrice\t\tShipping Fee\t\tYear\t\tOff-Road Capability\tSeating Capacity");
    System.out.println("__________________________________________________________________________________________________________________________________________");
    System.out.println(getVin() + "\t\t" + getMake() + "\t\t" + getModel() + "\t\t" +
            getColor() + "\t\t" + getPrice() + "\t\t" + getShippingFee() + "\t\t\t" + getYear() +
            "\t\t\t" + getOffRoadCapability() + "\t\t\t" + getSeatingCapacity());
    System.out.println("------------------------");
}

}