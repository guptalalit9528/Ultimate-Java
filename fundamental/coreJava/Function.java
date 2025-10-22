package coreJava;

public class Function {
    public static void main(String[] args) {
        System.out.println("this is main method");
        gretting();
        System.out.println("method calling complete");
    }
        public static void gretting () {
            int rows = 0;
            while (rows < 10) {
                System.out.print("*");
                int i = 0;
                while (i < rows) {
                    System.out.print(" *");
                    i++;
                }
                System.out.println();
                rows++;
            }
        }


}
