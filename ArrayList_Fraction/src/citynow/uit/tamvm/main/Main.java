package citynow.uit.tamvm.main;

import citynow.uit.tamvm.model.ArrayList_Fraction;
import citynow.uit.tamvm.model.Fraction;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList_Fraction arrayList_fraction = new ArrayList_Fraction();
        arrayList_fraction.ArrayListFractionInput();
        arrayList_fraction.ArrayListFractionOutput();
        arrayList_fraction.AddFractionIntoArrayList();
        arrayList_fraction.ArrayListFractionOutput();
        arrayList_fraction.AddFractionIntoArrayList(new Fraction(10,2));
        arrayList_fraction.ArrayListFractionOutput();
        System.out.print("Max fraction: ");
        arrayList_fraction.MaxFraction().FractionOutput();
        arrayList_fraction.UpdateAtIndex(0);
        arrayList_fraction.ArrayListFractionOutput();
        arrayList_fraction.UpdateAtIndex(1, new Fraction(10,2));
        arrayList_fraction.ArrayListFractionOutput();
        arrayList_fraction.RemoveAtIndex(0);
        arrayList_fraction.ArrayListFractionOutput();
        arrayList_fraction.ClearAll();
        arrayList_fraction.ArrayListFractionOutput();
    }
}
