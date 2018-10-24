package com.wzb.day1;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// demo1();
		// demo2();
		//demo3();

	}

	private static void demo3() {
		int[] arr = { 55, 66, 44, 11, 22, 99, 88, 77, 33 };
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		for (int a : arr) {
			System.out.print(a + " ");
		}
	}

	private static void demo2() {
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + "*" + i + "=" + i * j + " ");
			}
			System.out.println();
		}
	}

	private static void demo1() {
		Scanner sc = new Scanner(System.in);
		int temp = 3;
		while (temp >= 0) {
			System.out.println("请输入用户名：");
			String name = sc.nextLine();
			System.out.println("请输入密码：");
			String password = sc.nextLine();
			if (name.equals("admin") && password.equals("admin")) {
				System.out.println("登录成功");
				break;
			} else {
				System.out.println("输入有误,请重新输入");
				temp--;
			}
		}
	}

}

class Singleton4 {
	private Singleton4() {
	}

	private static Singleton4 s = new Singleton4();

	public static Singleton4 getInstance() {
		return s;
	}
}

class Singleton5 {
	private Singleton5() {
	}

	private static Singleton5 s;

	public static Singleton5 getInstance() {
		if (s == null) {
			s = new Singleton5();
		}

		return s;

	}
}
