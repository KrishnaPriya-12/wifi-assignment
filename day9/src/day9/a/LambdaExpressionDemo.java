package day9.a;

interface Home
{
	public int doThings();
	
}

interface Office
{
	public String doTask(String str,int count);
}

class SampleClass
{
	public void someWork(Home home)
	{
		int x = home.doThings();
		System.out.println(x);
	}
	
	public void abcThings(Office office)
	{
		String msg = office.doTask("Some office Work", 100);
	}

}


public class LambdaExpressionDemo {
	
  public static void main(String[] args) {
		
		Home h = ()->{
			System.out.println("Hello home inteface");
			return 10;
		};
		
		new SampleClass().someWork(h);
		
		
		// ----------------------
		
		
		Office  capg = (a1,a2)->{
			System.out.println(a1+" - "+a2);
			return a1+" - "+a2;
		};
		new SampleClass().abcThings(capg);
		
		
		
	}

}
