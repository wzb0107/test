package com.wzb.day1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Test_HashMap {

	public static void main(String[] args) {
		Map<Integer, String> hs = new HashMap<>();
		hs.put(1, "张三,23");
		hs.put(2, "李四,24");
		/*
		 * for-each
		 * for (Map.Entry<Integer,String> entry : hs.entrySet()) {
			System.out.println(entry.getKey()+"..."+entry.getValue());
		}*/
		
		/*
		 * for-each 分别遍历key和value
		 * for (Integer key  : hs.keySet()) {
			System.out.println(key);
		}
		
		for(String value: hs.values()){
			System.out.println(value);
		}*/
		
		/*
		 * ③
		 * Iterator<Map.Entry<Integer, String>> it =hs.entrySet().iterator();
		while(it.hasNext()){
			Map.Entry<Integer, String> entry = it.next();
			System.out.println(entry.getKey()+"..."+entry.getValue());
		}*/
		
		Iterator<Map.Entry<Integer, String>> it =hs.entrySet().iterator();
		while(it.hasNext()){
			System.out.println(it.next().getValue());
		}
	}

}
