package com.wzb.day1;

public class test04 {

	public static void main(String[] args) {
	Outer2.method().show();
	}

}

interface Inter2 {
	void show();
}

class Outer2 {
	public static Inter2 method() {
		return new Inter2() {
			public void show() {
				System.out.println("helloWorld");
			}
		};
	}
}
