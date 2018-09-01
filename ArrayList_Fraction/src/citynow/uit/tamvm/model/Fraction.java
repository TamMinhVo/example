package citynow.uit.tamvm.model;

import java.util.Scanner;

public class Fraction {
    private int numerator;
    private int denominator;

    public int getNumerator() {
        return numerator;
    }
    public void setNumerator(int numerator){
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }
    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public Fraction(){
        this.numerator=1;
        this.denominator=1;
    }

    public Fraction(int numerator, int denominator){
        this.numerator=numerator;
        this.denominator=denominator;
    }
    public Fraction(Fraction ps){
        this.numerator = ps.numerator;
        this.denominator = ps.denominator;
    }

    @Override
    public String toString() {
        return this.numerator + "/" + this.denominator;
    }

    public void FractionInput(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter numerator: ");
        this.numerator = scanner.nextInt();

        System.out.print("Enter denominator: ");
        this.denominator = scanner.nextInt();
    }

    public void FractionOutput(){
        System.out.println(this.toString());
    }
}
