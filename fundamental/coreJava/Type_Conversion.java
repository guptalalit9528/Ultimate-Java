package coreJava;

public class Type_Conversion {
    public static void main(String[] args) {

        System.out.println("this is a implict casting--------------------------------");
        short x=1;
        int y=x+2;
        System.out.println(y);


        System.out.println("this is a explict casting-----------------------------");
        float a=1.1F;
        int b=(int)a+2;
        System.out.println(b);


        System.out.println("this is a explict casting---------------------------------");
        String e="1";
        int f=Integer.parseInt(e)+2;
        System.out.println(f);

    }
}
