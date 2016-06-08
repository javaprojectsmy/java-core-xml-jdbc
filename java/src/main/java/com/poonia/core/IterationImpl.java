package com.poonia.core;

public class IterationImpl implements Iteration {
	public static int i;
	private Object objects[];

	public IterationImpl(Object objects[]) {
		this.objects = objects;
	}

	public boolean hasNext() {
		// TODO Auto-generated method stub
		if (objects == null)
			return false;

		return i <= objects.length - 1;
	}

	public Object next() {
		Object obj = objects[i];
		i++;
		return obj;
	}

}
