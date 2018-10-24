package com.wzb.day1;

public class Test_Singleton {

	public static void main(String[] args) {
		Singleton.getInstance();
	}

}

/*
 * 饿汉式
 */
class Singleton {

	private Singleton() {
	}

	private static Singleton s = new Singleton();

	public static Singleton getInstance() {

		return s;
	}
}

/*
 * 懒汉式
 */
class Singleton1 {
	private Singleton1() {
	}

	private static Singleton1 s;

	public static Singleton1 getInstance1() {
		if (s == null) {
			s = new Singleton1();
		}

		return s;
	}
}
