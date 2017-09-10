package multithreading;

public class Resource {
	
	public  void printA(String s) throws InterruptedException
	
	{
		
		System.out.println("Acquire lock by"+Thread.currentThread().getName());
		System.out.println(s);
		for (int i = 0; i < 10; i++) {
			System.out.println("NUmber"+i+Thread.currentThread().getName());
			if (i==5) {
				System.out.println("Calling yeild"+Thread.currentThread().getName());
				Thread.yield();
				Thread.sleep(3000);
				System.out.println("Called yeild"+Thread.currentThread().getName());
			}
		}
	}
	
	public synchronized void printB(String s)
	
	{
		System.out.println("Acquire lock by"+Thread.currentThread().getName());
		System.out.println(s);
		
	}

}
