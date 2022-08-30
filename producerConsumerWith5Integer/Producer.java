package producerConsumerWith5Integer;

public class Producer implements Runnable {
	Q q;
	Thread t;
	
	int arr[]=new int[5];
	public Producer(Q q) {
		
		this.q = q;
		t=new Thread(this,"Producer");
	}
	
	
	
	@Override
	public void run() {
		int i= 0;
		while(true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
				
				for(int count=0;count<5;count++) {
					arr[count]=i;
					i++;
				}
			
			
			//q.put(arr);
			
		}
		
		
	}
	
}
