package com.wzb.day1;

public class test07 {

	public static void main(String[] args) {
		new Thread(){
			public void run(){
				for(int i = 0;i<10;i++){
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(":"+i);
				}
			}
		}.start();
	}

}
