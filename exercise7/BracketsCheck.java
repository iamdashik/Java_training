import java.util.Stack;

class BracketsCheck {
	private Stack<Character> stack = new Stack<Character>();
	
	private boolean isOpen(char c) {
		return "([{".indexOf(c) != -1;
	}
	
	private boolean isClose(char c) {
		return ")]}".indexOf(c) != -1;
	}
	
	private boolean isPair(char openBracket, char closeBracket) {
		return (openBracket == '(' && closeBracket == ')') || (openBracket == '[' && closeBracket == ']') || (openBracket == '{' && closeBracket == '}');  
	}
	
	public boolean checkText(String text) {
		for (char c : text.toCharArray()) {
			
			if (isClose(c) && stack.isEmpty()) {
				return false;
			}
			
			else if (isOpen(c)) {
				stack.push(c);
			}
			else {
				if (isPair(stack.peek(), c)) {
					stack.pop();
				}
			}
		}
		return stack.isEmpty();
	}
} 