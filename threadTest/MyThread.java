package threadTest;

public class MyThread extends Thread  {

	
	    public static void main(String [] args) throws Exception  {
	        MyThread t = new MyThread();
	        t.start();
	        System.out.print("one. ");
	        //Thread.sleep(1000);
	        System.out.print("two. ");
	        t.start();
	        
	    }
	    public void run() {
	        System.out.print("Thread ");
	    }
	}

	

