package Oops;

public class Procedural {
    static int age = 50;


    public static void main(String[] args) {
        int num = 3;
        int a = 4;
        int b = 8;
        int wage = calculate(num, a, b);
        System.out.println(wage);
        System.out.println(age);
    }

    public static int calculate(int num, int a, int b) {
        System.out.println(age);
        return num + (a * b);

    }
}
