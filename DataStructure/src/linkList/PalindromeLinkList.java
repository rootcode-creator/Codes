package linkList;



public class PalindromeLinkList {

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
		System.out.println(newNode.data);
		
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
	
	//delete first or last
	public void deleteFirst() {
		if(head==null) {
			System.out.println("List is already empty");
			return;
		 
		}
		size--;
		head=head.next;
	}
	
	public boolean palindromVarification() {
		if(head==null||head.next==null)
			return true;
		Node middle= findMiddle(head);
		Node secondHalfStart=reverse(middle.next);
		Node firstHalf=head;
		while(secondHalfStart!=null) {
			if(firstHalf.data!=secondHalfStart.data)
				return false;
			firstHalf=firstHalf.next;
			secondHalfStart=secondHalfStart.next;
		}
			
		return true;
	}
	
	private Node findMiddle(Node head) {
		
		Node here=head;
		Node turtle=head;
		
		while(here.next!=null && here.next.next!=null) {
		//while(here!=null && here.next!=null ) {
			
			
			here=here.next.next;
			
			
			turtle=turtle.next;
			
		}
		
		return turtle;
	}

	private Node reverse(Node head) {
		Node previous=null;
		Node current=head;
		while(current!=null) {
			Node next=current.next;
			current.next=previous; //point to previous node
			previous=current; //updation this line plus next line
			current=next;
		}
		return previous;
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
	
//	public int getSize() {
//		if(head==null)
//			return 0;
//		Node count=head;
//		while(count!=null) {
//			count=count.next;
//			size++;
//		}
//		
//		return size;
//	}
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
	public static void main(String[] args)throws Exception {
		
		PalindromeLinkList list =new PalindromeLinkList();
		list.addFirst("IS");
		list.addFirst("IS");
		//list.addFirst("THIS");
//		
//		list.PrintList();
//		list.addLast("THIS");
//		list.PrintList();
//		list.addMiddle(3, "IS");
//		list.PrintList();
		//list.removeFromIndex(3);
		//list.removeFromIndex(0);
		
		list.PrintList();
		
		System.out.println(list.palindromVarification());
		
//		list.deleteFirst();
//		list.PrintList();
//		list.deleteLast();
//		list.PrintList();
//		list.deleteLast();
//		list.PrintList();
//		list.deleteLast();
//		list.PrintList();
		
		System.out.println(list.getSize());
		
	}

}
