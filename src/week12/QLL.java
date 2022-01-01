package week12;


public class QLL<E> {
	private NodeE<E> front;
	private NodeE<E> back;

	public QLL() {
		front = null;
		back = null;
	}

	public E deQ() {   // remove from top
		if (front == null)
			throw new RuntimeException();
		
		E temp = front.getData();
		front = front.getNext();
		return temp;
	}

	public void enQ (int data) {   // Add to tail

		// no list... 
		if (front == null) {
			front = back  = new NodeE(data, null);
			return;
		}
		
		// list exist, adding at the end.
		back.setNext(new NodeE(data, null));
		back = back.getNext();

	}

	public int size () {
		return 0;
	}

}
