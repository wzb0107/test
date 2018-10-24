package com.wzb.day1;

public class Test11 {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 1, 2, 3, 4, 5, 6, 7, 8, 9, 7, 8, 9, 4, 5, 10, 10, 11 };
		int[] brr = new int[100];
		for (int i = 0; i < arr.length; i++) {
			brr[arr[i]]++;
		}
		for (int j = 0; j < brr.length; j++) {
			if (brr[j] != 0) {
				System.out.println(j +" "+ "出现  " + brr[j] + " 次 ");
			}
		}
	}
}
