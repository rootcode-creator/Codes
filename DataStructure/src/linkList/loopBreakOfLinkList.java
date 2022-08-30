package linkList;

public class loopBreakOfLinkList {

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
			
//			public void print(Node head) {
//				Node current=head;
//				while(current!=null) {
//					try {
//						Thread.sleep(2000);
//					} catch (InterruptedException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
//					System.out.print(current.data+"->");
//					current=current.next;
//				}
//				System.out.println("null");
//			}
			
			
			
			public void PrintList() {
				
				if(head==null) {
					System.out.println("List Is Empty");
					return;
				}
				Node currentNode=head;
				while(currentNode!=null) {
					try {
						Thread.sleep(1000);
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
			
//			public int getSize() {
//				if(head==null)
//					return 0;
//				Node count=head;
//				while(count!=null) {
//					count=count.next;
//					size++;
//				}
//				
//				return size;
//			}
			
			
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
			 
			 public void removeCycle(Node head) {
					if(head==null||head.next==null)
						return;
					Node hear=head;
					Node turtle=head;
					
					do {
						hear=hear.next.next;
						turtle=turtle.next;
						
					}while(hear!=turtle); 
					
					//implementation by while loop
//					while(turtle!=null&&hear!=null&&hear.next!=null) {
//						hear=hear.next.next;
//						//System.out.println("12"+hear.data);
//						turtle=turtle.next;
//						//System.out.println("12"+turtle.data);
//						if(hear==turtle) {
//							System.out.println("1"+hear.data);
//							System.out.println("1"+turtle.data);
//							//hear=head;
//							break;
//						}
//						
//					}
					
					//when we make turtle head we have to make hear.next=null to break the cycle same thing will be applied otherwise 
					
					turtle=head; 
					//hear=head; 
//					System.out.println("2"+hear.data);
//					System.out.println("2"+turtle.data);
//					
					
					
//					
					while(hear.next!=turtle.next) { 
						hear=hear.next;
						turtle=turtle.next;
					}
					//System.out.println(hear.data);
					//turtle.next=null;//hear=head
					hear.next=null;//turtle=head
					//System.out.println(turtle.data);
				}
				
			 
			public static void main(String[] args){
				
				loopBreakOfLinkList list =new loopBreakOfLinkList();
				list.addFirst("JAVA");
				list.addFirst("IS");
				list.addFirst("THIS");
				list.addLast("PROGRAMMING");
				list.addLast("HAS");
				list.addLast("BIG");
				list.addLast("MANIPULATION");
				list.addLast("HASI");
				
				list.PrintList();
				//list.PrintList();
				System.out.println("Has Cycle:"+list.verifyCycle());
				
				list.createCycle(list.head, 2);
				//list.PrintList();
				System.out.println("Has Cycle:"+list.verifyCycle());
				list.removeCycle(list.head);
				list.PrintList();
				
				
				
				System.out.println(list.getSize());
				
			}

		}





