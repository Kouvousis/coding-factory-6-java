package gr.aueb.cf.ch19.dll;

public class DoublyLinkedList<T> {
    private Node<T> head;
    private Node<T> tail;

    public DoublyLinkedList(){
        head = tail = null;
    }

    /**
     *
     * @param t
     */
    public void insertFront(T t) {
        // Create and populate
        Node<T> tmp = new Node<>();
        tmp.setValue(t);
        tmp.setNext(head);
        tmp.setPrev(null);

        // Head, Tail, next node config
        head = tmp;
        if (tmp.getNext() == null) {
            tail = tmp;
        } else {
            tmp.getNext().setPrev(tmp);
        }
    }

    /**
     *
     * @param t
     */
    public void insertEnd(T t) {
        Node<T> tmp = new Node<>();
        tmp.setValue(t);
        tmp.setPrev(tail);
        tmp.setNext(null);


        tail = tmp;
        if (tmp.getPrev() == null) {
            head = tmp;
        } else {
            tmp.getPrev().setNext(tmp);
        }
    }

    public void deleteFront() {
        if (isEmpty()) return;

        // if the list contains only one node
        if (head.getNext() == null) {
            head = tail = null;
        } else {
            head = head.getNext();
            head.setPrev(null);
        }
    }

    public void deleteEnd() {
        if (isEmpty()) return;

        if (tail.getPrev() == null) {
            tail = head = null;
        } else {
            tail = tail.getPrev();
            tail.setNext(null);
        }
    }

    /**
     *  Time complexity O(n)
     * @param t
     * @return
     */
    public Node<T> get(T t) {
        for (Node<T> n = head; n != null; n = n.getNext()) {
            if (n.getValue().equals(t)) {
                return n;
            }
        }
        return null;
    }

    public void traverse() {
        for (Node<T> n = head; n != null; n = n.getNext()) {
            System.out.println(n);
        }
    }

    public boolean isEmpty() {
        return head == null;
    }
}
