package linkList;



public class linkListReverse {
	
		Node head;
		class Node{
			String data;
			Node next;
			
			public Node(String data) {
				
				this.data = data;
				this.next = null;
			}
			
			
		}
		
		// add-> first and last
		
		public void addFirst(String data) {
			Node newNode=new Node(data);
			if(head==null) {
				head=newNode;
				return;
			}
			newNode.next=head;
			head=newNode;
		}
		
		public void addLast(String data) {
			Node newNode=new Node(data);
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
		
		//Print Linklist
		
		public void PrintList() {
			
			if(head==null) {
				System.out.println("List Is Empty");
				return;
			}
			Node currentNode=head;
			while(currentNode!=null) {
				System.out.print(currentNode.data+"->");
				currentNode=currentNode.next;
			}
			System.out.println("null");
		}
		
		//link list reverse iterative approch
		
		public void ireverseLinkList() {
			if(head==null||head.next==null)
				return ;
			Node previousNode=head;
			Node currentNode=head.next;
			while(currentNode!=null) {
				Node nextNode=currentNode.next;
				currentNode.next=previousNode;
				previousNode=currentNode;
				currentNode=nextNode;
				
			}
			head.next=null;
			head=previousNode;
			
			
			
		}
		
		public Node reverseLinkList(Node head) {
			
			if(head==null||head.next==null)
				return head;
			Node newNode=reverseLinkList(head.next);
			head.next.next=head;
			head.next=null;
			return newNode;
			
			
			
		}
		
		
		 
		public static void main(String[] args) {
			
			linkListReverse list =new linkListReverse();
			
			list.addFirst("JAVA");
			list.addFirst("IS");
			list.addFirst("THIS");
			list.PrintList();
			list.addLast("PROGRAMMING");
			list.PrintList();
			//list.ireverseLinkList();
			list.head=list.reverseLinkList(list.head);
			list.PrintList();
			
			
		}

	}