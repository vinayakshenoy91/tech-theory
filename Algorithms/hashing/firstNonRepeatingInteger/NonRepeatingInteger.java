package firstNonRepeatingInteger;

import java.util.LinkedHashMap;
import java.util.Map;

public class NonRepeatingInteger {

	public static void main(String[] args) {

		int[] arr = { 1, 4,2, 3, 2  };
		System.out.println(findFirstUnique(arr));

	}

	public static Integer findFirstUnique(int[] arr) {

		Map<Integer, Integer> mp = new LinkedHashMap<>();

		for (int i = 0; i < arr.length; i++) {
			mp.putIfAbsent(arr[i], 0);
			mp.compute(arr[i], (k, v) -> v + 1);
		}
		
		System.out.println(mp);

		for (Integer key : mp.keySet()) {
			if (mp.get(key) == 1) {
				return key;
			}
		}

		return null;

	}

}
