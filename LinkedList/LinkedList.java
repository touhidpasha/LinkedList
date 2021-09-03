package LinkedList;

public class LinkedList<K>{
	public INode<K> head;
	public INode<K> tail;
	
	public LinkedList() {
		this.head = null;
		this.tail = null;	
	}
	
	public void add(INode<K> newNode) {
		if(this.tail == null) {
			this.tail = newNode;
		}
		if(this.head == null) {
			this.head = newNode;
		}
		else {
			INode<K>tempNode = this.head;
			this.head = newNode;
			this.head.setNext(tempNode);
		}
	}
	
	public void append(INode<K> newNode) {
		if(this.head == null) {
			this.head = newNode;
		}
		if(this.tail == null) {
			this.tail = newNode;
		}
		else {
			this.tail.setNext(newNode);
			this.tail = newNode;

		}
	}
	public INode<K> pop(){
		INode<K> tempNode = this.head;
		this.head = head.getNext();
		return tempNode;
	}
	
	public INode<K> poplast(){
		INode<K> tempNode = this.head;
		while(tempNode.getNext()!= this.tail) {
			tempNode=tempNode.getNext();
		}
		this.tail = tempNode;
		INode<K> tempNode2;
		tempNode2=tempNode.getNext();
		tempNode.setNext(null);
		return tempNode2;
	}
	
	public INode<K> searchNode(K Key) {//search method to find element if it prestn
		INode<K> tempNode = head;
		while(tempNode != null && tempNode.getNext() != null) {
			if (tempNode.getKey().equals(Key)){
				return tempNode;
			}
			tempNode = tempNode.getNext();
		}
		return null;
	}
	
	public void printNodes() {
		System.out.println("My Nodes: "+head);
	}
}