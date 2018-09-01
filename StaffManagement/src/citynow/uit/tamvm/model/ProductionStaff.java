package citynow.uit.tamvm.model;

import java.util.Scanner;

public class ProductionStaff extends Staff{
    private int numberOfProduct;

    public ProductionStaff(){
        super();
        this.numberOfProduct = 0;
    }
    public ProductionStaff(String name, String date, String address, int numberOfProduct) {
        super(name, date, address);
        this.numberOfProduct = numberOfProduct;
    }
    public ProductionStaff(ProductionStaff productionStaff) {
        super(productionStaff);
        this.numberOfProduct = productionStaff.numberOfProduct;
    }
    public int getNumberOfProduct() {
        return numberOfProduct;
    }
    public void setNumberOfProduct(int numberOfProduct) {
        this.numberOfProduct = numberOfProduct;
    }
    @Override
    public String toString() {
        return "ProductionStaff{" + super.toString() +
                ", numberOfProduct='" + this.numberOfProduct +
                "\'}";
    }
    @Override
    public void InputStaff(){
        super.InputStaff();
        System.out.print("Enter number of product of staff: ");
        Scanner scanner = new Scanner(System.in);
        this.numberOfProduct = scanner.nextInt();
    }
    @Override
    public void OutputStaff(){
        super.OutputStaff();
        // function OutputStaff in class Staff is print "this"
    }
    @Override
    public double Salary() {
        return this.getNumberOfProduct() * 20000;
    }
}
