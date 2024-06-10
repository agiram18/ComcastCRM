package dummy;

public class DNA2 
{
	public static void DNA() throws InterruptedException
	{
		Thread.sleep(500);
		System.out.println("1     1");
		Thread.sleep(500);
		System.err.println(" 1   1 ");
		Thread.sleep(500);
		System.out.println("   1  ");
		Thread.sleep(500);
		System.err.println(" 1   1 ");
		Thread.sleep(500);
    	System.out.println("1     1");
		DNA();
	}
	public static void main(String[] args) throws InterruptedException 
	{
		DNA();
		
	}

}
