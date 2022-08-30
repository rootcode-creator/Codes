package linkList;



public class returnNthNodeFromLast {

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
	
	public Node deleteNthNodeFromLast(Node head,int n) {
		
		int tsize=0;
		//int indexToSearch=getSize()-n;
		Node current=head;
		while(current!=null) {
			current=current.next;
			tsize++;
		}
		System.out.println(tsize);
		int indexToSearch=tsize-n;
		size--;
		if(n==tsize)
			return head.next;
		
		Node previous=head;
		int i=1;
		while(i<indexToSearch) {
			previous=previous.next;
			i++;
		}
		//System.out.println(i);
		previous.next=previous.next.next;
		return head;
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
		
		returnNthNodeFromLast list =new returnNthNodeFromLast();
		list.addFirst("JAVA");
		list.addFirst("IS");
		list.addFirst("THIS");
		
		list.PrintList();
		list.addLast("PROGRAMMING");
		list.PrintList();
		list.addMiddle(3, "IS");
		list.PrintList();
		list.removeFromIndex(3);
		//list.removeFromIndex(0);
		
		list.PrintList();
		list.head=list.deleteNthNodeFromLast(list.head,3);
		list.PrintList();
		
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
