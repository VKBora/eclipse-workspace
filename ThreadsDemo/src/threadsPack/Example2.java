package threadsPack;

class C extends Thread
{
	public void run()
	{
	  for(int i=1; i<=10; i++)
	  {
		  System.out.println(getPriority() + " i="+i+" Thread C");
		  
	  }
	
	}

}

class D extends Thread
{
	public void run()
	{
	  for(int i=1; i<=10; i++)
	  {
		  System.out.println(getPriority() + " i="+i+" Thread D");
	  }
	
	}

}


public class Example2 {
	
	public static void main(String[] args)
	{
		
		C c1 = new C();
		D d1 = new D();
		
		c1.start();
		d1.start();
		d1.setPriority(6);
	}

}
