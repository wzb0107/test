package com.wzb.day1;

public class test02 {

	public static void main(String[] args) {
		Out1.Inner oi = new Out1().new Inner();
		oi.demo();
	}

}

class Out1{
	class Inner{
		public void demo(){
			System.out.println("hello world");
		}
	}
}
