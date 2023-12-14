
package CarShowDbms;


public class Sedan extends Car {
    private double trunkSize;

    public Sedan(String make, String model, String color, double price, double shippingFee, int year, double trunkSize) {
        super(make, model, color, price, shippingFee, year);
        this.trunkSize = trunkSize;
    }

    public double getTrunkSize() {
        return trunkSize;
    }

    public void setTrunkSize(double trunkSize) {
        this.trunkSize = trunkSize;
    }

    
@Override
public void displayCarDetails() {
    System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------");
    System.out.println("ID\t\tMake\t\tModel\t\tColor\t\tPrice\t\tShipping Fee\t\tYear\t\tTrunk Size");
    System.out.println("__________________________________________________________________________________________________________________________________________________");
    System.out.println(getVin() + "\t\t" + getMake() + "\t\t" + getModel() + "\t\t" +
            getColor() + "\t\t" + getPrice() + "\t\t" + getShippingFee() + "\t\t\t" + getYear() + "\t\t\t" + getTrunkSize());
    System.out.println("------------------------");
}


}