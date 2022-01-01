package week12;

public class StackLL<E> {
    private NodeE<E> top;

    public StackLL(){
        top = null;
    }

    public void push (int data) {   // add to top
        top = new NodeE(data, null);
    }

    public E pop () {            // remove from top
        E temp = top.getData();
        top = top.getNext();
        return temp;
    }

    public boolean empty() {
        return false;
    }

    public static void main (String[] args) {

        StackLL s1 = new StackLL();
        s1.push(10);
        s1.push(20);
        s1.push(30);
        System.out.println (s1.pop());
        s1.push(40);
        System.out.println (s1.pop());
    }
}
