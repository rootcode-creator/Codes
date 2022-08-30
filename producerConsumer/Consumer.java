package producerConsumer;

public class Consumer implements Runnable {
	Q q;
	Thread t;
	

	public  Consumer(Q q) {
		
		this.q = q;
		t=new Thread(this,"Consumer");
	}
	
	@Override
	public void run() {
		while(true) {
			/*try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
			q.get();
		}
		
		
	}
	
}
