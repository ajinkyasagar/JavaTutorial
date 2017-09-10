package InnerClasses;

public class Test {
	private int a=10;
	
	static int b;
	final int c;
	public Test(int a) {
		super();
		this.a = a;
		
		this.c=30;
		
	}
	
	static{
		b=20;
			}
	
	
	public void show()
	{
		System.out.println(this.a+this.c+this.b);
	}
	public static void main(String[] args) {
		Test t= new Test(10);
		Test.TestInner ineer=  t.new TestInner();
		ineer.display();
		
	}
	
	
	private class TestInner{
		
		public void display()
		{
			System.out.println("Inner Class" +b +a+c);
		}
	
	
	}

}
