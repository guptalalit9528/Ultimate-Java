package coreJava;

import java.text.NumberFormat;

public class Formatting_Number {
    public static void main(String[] args) {
        NumberFormat Currency=NumberFormat.getCurrencyInstance();
        String result= Currency.format(132437486.85473);
        System.out.println(result);
        NumberFormat percent=NumberFormat.getPercentInstance();
        String out= percent.format(0.1);
        System.out.println(out);
    }
}
