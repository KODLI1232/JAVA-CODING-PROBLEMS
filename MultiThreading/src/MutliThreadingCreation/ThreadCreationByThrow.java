package MutliThreadingCreation;

public class ThreadCreationByThrow extends Thread {

	private String dish;

	 ThreadCreationByThrow(String dish) {
		
		this.dish = dish;
	}
	
	public void run() {
		System.out.println(dish+ "The dish is prepared by"+Thread.currentThread().getName());
	}
}
