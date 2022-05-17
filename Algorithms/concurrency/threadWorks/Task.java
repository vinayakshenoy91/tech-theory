package threadWorks;

public class Task {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		System.out.println("Inside run ...");

		HelloMate();
		

		System.out.println("Inside run out");
	}
	
	
	public static void HelloMate() {
		
		Thread x = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Inside in");

			}
		});
		
		x.start();
	}
}
