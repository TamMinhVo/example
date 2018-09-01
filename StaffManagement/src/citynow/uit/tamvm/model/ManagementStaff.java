package citynow.uit.tamvm.model;

import java.util.Scanner;

public class ManagementStaff extends Staff {
    private int basicSalary;
    private double coefficientSalary;

    public ManagementStaff(){
        super();
        this.basicSalary = 0;
        this.coefficientSalary=0;
    }
    public ManagementStaff(String name, String date, String address, int basicSalary, double coefficientSalary) {
        super(name, date, address);
        this.basicSalary = basicSalary;
        this.coefficientSalary = coefficientSalary;
    }
    public ManagementStaff(ManagementStaff managementStaff) {
        super(managementStaff);
        this.basicSalary = managementStaff.basicSalary;
        this.coefficientSalary = managementStaff.coefficientSalary;
    }
    public int getBasicSalary() {
        return basicSalary;
    }
    public void setBasicSalary(int basicSalary) {
        this.basicSalary = basicSalary;
    }
    public double getCoefficientSalary() {
        return coefficientSalary;
    }
    public void setCoefficientSalary(int coefficientSalary) {
        this.coefficientSalary = coefficientSalary;
    }
    @Override
    public String toString() {
        return "ManagementStaff{" +super.toString() +
                ", basicSalary='" + basicSalary +
                "', coefficientSalary=" + coefficientSalary +
                "'}";
    }
    @Override
    public double Salary() {
        return this.getBasicSalary() * this.getCoefficientSalary();
    }
    @Override
    public void InputStaff() {
        super.InputStaff();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter basicSalary of staff: ");
        this.basicSalary = scanner.nextInt();
        System.out.print("Enter coefficientSalary of staff: ");
        this.coefficientSalary = scanner.nextDouble();
    }
    @Override
    public void OutputStaff() {
        super.OutputStaff();
        // function OutputStaff in class Staff is print "this"
    }
}
