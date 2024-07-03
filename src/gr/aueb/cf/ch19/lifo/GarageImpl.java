package gr.aueb.cf.ch19.lifo;

import gr.aueb.cf.ch19.lifo.exceptions.GarageIsEmptyException;
import gr.aueb.cf.ch19.lifo.exceptions.GarageIsFullException;

public class GarageImpl implements IGarage {
    // Dependency Injection
    private IStorage<String> storage;
    private int length = 0;

    public GarageImpl(IStorage<String> storage) {
        this.storage = storage;
    }


    @Override
    public void addCar(String car) throws GarageIsFullException {
        try {
            if (isFull()) throw new GarageIsFullException("Is Full");
            storage.push(car);
            length++;
            // logging
        } catch (GarageIsFullException e) {
            // logging
            throw e;
        }
    }

    @Override
    public String removeCar() throws GarageIsEmptyException {
        try {
            if (isEmpty()) throw new GarageIsEmptyException("Is Empty");
            // logging
            length--;
            return storage.pop();
        } catch (GarageIsEmptyException e) {
            //logging
            throw e;
        }
    }

    @Override
    public String[] getCars() {
        return storage.toArray(new String[0]);
    }

    @Override
    public void printCars() {
        storage.printItems();
    }

    @Override
    public boolean isFull() {
        return length == storage.getSize();
    }

    @Override
    public boolean isEmpty() {
        return storage.isEmpty();
    }
}
