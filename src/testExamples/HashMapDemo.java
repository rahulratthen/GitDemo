package testExamples;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		
		int a[] = {4,5,3,4,5,3,5,6,6,8,4,3,5};
		HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();
		
		for(int b : a) {
			if(map.containsKey(b)) {
				map.put(b,  map.get(b)+1);
			}
			else {
				map.put(b, 1);
			}
		}
		//System.out.println(map);
		for(Integer i : map.keySet()) {
			System.out.println(i+"->"+map.get(i));
		}

	}

}
