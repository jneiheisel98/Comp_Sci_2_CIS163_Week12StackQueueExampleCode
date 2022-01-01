package week12;

public class NodeE<E> {
    public E data;
    public NodeE next;

    public NodeE(E data, NodeE next) {
        this.data = data;
        this.next = next;
    }

    public NodeE() {
        super();
    }

    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }
    public NodeE getNext() {
        return next;
    }
    public void setNext(NodeE next) {
        this.next = next;
    }
}
