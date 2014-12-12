import java.util.Stack;


public class EvalReversePolishNotation {
	public static double solve(String[] arr) {
		double a, b;		
		Stack<Double> stack = new Stack<>();
		
		
		for ( int i = 0; i < arr.length; i++ ) {
			if ( arr[i].charAt(0) < '0' || arr[i].charAt(0) > '9' ) {
				b = stack.pop();
				a = stack.pop();
				
				switch(arr[i]) {
					case "*":
						stack.push(a * b);
						break;
					case "/":
						stack.push(a / b);
						break;
					case "+":
						stack.push(a + b);
						break;
					case "-":
						stack.push(a - b);
						break;
				}
			} else {
				stack.push(Double.parseDouble(arr[i]));
			}
		}
		
		return stack.pop();
	}
	
	public static void main(String[] args) {
		String[] arr = {"4", "13", "5", "/", "+"};
		
		System.out.println(solve(arr));
	}
}
