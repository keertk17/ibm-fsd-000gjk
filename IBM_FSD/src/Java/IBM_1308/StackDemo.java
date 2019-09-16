package IBM_1308;

import java.util.Stack;

public class StackDemo {
		static void stackPush(Stack<String> s,String a) {
		if(s.size()==5) {
			System.out.println("stack full");
		}else {
		s.push(new String(a));
		}
		}
		static void stackPop(Stack<String> s) {
			System.out.println("The popped element is:"+s.pop());
		}
	public static void main(String[] args) {
		Stack<String> s=new Stack<String>();
		stackPush(s,"a");
		stackPush(s,"b");
		stackPush(s,"c");
		stackPush(s,"d");
		stackPush(s,"e");
		stackPush(s,"f");
		System.out.println("Stack: " +s);
		stackPop(s);
		System.out.println("Stack: " +s);
		}
	}