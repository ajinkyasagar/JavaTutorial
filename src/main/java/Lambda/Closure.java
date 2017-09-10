package Lambda;

public class Closure {
	
	public static void main(String[] args) {
		
		int a=10;
		int b= 20;
		
		
		Process p=j->System.out.println("additoin" +(j+b));
		
		p.process(b);
	}
	
	interface Process
	{
		void process(int a) ;
	}

}
