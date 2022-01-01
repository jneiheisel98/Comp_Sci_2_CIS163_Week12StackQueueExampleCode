package week12;

public class StackstartingCode {

	private int[] stack;
	private int top;

	public StackstartingCode(int size){
		stack = new int[size];
		top = 0;
	}

	public StackstartingCode() {
		stack = new int[100];
    }

	public void push (int data) {
		stack[top] =data;
		top++;
		}

	public int pop () {
		top--;
		return stack[top];
	}

	public boolean empty() {
        return top == 0;
	}

	public static void main (String[] args) {

		StackstartingCode s1 = new StackstartingCode();
		s1.push(10);
		s1.push(20);
		s1.push(30);
  		System.out.println (s1.pop());
		s1.push(40);
		System.out.println (s1.pop());
	}
}





