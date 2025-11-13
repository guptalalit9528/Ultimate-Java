package advance.Generics;

public class ClassM {
    public static void main(String[] args) {
        ClassBox<String> b1=new ClassBox<>();
        b1.set("Hello Generic");
        System.out.println(b1.get());

        ClassBox<Integer> b2 = new ClassBox<>();
        b2.set(34);
        System.out.println(b2.get());


    }
}
