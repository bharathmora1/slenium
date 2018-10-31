package iciciloans.com.personal.car;

public class Insurance implements Health

{

	public static void main(String[] args) 
	{
		
        Insurance i=new Insurance();
        i.deposite();
        i.withdrawl();
		
	}

	@Override
	public void deposite() 
	
	{
		System.out.println("Iam deposited implemented in Insurance");
		
	}

	@Override
	public void withdrawl() 
	
	{
		
		System.out.println("Iam withdrawl implemented in Insurance");
	}

}
