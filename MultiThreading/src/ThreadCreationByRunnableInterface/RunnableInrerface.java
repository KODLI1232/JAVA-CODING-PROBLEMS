package ThreadCreationByRunnableInterface;

public class RunnableInrerface implements Runnable {
	
	private String task;

	public RunnableInrerface(String task) {
		
		this.task = task;
	}

	@Override
	public void run() {
		System.out.println(task +"Is done by "+Thread.currentThread().getName());
		
	}
	public static void main(String[] args) {
		
		Thread t1=new Thread(new RunnableInrerface("SDE "));
		Thread t2 =new Thread(new RunnableInrerface("QA "));
		Thread t3=new Thread(new RunnableInrerface("DEVOPS "));
		
		t1.start();
		t2.start();
		t3.start();
	}

}