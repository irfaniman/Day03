package myapp.core;

public class Main {
    
    public static void main (String[] args) {
        // Instantiate a car
        Car myCar = new car();
        myCar.setColour("red");
        //myCar.colour = "red";
        //myCar.make = "honda";
        //myCar.engineCapacity = 2000;

        myCar.start();
        System.out.printf("The colour of my cas is %s\n", myCar.getColour);

        myCar.colour = "blue";
        System.out.printf("I have changed colour of my car to %s\n", myCar.getColour);

        // Instantiate another car
        Car yourCar = new car();
        yourCar.colour = "yellow";
        yourCar.make = "Toyota";
        yourCar.engineCapacity = "2500";

        System.out.printf("The engine capacity of my car is %d\n," yourCar.getEngineCapacity());

        //yourCar.stop();

        Car myThirdCar = new Car("silver", "Subaru");
        
    }
}
