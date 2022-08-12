package queuepackage;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int size=5;
		QueueX mainQueue = new QueueX(size);
		Scanner scanner1 =new Scanner(System.in);
		
		for(int i=0;i<5;i++) {
			System.out.print("Enter transaction ID "+ (i+1) +": ");
			mainQueue.insert(scanner1.nextInt());
		}
		
		QueueX evenQueue = new QueueX(5);
		QueueX oddQueue = new QueueX(5);
		
		for(int i=0;i<5;i++) {
			int value = mainQueue.remove();
			if(value%2==0) {
				evenQueue.insert(value);
			}
			else {
				oddQueue.insert(value);
			}
		}
		
		System.out.println("PC1");
		while(!evenQueue.isEmpty()) {
			System.out.println("      Transaction "+evenQueue.remove());
		}
		System.out.println("PC2");
		while(!oddQueue.isEmpty()) {
			System.out.println("      Transaction "+oddQueue.remove());
		}
		scanner1.close();

	}

}
