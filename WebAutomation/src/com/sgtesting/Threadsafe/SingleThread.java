package com.sgtesting.Threadsafe;
class MyThread implements Runnable
{
	public void run()
	{
		displayEvenNumbers();
	}
	public void displayEvenNumbers()
	{
		for(int i=20;i<=40;i++)
		{
			if (i%2==0)
			{
				System.out.println("EvenNumbers: "+i);
			}
		}
	}
}

public class SingleThread {
	
	public static void main(String[] args) {
		MyThread job=new MyThread();
		Thread t1=new Thread(job);
		t1.start();
		

	}

}
