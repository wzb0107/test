package com.wzb.day1;

public class Prime {

	public static void main(String[] args) {
		int flag = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				flag = 1;
				break;
			} else if (flag == 0) {
				System.out.println(i);
			}
		}
	}

}
