package com.sgtesting.Threadsafe;
class MyThread1 implements Runnable
{
	public void run()
	{
		displayEvenNumbers();
	}
	public void displayEvenNumbers()
	{
		try
		{
			for(int i=20;i<=40;i++)
			{
				if (i%2==0)
				{
					Thread.sleep(1000);				
					System.out.println(Thread.currentThread().getName()+ "EvenNumbers: "+i);
				}
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
			
	}
}

public class MultipleThreads {

	public static void main(String[] args) {
		MyThread1 obj=new MyThread1();
		Thread t1=new Thread(obj);
		Thread t2=new Thread(obj);
		t1.setName("Alpha");
		t2.setName("Beta");
		t1.start();
		t2.start();
		

	}

}
