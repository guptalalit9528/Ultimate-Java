package coreJava;

public class UnaryOperator {
    public static void main(String[] args) {
        int x=5;
        int y=-x;
        System.out.println("positive to negative change: "+y);

        int p=6;
        System.out.println("prefix:" + ++p);
        System.out.println("print:" + p);

        System.out.println("postfix:" + p++);
        System.out.println("print:" + p);

        System.out.println("------------------------");
        int a=8;
        System.out.println("prefix:" + --a);
        System.out.println("print:" + a);

        System.out.println("postfix:" + a--);
        System.out.println("print:" + a);
    }
}
