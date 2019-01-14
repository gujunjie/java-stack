package project01;

import java.util.Stack;

public class Text {

	public static void main(String[] args) {

	  MyStack myStack=new MyStack();
	  System.out.println(myStack.size());
	  myStack.push(123);
	  myStack.push(456);
	  myStack.push(789);
	  System.out.println(myStack.size());
	  System.out.println(myStack.peek());
	  System.out.println(myStack.isEmply());
	  System.out.println(myStack.pop());
	  System.out.println(myStack.size());
	  System.out.println(myStack.peek());
	  System.out.println(myStack.pop());
	  System.out.println(myStack.pop());
	  System.out.println(myStack.pop());
	}
	

}
