package Oops;

public class PerameterConstructors {
        String color;
        int speed;

        PerameterConstructors(String color, int carSpeed){
            this.color=color;
            speed = carSpeed;
        }



    public static void main(String[] args) {
           PerameterConstructors odi=new PerameterConstructors("red",200);
            System.out.println("perameter constructor hai--------------------------------------------------------------");
            System.out.println(odi.color);
            System.out.println(odi.speed);

        }
    }

