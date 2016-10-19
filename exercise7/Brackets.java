

class Brackets {
	
	public static void main(String[] arg) {
		
		String brackets = "()()(){}{}[(])";
		BracketsCheck brackCheck = new BracketsCheck();
		boolean check = brackCheck.checkText(brackets);
		System.out.println(check);
		
	}
}