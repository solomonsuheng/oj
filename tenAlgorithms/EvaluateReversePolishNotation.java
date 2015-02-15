package tenAlgorithms;

import java.util.Stack;

public class EvaluateReversePolishNotation {
	public static void main(String[] args) {
		String[] tokens = new String[] { "2", "1", "+", "3", "*" };
		System.out.println(evalRPN(tokens));
	}

	private static int evalRPN(String[] tokens) {
		// TODO Auto-generated method stub
		int returnValue = 0;
		String operators = "+-*/";
		// using a stack to store the numbers
		Stack<String> stack = new Stack<String>();

		for (String t : tokens) {
			if (!operators.contains(t)) {
				// 如果给的符号不是数字，则是字符，则对数字进行压入
				stack.push(t);
			} else {
				// 传入的字符是一个符号
				// 则从堆栈中弹出2个数
				int num1 = Integer.parseInt(stack.pop());
				int num2 = Integer.parseInt(stack.pop());

				switch (t) {
				case "+":
					stack.push(String.valueOf(num1 + num2));
					break;
				case "-":
					stack.push(String.valueOf(num1 - num2));
					break;
				case "*":
					stack.push(String.valueOf(num1 * num2));
					break;
				case "/":
					stack.push(String.valueOf(num2 / num1));
					break;
				}
			}
		}

		returnValue = Integer.valueOf(stack.pop());
		return returnValue;
	}
}
