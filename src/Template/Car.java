package Template;

public abstract class Car {
    public abstract void drive();
    public abstract void stop();
    public abstract void wiper();

    public void turnOn(){
        System.out.println("시동 On");
    }

    public void turnOff(){
        System.out.println("시동 Off");
    }

    public void washCar(){

    }

    public final void run(){
        turnOn();
        drive();
        wiper();
        washCar();
        stop();
        turnOff();
    }
}
