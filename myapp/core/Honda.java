package myapp.core;

public class Honda extends Car {

    public Honda() {
        this.setMake("honda");
    }

    public void accelerate() {
        System.out.println("Accelerating...");

    }
    
    public void stop() {
        System.out.println("Stopping...Stopped");
    }
}
