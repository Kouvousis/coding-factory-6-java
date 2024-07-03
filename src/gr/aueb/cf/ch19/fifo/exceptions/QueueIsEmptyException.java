package gr.aueb.cf.ch19.fifo.exceptions;

public class QueueIsEmptyException extends Exception {
    private final static long serialVersionUID = 1L;

    public QueueIsEmptyException(String s) {
        super(s);
    }
}
