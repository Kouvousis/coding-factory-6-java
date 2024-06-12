package gr.aueb.cf.ch16.defultmethods;

public class CodingFactory implements IWelcome{
    @Override
    public void saySomething(String message) {
        System.out.println("Hello world!");
    }

    @Override
    public void sayHelloCoding() {
        IWelcome.super.sayHelloCoding();
        System.out.println("\u2764".repeat(5));
    }
}
