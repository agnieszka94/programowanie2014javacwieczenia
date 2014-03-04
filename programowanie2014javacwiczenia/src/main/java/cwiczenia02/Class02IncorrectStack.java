package cwiczenia02;

import java.util.EmptyStackException;

public class Class02IncorrectStack implements Stack {
	private Object[] elements;
	private int size= 0;

	public Class02IncorrectStack(int initialCapacity) {
		this.elements = new Object[initialCapacity];
	}

	public void push(Object e) {
		ensureCapacity();
		elements[size++] = e;
	}

	public Object pop() {
		if (size == 0)
			throw new EmptyStackException();
		Object temp = elements[--size];
		elements[size] = null;
		return temp;
	}

	private void ensureCapacity() {
		if (elements.length == size) {
			Object[] oldElements = elements;
			elements = new Object[2 * elements.length + 1];
			System.arraycopy(oldElements, 0, elements, 0, size);
		}
	}
}



