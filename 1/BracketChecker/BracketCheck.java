package BracketChecker;

import stacksPkg.Stack;

public class BracketCheck {
	
	private String inputStr;

	public BracketCheck(String inputStr) {
		
		this.inputStr = inputStr;
	}
	
	public void checkB() {
		
		int size=inputStr.length();
		Stack Bstack= new Stack(size);
		
		for(int i=0;i<size;i++) {
			if(inputStr.charAt(i)=='(') {
				Bstack.Push('(');
			}
			
			else if(inputStr.charAt(i)==')') {
				Bstack.Pop();
			}
		}
		
		if(!Bstack.isEmpty()) {
			System.out.println(" Not valid");
		}
		else
			System.out.println("Valid");
		
		
	}
	
	

}
