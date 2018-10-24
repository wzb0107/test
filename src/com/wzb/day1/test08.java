package com.wzb.day1;

public class test08 {

	public static void main(String[] args) {
		Stu p = new Stu();
		p.say();
	}
}

abstract class Person{
	public abstract void say();
}

class Stu extends Person{
	public void say(){
		System.out.println("hahah ");
	}
}