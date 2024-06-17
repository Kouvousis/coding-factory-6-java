package gr.aueb.cf.ch16.vechicle;

public class Car implements IVechicle {

    @Override
    public void start() {
        System.out.println("Engine started.");
    }

    @Override
    public void stop() {
        System.out.println("Engine stopped.");
    }
}
