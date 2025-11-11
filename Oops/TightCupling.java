package Oops;
class PetrolEngine{
    void start(){
        System.out.println("Petrol Engine Stating...");
    }
}
class Odi{
    PetrolEngine engine=new PetrolEngine();

    void drive(){
        engine.start();
        System.out.println("Car is Running...");
    }
}
public class TightCupling {
    public static void main(String[] args) {
        Odi sw =new Odi();
       sw.drive();
        //System.out.println(sw);
    }
}
