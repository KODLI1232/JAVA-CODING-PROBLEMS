package MutliThreadingCreation;

public class ResturantThread{
	
	public static void main(String[] args) {
		
		Thread t1=new ThreadCreationByThrow("Pizza ");
		Thread t2=new ThreadCreationByThrow("Dosa ");
		Thread t3=new ThreadCreationByThrow("Biryani ");
		
		t1.start();
		t2.start();
		t3.start();
		
	}
}
