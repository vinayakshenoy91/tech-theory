package threadWorks;

import java.time.LocalDateTime;
import java.time.ZoneId;

public class BasicThread {

	public static void main(String[] args) {
		
		
		System.out.println(LocalDateTime.now(ZoneId.of("UTC")));
		// TODO Auto-generated method stub
		
		//Task task = new Task();
		
		//Thread t = new Thread(task);
		//t.start();

		
		//try {
	//		Thread.sleep(3000);/*OR*/  TimeUnit.SECONDS.sleep(3);
	//	} catch (InterruptedException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		//System.out.println("Inside main");*/
	}
	
	
	public void Hello() {
		System.out.println("Hello");
	}

}
