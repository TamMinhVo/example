package citynow.uit.tamvm.model;

import java.util.Scanner;

public class InformalStaff extends Staff {
    private int numberOfWorkDay;

    public InformalStaff() {
        super();
        this.numberOfWorkDay = 0;
    }
    public InformalStaff(String name, String date, String address, int numberOfWorkDay) {
        super(name, date, address);
        this.numberOfWorkDay = numberOfWorkDay;
    }
    public InformalStaff(InformalStaff staff) {
        super(staff);
        this.numberOfWorkDay = staff.numberOfWorkDay;
    }
    public int getNumberOfWorkDay() {
        return numberOfWorkDay;
    }
    public void setNumberOfWorkDay(int numberOfWorkDay) {
        this.numberOfWorkDay = numberOfWorkDay;
    }
    @Override
    public String toString() {
        return "InformalStaff{" + super.toString() +
                ", numberOfWorkDay='" + this.numberOfWorkDay +
                "'}";
    }
    @Override
    public double Salary() {
        return this.getNumberOfWorkDay()  * 50000;
    }
    @Override
    public void InputStaff(){
        super.InputStaff();
        System.out.print("Enter number of work day of staff: ");
        Scanner scanner = new Scanner(System.in);
        this.numberOfWorkDay = scanner.nextInt();
    }
    @Override
    public void OutputStaff(){
        super.OutputStaff();
        // function OutputStaff in class Staff is print "this"
    }
}
