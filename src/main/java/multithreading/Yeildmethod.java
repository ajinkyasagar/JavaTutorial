package multithreading;

public class Yeildmethod {
	
	Resource resource= new Resource();
	
	
	
	public static void main(String[] args) {
		
		Yeildmethod yeildmethod= new Yeildmethod();
		Thread thread= new Thread(){
			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					yeildmethod.resource.printA("Sagar");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				yeildmethod.resource.printB("Thakare");
				
				super.run();
				
				
			}
		};
		thread.setName("First THread");
		thread.setPriority(Thread.MIN_PRIORITY);
		Thread thread2= new Thread(){
			@Override
			public void run() {
				// TODO Auto-generated method stub
				yeildmethod.resource.printB("ThakareB");
				try {
					yeildmethod.resource.printA("SagarB");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
				
				super.run();
				
				
			}
		};
		thread2.setName("Second THread");
		thread2.setPriority(Thread.MAX_PRIORITY);
		
		Thread thread3= new Thread(){
			@Override
			public void run() {
				// TODO Auto-generated method stub
				yeildmethod.resource.printB("ThakareB3");
				try {
					yeildmethod.resource.printA("SagarB3");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
				
				super.run();
				
				
			}
		};
		thread3.setName("Third THread");
		thread3.setPriority(Thread.NORM_PRIORITY);
		thread.start();
		thread2.start();
		thread3.start();
		
	}

}
