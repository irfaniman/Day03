package myapp.core;

public class Car implements Controllable {

    // properties, members
    private String colour;
    private String make;
    private Integer engineCapacity;
    private Boolean started = false;
    private long startedSince;

    public Car() {
        System.out.println("*** Instantiating Car Object");
        this.colour = "red";
    }

    public Car(Integer capacity) {
        this.engineCapacity= capacity;
    }
    public void setColour(String c) {
        this.colour = c;
    }

    public String getColour() {
        return this.colour;
    }

    public void setEngineCapacity (Integer capacity) {
        this.engineCapacity = capacity;
    }

    public Integer getEngineCapacity() {
        return this.engineCapacity;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public Boolean isStarted() {
        return started;
    }

    public void setStarted(Boolean started) {
        this.started = started;
    }

    public long getDrivingDuration () {
        if (isStarted())
            // convert to ms -> sec
            return(System.currentTimeMillis() = this.startedSince) / 1000;
        return -1l; // or can use (long)-1;
    }

    // behaviour - methods
    public void start() {
        if (this.started) {
            System.out.println("Your car is running");
        } else {
            System.out.println("Vroom....");
            this.started = true;
            //  Since 0000 Jan 1 1970
            this.startedSince = System.currentTimeMillis();
        }
    }

    public void stop() {
        if (!this.started) {
            System.out.println("Your car is not running");
        } else {
            System.out.println("Splutter splutter stop.....");
            this.started = false;
        }
    }
}