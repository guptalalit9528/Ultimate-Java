package coreJava;

public class Parameter {
    public static void main(String[] args) {
        int num = twosum(4, 6);
        System.out.println(num);
        int num2=twosum(3,4);
        System.out.println(num2);
    }

    public static int twosum(int first, int second){
            System.out.println("firste number received:"+first);
            System.out.println("second number received:"+second);
            int sum=first+second;
            int total=first+second;
            return sum;
        }
    }
