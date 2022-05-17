import java.util.Arrays;



//time complexity: O(n)
public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long a = System.nanoTime();
		int[] arr = {6,4,9,10,11,5,4};
		int x = 5;
		
		for(int i =0;i<arr.length;i++) {
			if(arr[i]==x) {
				System.out.println(" Element x is present at index "+i);
			}
		}
		
		System.out.println("Time taken is =>"+(System.nanoTime()-a));
		
	}

}
