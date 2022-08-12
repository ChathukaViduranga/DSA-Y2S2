package stacksPkg;

public class Main {

	public static void main(String[] args) {
		
		Stack test= new Stack(5);
		
		test.Push('a');
		test.Push('b');
		test.Push('c');
		test.Push('d');
		test.Push('e');
		
		System.out.println(test.Peek());
		
		while(!test.isEmpty()) {
			System.out.println(test.Pop());
		}
		System.out.println(test.Pop());
		
		
	
		
		
		
		

	}

}
