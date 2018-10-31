package iciciloans.com.personal.car;

public class ChildClass extends FirstAbstract

{

	public static void main(String[] args) 
	{
		ChildClass obj=new ChildClass();
		obj.m1();
		obj.m2();

	}

	@Override
	public void m1() 
	{
		
		
		
	}

	@Override
	public void m2() 
	{
		System.out.println("Hii iam m2 implemented in m2");
		
	}

}
