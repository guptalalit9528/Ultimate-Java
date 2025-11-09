package Oops;

public class ConstructorChaining {

    String name;
    int umar;

    ConstructorChaining() {
        this("Gopal", 32);
        System.out.println("Default Constructor");
    }

    ConstructorChaining(String name, int umar) {
        this.name = name;
        this.umar = umar;
        System.out.println("parameterize constructor:" + name + " " + umar);
    }

    public static void main(String[] args) {
        ConstructorChaining s3 = new ConstructorChaining();
    }
}

