package com.example.ProblemSet2;

/**
 * Created by t00194492 on 28/09/2017.
 */
public class Fraction {
    private int numerator;
    private int denominator;

    public void setNumerator(int numerator)
    {
        this.numerator = numerator;
    }//End of setNumerator

    public int getNumerator()
    {
        return numerator;
    }//End of getNumerator

    public void setDenominator(int denominator)
    {
        this.denominator = denominator;
    }//End of setDenominator

    public int getDenominator()
    {
        return denominator;
    }//End of getDenominator

    public Fraction()
    {
        this(0,1);
    }//End of Fraction default

    public Fraction(int numerator, int denominator)
    {
        setNumerator(numerator);
        setDenominator(denominator);
    }//End of Fraction

    public String toString()
    {
        return String.format("%-5s", numerator+"/"+denominator);
    }//End of toString

    public Fraction addFractions(Fraction f1, Fraction f2)
    {
        int numerator, denominator;

        numerator = (f1.getNumerator()*f2.getDenominator()) + (f2.getNumerator()* f1.getDenominator());
        denominator = f1.getDenominator()*f2.getDenominator();

        Fraction fAns = new Fraction(numerator, denominator);

        return  fAns;
    }//End of addFractions

    public Fraction subtractFractions(Fraction f1, Fraction f2)
    {
        int numerator, denominator;

        numerator = (f1.getNumerator()*f2.getDenominator()) - (f2.getNumerator()* f1.getDenominator());
        denominator = f1.getDenominator()*f2.getDenominator();

        Fraction fAns = new Fraction(numerator, denominator);

        return  fAns;
    }//End of subtractFractions

    public Fraction multiplyFractions(Fraction f1, Fraction f2)
    {
        int numerator, denominator;

        numerator = f1.getNumerator() * f2.getNumerator();
        denominator = f1.getDenominator() * f2.getDenominator();

        Fraction fAns = new Fraction(numerator, denominator);

        return  fAns;
    }//End of multiplyFractions

    public Fraction divideFractions(Fraction f1, Fraction f2)
    {
        int numerator, denominator;

        numerator = f1.getNumerator() * f2.getDenominator();
        denominator = f1.getDenominator() * f2.getNumerator();

        Fraction fAns = new Fraction(numerator, denominator);

        return  fAns;
    }//End of divideFractions
}//End of Fraction Class
