package linkList;



public class loopTestOfLinkList {

		private int size;
		Node head;
		class Node{
			String data;
			Node next;
			
			public Node(String data) {
				
				this.data = data;
				this.next = null;
				size++;
			}
			
			
		}
		
		// add-> first and last
		
		public void addFirst(String data) {
			Node newNode=new Node(data);
			//size++;
			if(head==null) {
				head=newNode;
				return;
			}
			newNode.next=head;
			head=newNode;
			
			
		}
		
		public void addLast(String data) {
			Node newNode=new Node(data);
			//size++;
			if(head==null) {
				head=newNode;
				return;
			}
			
			Node currentNode=head;
			while(currentNode.next!=null) {
				currentNode=currentNode.next;
			}
			currentNode.next=newNode;
		}
		
		public void addMiddle(int index,String data) {
			
			Node newNode = new Node(data);
			if(head==null||index==0) {
				newNode.next=head;
				head=newNode;
				return;
			}
			
			Node currentNode=head;
			
			for(int i=1;i<size;i++) {
				if(i==index) {
					
					Node nextNode=currentNode.next;
					currentNode.next=newNode;
					newNode.next=nextNode;
					//break;
				}
				
				currentNode=currentNode.next;
				
				
			}
			 
			
		}
		
		//Cycle Test
		public boolean verifyCycle() {
			if(head==null||head.next==null)
				return false;
			Node hear=head;
			Node turtle=head;
			while(hear!=null && hear.next!=null) {
				hear=hear.next.next;
				turtle=turtle.next;
				if(hear==turtle) {
					return true;
				}
				
			}
			return false;
			
		}
		
		
		
		//Print Linklist
		
//		public void print(Node head) {
//			Node current=head;
//			while(current!=null) {
//				try {
//					Thread.sleep(2000);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//				System.out.print(current.data+"->");
//				current=current.next;
//			}
//			System.out.println("null");
//		}
		
		
		
		public void PrintList() {
			
			if(head==null) {
				System.out.println("List Is Empty");
				return;
			}
			Node currentNode=head;
			while(currentNode!=null) {
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.print(currentNode.data+"->");
				currentNode=currentNode.next;
			}
			System.out.println("null");
		}
		
		//delete first or last
		public void deleteFirst() {
			if(head==null) {
				System.out.println("List is already empty");
				return;
			 
			}
			size--;
			head=head.next;
		}
		
		
		public void deleteLast() {
			
			if(head==null) {
				System.out.println("List is already empty");
				return;
			 
			}
			size--;
			if(head.next==null) {
				head=null;
				return;
			}
			Node secondLast=head;
			Node lastNode=secondLast.next;
			
			while(lastNode.next!=null) {
				secondLast=secondLast.next;
				lastNode=lastNode.next;
			}
			
			secondLast.next=null;
			
			
		}
		
		//Size order of one O(1) calculate during adding or removing
		
		public int getSize() {

			return size;
		}
		
		//Size by transvarsing full linklist 
		//Time complexcity: Order of O(n)
		
//		public int getSize() {
//			if(head==null)
//				return 0;
//			Node count=head;
//			while(count!=null) {
//				count=count.next;
//				size++;
//			}
//			
//			return size;
//		}
		
		public void createCycle(Node head,int pos) {
			Node current=head;
			Node cycleNode = null;
			int count=1;
			while(current.next!=null) {
				if(count==pos) {
					cycleNode=current;
				}
				current=current.next;
				count++;
			}
			
			current.next=cycleNode;
			
		}
		 public void removeFromIndex(int index) {
			 	
			 Node currentNode=head;
				if(head==null||index<0)
					return;
				size--;
			 	if(head.next==null||index==0) {
					head=head.next;
					return;
				}
			 	
			 	for(int i=1;i<size;i++) {
			 		if(index==i) {
			 			Node nextNode=currentNode.next;
			 			currentNode.next=nextNode.next;
			 		}
			 		currentNode=currentNode.next;
			 	}
		 }
		public static void main(String[] args){
			
			loopTestOfLinkList list =new loopTestOfLinkList();
			list.addFirst("JAVA");
			list.addFirst("IS");
			list.addFirst("THIS");
			list.addLast("PROGRAMMING");
			
			
			list.PrintList();
			System.out.println("Has Cycle:"+list.verifyCycle());
			list.createCycle(list.head, 1);
			System.out.println("Has Cycle:"+list.verifyCycle());
			list.PrintList();
			//list.print(list.head);
			//list.PrintList();
//			list.deleteFirst();
//			list.PrintList();
//			list.deleteLast();
//			list.PrintList();
//			list.deleteLast();
//			list.PrintList();
//			list.deleteLast();
//			list.PrintList();
			
			System.out.println("\n"+list.getSize());
			
		}

	}



