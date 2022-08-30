package producerConsumer;

public class Q {

	int n;
	

	boolean valueset=false;
	
	synchronized void get()  {
		while(!valueset)
			try {
					wait();
			}catch(InterruptedException e) {
				System.out.println("InterruptedException caught");
			}
			/*public void passing() {
			for(int count=0;count<n.length;count++)
			System.out.println("Got:"+n);
			}*/
			
			System.out.println("Get:"+n);
			
			valueset=false;
			notify();
			//return n;
			/*try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
	}
	
	synchronized void put(int n) {
		while(valueset)
			try {
				wait();
			}catch(InterruptedException e) {
				System.out.println("InterruptedException caught");
			}
			
			this.n=n;
			valueset=true;
			
			System.out.println("Put:"+n);
			
			notify();
			
	}
}
