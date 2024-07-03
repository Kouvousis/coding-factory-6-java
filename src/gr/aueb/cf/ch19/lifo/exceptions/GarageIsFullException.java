package gr.aueb.cf.ch19.lifo.exceptions;

public class GarageIsFullException extends Exception {
    private final static long serialVersionUID = 1L;

    public GarageIsFullException(String s) {
        super(s);
    }
}
