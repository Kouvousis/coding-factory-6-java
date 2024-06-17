package gr.aueb.cf.ch16.vechicle;

public class Motorcycle implements IVechicle{
    @Override
    public void start() {
        System.out.println("Motorcycle has started.");
    }

    @Override
    public void stop() {
        System.out.println("Motorcycle has stopped.");
    }
}
