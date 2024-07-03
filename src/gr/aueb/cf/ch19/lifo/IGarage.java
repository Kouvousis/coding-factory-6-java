package gr.aueb.cf.ch19.lifo;

import gr.aueb.cf.ch19.lifo.exceptions.GarageIsEmptyException;
import gr.aueb.cf.ch19.lifo.exceptions.GarageIsFullException;

public interface IGarage {
    void addCar(String car) throws GarageIsFullException;
    String removeCar() throws GarageIsEmptyException;
    String[] getCars();
    void printCars();
    boolean isFull();
    boolean isEmpty();
}
