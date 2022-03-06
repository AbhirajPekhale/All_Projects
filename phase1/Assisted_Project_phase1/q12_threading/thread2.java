package q12_threading;


public class thread2 extends Thread
	{
	 	public void run()
	 	{
	  		System.out.println("concurrent thread started running..");
	}
	 	public static void main( String args[] )
	 	{
	 		thread2 mt = new  thread2();
	  		mt.start();
	 	}
	}

