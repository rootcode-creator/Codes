package producerConsumerWith5Integer;

public class Q {

	int n[];
	int size;
	int content;
	
	Q(int size){
		n=new int[size];
		this.size=size;
		content=-1;
	}
	
	
	
	boolean isFull() {
		return content==(size-1);
	}
	
	boolean isEmpty() {
		return content==-1;
	}
	synchronized void get()  {
		while(isEmpty())
			try {
					wait();
			}catch(InterruptedException e) {
				System.out.println("InterruptedException caught");
			}
			System.out.println("Got("+content+")");
			content--;
			//for(int count=0;count<n.length;count++)
			//System.out.println("Get:"+n[count]);
			
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
		while(isFull())
			try {
				wait();
			}catch(InterruptedException e) {
				System.out.println("InterruptedException caught");
			}
			for(int count=size;count>0;count--)
			this.n[count]=n;
			
			
			
			for(int count=size;count>0;count--)
			System.out.println(this.n[count]); 
			
			notify();
			
	}
}
