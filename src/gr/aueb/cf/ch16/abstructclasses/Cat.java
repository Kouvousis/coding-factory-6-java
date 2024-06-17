package gr.aueb.cf.ch16.abstructclasses;

public class Cat extends Animal {

    public Cat() {

    }

    public Cat(int id, String name) {
        super(id, name);
    }

    @Override
    public void speak() {
        System.out.println("Cat is speaking.");
    }

    @Override
    public void eat() {
        System.out.println("Cat is eating.");
    }

    @Override
    public String toString() {
        return "id: " + getId() + ", name: " + getName();
    }
}
