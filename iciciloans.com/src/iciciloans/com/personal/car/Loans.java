package iciciloans.com.personal.car;

public class Loans {

	
	        int a=10,b=20,result=0;
	        public void add()
	{
		   result=a+b;
		   System.out.println("Addition of A & B is :" + result);

	}
	        
	        public void sub()
	        {
	        	
	        	result=a-b;
	        	System.out.println("Substraction of A & B is :" + result);
	        	
	        } 	
	        
	        
	        public static void main(String[] args)
	        
	        
	        {
	        	
	        	Loans obj=new Loans();
	        	obj.add();
	        	obj.sub();
	        	
	        	
	        }
	        
	        }
