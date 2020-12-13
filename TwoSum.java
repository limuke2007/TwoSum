package com.limuke;

import java.util.HashMap;

public class TwoSum {
	
	public static int[] twoSum(int[] arr, int target) {
		
		
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			map.put(arr[i], i);
		}
		
		for (int i = 0; i < arr.length; i++) {
			int complement = target - arr[i];
			if (map.containsKey(complement) && map.get(complement) != i) {
				return new int[] {i, map.get(complement)};
			}
		}
		throw new IllegalArgumentException("No two sum solution");
	}
	
	public static void main(String[] args) {
		int[] res = twoSum(new int[] {2, 3, 5, 6}, 10);
		System.out.println(res[0]);
		System.out.println(res[1]);
	}

}
