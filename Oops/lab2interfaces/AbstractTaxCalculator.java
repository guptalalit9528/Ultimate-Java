package Oops.lab2interfaces;

public abstract class AbstractTaxCalculator
    implements TaxCalculator{
        static double getTaxabaleIncome(double income,double expenses){
            return income-expenses;
        }
    }
