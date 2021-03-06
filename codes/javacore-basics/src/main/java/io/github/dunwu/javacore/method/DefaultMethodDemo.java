package io.github.dunwu.javacore.method;

/**
 * @author Zhang Peng
 * @date 2019-03-16
 */
public class DefaultMethodDemo {

	public static void main(String[] args) {
		MyInterface obj = new MyClass();
		obj.print();
	}

	interface MyInterface {

		void print();

	}

	static class MyClass implements MyInterface {

		@Override
		public void print() {
			System.out.println("Hello World");
		}

	}

}
// Output:
// Hello World
