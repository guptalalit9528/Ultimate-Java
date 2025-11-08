package coreJava;

import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        System.out.println("welocome show the table");
        Scanner sc = new Scanner(System.in);
        System.out.println(" please enter number and show table:");
        int num=sc.nextInt();
        int j=1;

        while(j<=10){
            int table=num*j;
            System.out.println(num + "*" +j+"="+table);
            j++;
        }
    }
}
