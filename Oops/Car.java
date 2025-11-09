package Oops;

public class Car {
    //attributes
//    int noOfWheels;
//    String color;
//    float maxSpeed;
//    int noOfSeats;
    float currentFueInLiters;

    //method
    public void start() {
        if (currentFueInLiters == 0) {
            System.out.println("car is out if fuel,can not start");
        } else if (currentFueInLiters < 5) {
            System.out.println("Car is in reserved mode ,please refule");
        } else {
            System.out.println("car is driving..bruhhhhh...");
        }
        {
            currentFueInLiters--;
            System.out.println("car is driving");
        }
    }
    public void addFuel(float currentfuelInLiters) {
       currentFueInLiters+=currentfuelInLiters;
    }
    public float getCurrentFuelLevel(){
        return currentFueInLiters;
    }
}
