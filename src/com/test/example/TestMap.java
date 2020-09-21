package com.test.example;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class TestMap {

	public static void main(String[] args) {
		
		
		List<Integer> list = new LinkedList<>();
		Map<Integer, Integer> map = new HashMap<>();
		
		for (Integer integer : list) {
			
			if(map.containsKey(integer)) {
				map.put(integer, map.get(integer)+1);
			}else{
				map.put(integer, 1);
			}
			
		}
		
		
		
	}
}
