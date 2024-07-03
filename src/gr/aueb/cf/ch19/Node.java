package gr.aueb.cf.ch19;

/**
 * Defines a class {@link Node} with
 * only one int field.
 */
public class Node {
    private int item;

    public Node() {
    }

    public Node(int item) {
        this.item = item;
    }

    public int getItem() {
        return item;
    }

    public void setItem(int item) {
        this.item = item;
    }
}
