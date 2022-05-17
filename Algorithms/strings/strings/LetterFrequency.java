package strings;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



enum DeliveryStatus{
	REACHED
}

public class LetterFrequency {
	
	public static void main(String[] args) {
		
		String str = "hellolll";
		
		Map<String, Integer> freqMap = new HashMap<>();
		
		
		List<String> list = Arrays.asList(str.split(""));
		
		Collections.sort(list);
		
		for(String x : list) {
			freqMap.putIfAbsent(x, 0);
			freqMap.compute(x, (k,v)->v+1);
		}
		
		System.out.println(freqMap);
		
	}
	
	
	

}
