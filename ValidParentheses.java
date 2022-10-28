package leetcode;

import java.util.Scanner;
import java.util.Stack;

public class ValidParentheses {
	public boolean handleClosing(Stack<Character> s, char openBracket){
        if(s.size() == 0){
            return false;
        }else if(s.peek() != openBracket){
            return false;
        }else {
            s.pop();
        }
        return true;
    }
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch == '(' || ch == '{' || ch == '['){
                stack.push(ch);
            }else if(ch == ')'){
                boolean val = handleClosing(stack,'(');
                if(val == false) return false;
            }else if(ch == '}'){
                boolean val = handleClosing(stack,'{');
                if(val == false) return false;
            }else if(ch == ']'){
                boolean val = handleClosing(stack,'[');
                if(val == false) return false;
            }
        }
        
        if(stack.size() > 0)return false;
        return true;
    }
	public static void main(String[] args) {
		ValidParentheses obj = new ValidParentheses();
		Scanner sc = new Scanner(System.in);
		System.out.print("Input: ");
		String input = sc.nextLine();
		sc.close();
		System.out.println(obj.isValid(input));
	}
}