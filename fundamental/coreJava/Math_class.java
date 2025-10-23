package coreJava;

public class Math_class {
    public static void main(String[] args) {
        int a=Math.max(1,3);
        System.out.println("a"+a);

        int b=Math.min(1,4);
        System.out.println("b"+b);

        int c=Math.round(1.1F);
        System.out.println("c"+c);

        int d=(int)Math.ceil(1.1F);
        System.out.println("d"+d);

        int e=(int)Math.floor(1.1F);
        System.out.println("e"+e);

        int f=(int)Math.random()*100;
        System.out.println("f"+f);

        double g=(int)Math.random()*100;
        System.out.println("g"+g);

        int h=(int)Math.round(Math.random()*100);
        System.out.println("h"+h);

    }
}
