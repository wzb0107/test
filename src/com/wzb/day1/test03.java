package com.wzb.day1;

public class test03 {
	public static void main(String[] args) {
		Outer o = new Outer();
		o.method();
	}
}

interface Inter {
	public void print();
}

class Outer {
	class Inner implements Inter {
		public void print() {
			System.out.println("print");
		}
	}

	public void method() {
		new Inner().print();
		/*	new Inter() {
			public void print() {
				System.out.println("kjgjhgjh");
			}
		}.print();*/
	}
}
