package singleton;

import java.awt.List;
import java.util.ArrayList;

public class Employee {

	
	String name;

	private static Employee employee=null;
	private Employee(String name) {
		super();
		this.name = name;
	}
	
	
	public static Employee getinstance(String name)
	{
		if (employee==null) {
			employee=new Employee(name);
		}
		
		return employee;
	}
	
	
	public static void main(String[] args) {
		
		
		Employee employee= Employee.getinstance("Sagar");
		
		System.out.println("Hashcode"+employee.hashCode()+"Name"+employee.name);
		
	Employee employee2= Employee.getinstance("Amit");
		
		System.out.println("Hashcode"+employee.hashCode()+"Name"+employee.name);

	Runnable runnable1= () ->{
		
			
			Employee employee11= Employee.getinstance("Sagar");
			
			System.out.println("Hashcode"+employee.hashCode()+"Name"+employee.name);
			
		Employee employee22= Employee.getinstance("Amit");
			
			System.out.println("Hashcode"+employee.hashCode()+"Name"+employee.name);

			
		
	};
	
	
	Runnable runnable2=  ()-> {
		
			Employee employee3= Employee.getinstance("Sagar");
			System.out.println("Hashcode"+employee3.hashCode()+"Name"+employee3.name);
			
		Employee employee4= Employee.getinstance("Amit");
			
			System.out.println("Hashcode"+employee4.hashCode()+"Name"+employee4.name);

		
	};
	
	for (int i = 0; i < 10; i++) {
		Thread thread11 = new Thread(runnable1);
		thread11.start();

		Thread thread12 = new Thread(runnable2);
		thread12.start();
		
	}
	

	ArrayList<String> listStrings = new ArrayList();
	listStrings.add("Sagar1");
	listStrings.add("Sagar2");
	listStrings.add("Sagar3");
	
	
	listStrings.forEach((n)->{
		System.out.println(n);
		
	});
	
	
	}
}
