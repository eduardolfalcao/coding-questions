package uri.list3;

import java.util.EmptyStackException;
import java.util.Scanner;
import java.util.Stack;

public class Parenthesis {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		while (in.hasNext()) {
			String expression = in.next();
			char [] c = expression.toCharArray();
			System.out.println(checkExpression(c)?"correct":"incorrect");
		}
		
	}
	
	public static boolean checkExpression(char[] exp){
		Stack<Character> stack = new Stack<Character>();
		for(int i = 0; i < exp.length; i++){
			if(exp[i] == '(')
				stack.push(exp[i]);
			else if(exp[i] == ')'){
				try{
					stack.pop();
				}
				catch(EmptyStackException ex){
					return false;
				}				
			}
		}
		return stack.isEmpty()?true:false;
	}

}
