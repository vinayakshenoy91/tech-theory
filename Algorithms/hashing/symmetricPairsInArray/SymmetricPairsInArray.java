package symmetricPairsInArray;

import java.util.HashSet;
import java.util.Set;

public class SymmetricPairsInArray {
	
	
	public static void main(String[] args) {
		
		int[][] arr = {{1, 2}, {3, 4}, {5, 9}, {4, 3}, {9, 5}};
		
		System.out.println(findSymmetric(arr));
		
		
	}
	
	public static String findSymmetric(int [][]arr) {
		
		Set<String> tempHashset = new HashSet<>();
		
		StringBuilder builder = new StringBuilder();
		
		builder.append("\"");
		
		
		for(int i=0;i<arr.length;i++) {
			int[]tempArr = arr[i];
			
			if(tempHashset.contains(tempArr[0]+"|"+tempArr[1])||tempHashset.contains(tempArr[1]+"|"+tempArr[0])) {
				builder.append("{"+tempArr[1]+","+tempArr[0]+"}");			
			}else {
				tempHashset.add(tempArr[0]+"|"+tempArr[1]);
			}
			
		}
		
		builder.append("\"");
		
		return builder.toString();
	}

}
