package com.poonia.problems;

import java.util.Stack;

public class GetMinimumStack extends Stack<Integer> {

	Stack<Integer> min = new Stack<>();

	void push(int x) {
		if (isEmpty() == true) {
			super.push(x);
			min.push(x);
		} else {
			super.push(x);
			int y = min.peek();
			if (x < y)
				min.push(x);
		}
	}

	public Integer pop() {
		int x = super.pop();
		min.pop();
		return x;
	}

	int getMin() {
		int x = min.pop();
		min.push(x);
		return x;
	}

	public static void main(String[] args) {
		GetMinimumStack s = new GetMinimumStack();
		s.push(10);
		s.push(20);
		s.push(14);
		s.push(30);
		System.out.println("first minimum element: "+s.getMin());
		s.push(50);
		s.push(2);
		System.out.println("after insertion minimum element: "+s.getMin());
	}
}