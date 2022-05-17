import java.util.HashMap;
import java.util.Map;
/*
 * input is:
 * 
 * map = 
{
    "NewYork" -> "Chicago"
    "Boston" -> "Texas"
    "Missouri" -> "NewYork"
    "Texas" -> "Missouri"
}
 * 
 * Output is:
 * 
 * "Boston->Texas , Texas->Missouri , Missouri->NewYork , NewYork->Chicago, "
 * 
 * 
 * 
 * 
 */

public class TracePathOfJourney {
	
	
	public static void main(String[] args) {
		
		Map<String, String>  map = new HashMap<>();
		
		map.put("NewYork", "Chicago");
		map.put("Boston", "Texas");
		map.put("Missouri", "NewYork");
		map.put("Texas", "Missouri");
		
		System.out.println(tracePath(map));
		
	}

	
	public static String tracePath(Map<String,String> map) {
		
		String startLocation="";
		
		for(String x: map.keySet()) {	 //Iterate this fully with a counter initilized to 0 to check for disconnected graph. If count>1,  return null
			if(!map.values().contains(x)) {
				startLocation=x;
				break;
			}		
		}
		
		String result ="";
		for(int i=0;i<map.keySet().size();i++) {
		
			String key = startLocation;
			String value=map.get(startLocation); 
			
			if(value==null) {
				break;
			}
			
			result+=key+"->"+value+", ";		
			
			startLocation=value;
		}
		
		return result;	
		
	}
}
