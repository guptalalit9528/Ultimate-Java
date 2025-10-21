package coreJava;

import java.util.Scanner;

public class ArrSearch {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int[] arr={1,2,3,4,5,6,7,8,9,0,12};
        System.out.println("welcome to the seaching");
        System.out.println("enter the numb =");
        int num=input.nextInt();
        boolean isFound= isFound(arr,num);
        if(isFound){
            System.out.println("your number was found in the array");
        }else{
            System.out.println("your number was not found in the array");
        }
    }
    public static boolean isFound(int[] arr,int num){
       int index=0;
       while(index<arr.length){
           if(arr[index]==num){
               return true;
           }
           index++;
       }
        return false;
    }
}
