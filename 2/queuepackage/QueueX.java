package queuepackage;

public class QueueX {
	private int queueArr[];
	private int maxSize;
	private int rear;
	private int front;
	private int noItems;
	
	
	public QueueX(int s) {
		this.queueArr= new int[s];
		this.maxSize = s;
		this.front=0;
		this.rear=-1;
		this.noItems=0;
		
		
	}
	public void insert(int j) {
		if(isFull()) {
			System.out.println("The queue is full  !!");
		}
		else {
			
			rear ++;
			queueArr[rear]=j;
			noItems++;
		}
	}
	
	public int remove() {
		int value =-99;
		if(isEmpty()) {
			System.out.println("The queue is empty !!");
		}
		else {
			value=queueArr[front];
			front ++;
			noItems --;
			
		}
		
		return value;
	}
	
	
	public boolean isEmpty() {
		boolean value=false;
		if(noItems==0) {
			value=true;
		}
		return value;
	}
	
	
	public boolean isFull(){
		boolean value=false;
		
		if (rear==(maxSize-1)){
			value=true;
		}
		
		return value;
	}
	
	
	

}
