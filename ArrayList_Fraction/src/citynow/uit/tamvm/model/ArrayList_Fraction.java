package citynow.uit.tamvm.model;

import javax.xml.stream.FactoryConfigurationError;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_Fraction {
    private ArrayList<Fraction> fractionArrayList;

    public ArrayList_Fraction() {
        fractionArrayList = null;
    }

    public ArrayList_Fraction(ArrayList<Fraction> fractionArrayList) {
        this.fractionArrayList = fractionArrayList;
    }

    public ArrayList<Fraction> getFractionArrayList() {
        return fractionArrayList;
    }

    public void setFractionArrayList(ArrayList<Fraction> fractionArrayList) {
        this.fractionArrayList = fractionArrayList;
    }

    public void ArrayListFractionInput(){
        this.fractionArrayList = new ArrayList<Fraction>();
        byte choice = 0;
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("1. Input.\nOthers. Exit Input.");
            choice = scanner.nextByte();
            if(choice != 1)
                break;
            Fraction fraction = new Fraction();
            fraction.FractionInput();
            this.fractionArrayList.add(fraction);
        }
    }
    public void ArrayListFractionOutput(){
        System.out.println("---ArrayList Fraction Output---");
        for (Fraction f:
             this.fractionArrayList) {
            f.FractionOutput();
        }
    }
    public void AddFractionIntoArrayList(Fraction fraction){
        fractionArrayList.add(fraction);
    }
    public void AddFractionIntoArrayList(){
        Fraction fraction = new Fraction();
        fraction.FractionInput();
        this.fractionArrayList.add(fraction);
    }
    public void RemoveAtIndex(int index){
        if(index >= 0 && index < this.fractionArrayList.size()){
            this.fractionArrayList.remove(index);
        }
        else{
            System.out.println("Wrong index!");
        }
    }
    public void UpdateAtIndex(int index){
        if(index >= 0 && index < this.fractionArrayList.size()){
            Fraction fraction = new Fraction();
            fraction.FractionInput();
            this.fractionArrayList.set(index, fraction);
        }
        else{
            System.out.println("Wrong index!");
        }
    }
    public void UpdateAtIndex(int index, Fraction fraction){
        if(index >= 0 && index < this.fractionArrayList.size()){
            this.fractionArrayList.set(index, fraction);
        }
        else{
            System.out.println("Wrong index!");
        }
    }
    public Fraction MaxFraction(){
        double max = Double.MIN_VALUE;
        double temp = 0;
        Fraction fraction = new Fraction();

        for (Fraction f: this.fractionArrayList) {
            temp = f.getNumerator()* 1.0/f.getDenominator();
            if(temp > max){
                max = temp;
                fraction.setNumerator(f.getNumerator());
                fraction.setDenominator(f.getDenominator());
            }
        }
        return fraction;
    }
    public void ClearAll(){
        this.fractionArrayList.clear();
    }

}
