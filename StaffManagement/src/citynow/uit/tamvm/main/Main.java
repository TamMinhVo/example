package citynow.uit.tamvm.main;

import citynow.uit.tamvm.model.ProductionStaff;
import citynow.uit.tamvm.model.Staff;
import citynow.uit.tamvm.model.StaffManager;


public class Main {

    public static void main(String[] args) {
        StaffManager staffManager = new StaffManager();
        staffManager.InputStaffManager();
        staffManager.OutputStaffManager();
        double d = staffManager.Salary();
        System.out.format("Total salary: %,.2f%n" , d);
    }
}
