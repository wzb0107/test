package com.wzb.day1;

public class 二分查找 {

	public static void main(String[] args) {
		int[] arr = { 11, 22, 33, 44, 55, 66, 77, 88, 99 };
		int bs = bs(arr, 0, 8, 66) + 1;
		System.out.println("找到了第" + bs + "位");
		int search = binSearch(arr, 66);
		System.out.println("找到了第" + (search + 1) + "位");
	}

	/*
	 * 递归
	 */
	public static int bs(int[] arr, int low, int high, int key) {
		if (low <= high) {
			int mid = (low + high) / 2;
			if (key == arr[mid]) {
				return mid;
			} else if (key < arr[mid]) {
				return bs(arr, low, mid - 1, key);
			} else if (key > arr[mid]) {
				return bs(arr, mid + 1, high, key);
			}
		}
		return -1;
	}

	public static int binSearch(int[] arr, int key) {
		int mid;
		int start = 0;
		int end = arr.length - 1;
		while (start <= end) {
			mid = (start + end) / 2;
			if (arr[mid] == key) {
				return mid;
			} else if (key > arr[mid]) {
				start = mid + 1;
			} else
				end = mid - 1;
		}
		return -1;
	}
}
