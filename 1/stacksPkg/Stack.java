package stacksPkg;

public class Stack {
	private int top;
	private char[] stackArray;
	private int maxSize;
	
	public Stack(int maxSize) {
		
		this.top = -1;
		this.stackArray = new char[maxSize];
		this.maxSize=maxSize;	
	}
	
	
	public boolean isEmpty() {
		return (top==-1);
		
	}
	
	public boolean isFull() {
		return (top==(maxSize-1));
	}
	
	public void Push(char character) {
		
		if(!isFull()) {
	
			stackArray[++top]=character;
		}
		else
		System.out.println("The Stack is Full");
		
	}
	
	public char Pop() {
		
		char charac=0;
		
		if(!isEmpty()) {
			charac=stackArray[top--];
		}
		else
			System.out.println("The Stack is empty");
		
		return charac;
	}
	
	public char Peek() {
		if(!isEmpty()) {
			return(stackArray[top]);
		}
		else
			System.out.println("The Stack is empty");
		
		return 0;
	}
	
}
