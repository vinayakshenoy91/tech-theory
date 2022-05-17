import java.util.HashMap;

//Time complexity: O(n)
public class FindSubZeroSum {

	public static void main(String[] args) {

		int[] arr = { 6, 4, -7, 3, 12, 9 };
		System.out.println(findSubZero(arr));
	}

	public static boolean findSubZero(int[] arr) {
		// Use HashMap to store Sum as key and index i as value till sum has been
		// calculated.
		// Traverse the array and return true if either
		// arr[i] == 0 or sum == 0 or HashMap already contains the sum
		// If you completely traverse the array and havent found any of the above three
		// conditions then simply return false.
		HashMap<Integer, Integer> hMap = new HashMap<>();

		int sum = 0;

		// Traverse through the given array
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];

			if (arr[i] == 0 || sum == 0 || hMap.get(sum) != null) //hmap.get(sum) is the twist here
				return true;

			hMap.put(sum, i);
		}

		return false;
	}

}
