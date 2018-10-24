package com.wzb.day1;

public class test09 {

	public static void main(String[] args) {
		Cat c = new Cat();
		c.say();
	}

}

abstract class Animal{
	final int num = 10;
	public abstract void say();
}

class Cat extends Animal {
	public void say() {
		System.out.println(":");
		System.out.println(num);
	}
}