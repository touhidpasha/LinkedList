package LinkedList;


public class MainClass {
	
	
	public static void Create() {//Create() method to create a linked list 
		Node<Integer> myFirstNode = new Node<>(56);//creting first node
		Node<Integer> mySecondNode = new Node<>(30);
		Node<Integer> myThirdNode = new Node<>(70);
		
		myFirstNode.setNext(mySecondNode);
		mySecondNode.setNext(myThirdNode);
	
		
	}
	public static void link() {//this function will link 56->30->70
		Node<Integer> myFirstNode = new Node<>(56);
		Node<Integer> mySecondNode = new Node<>(30);
		Node<Integer> myThirdNode = new Node<>(70);
		
		LinkedList<Integer> myLinkedList = new LinkedList<Integer>();
		myLinkedList.add(myFirstNode);
		myLinkedList.add(mySecondNode);
		myLinkedList.add(myThirdNode);
		myLinkedList.printNodes();
	}
	
	public static void deleteTopNode() {//methos for deleting top element
		Node<Integer> myFirstNode = new Node<>(70);
		Node<Integer> mySecondNode = new Node<>(30);
		Node<Integer> myThirdNode = new Node<>(56);
		
		LinkedList<Integer> myLinkedList = new LinkedList<Integer>();
		myLinkedList.add(myFirstNode);
		myLinkedList.add(mySecondNode);
		myLinkedList.add(myThirdNode);
		INode<Integer> temp =myLinkedList.pop();
		System.out.println(temp.getKey()+" has been deleted");
		myLinkedList.printNodes();
	}
	
	public static void deleteLastNode() {//methos for deleting last element
		Node<Integer> myFirstNode = new Node<>(70);
		Node<Integer> mySecondNode = new Node<>(30);
		Node<Integer> myThirdNode = new Node<>(56);
		
		LinkedList<Integer> myLinkedList = new LinkedList<Integer>();
		myLinkedList.add(myFirstNode);
		myLinkedList.add(mySecondNode);
		myLinkedList.add(myThirdNode);
		INode<Integer> temp =myLinkedList.poplast();
		System.out.println(temp.getKey()+" has been deleted");
		myLinkedList.printNodes();
	}
	public static void searchNodeMethod() {
		Node<Integer> myFirstNode = new Node<>(70);
		Node<Integer> mySecondNode = new Node<>(30);
		Node<Integer> myThirdNode = new Node<>(56);
	
		LinkedList<Integer> myLinkedList = new LinkedList<Integer>();
		myLinkedList.add(myFirstNode);
		myLinkedList.add(mySecondNode);
		myLinkedList.add(myThirdNode);
		INode<Integer> result = myLinkedList.searchNode(30);//passing 30 as argument to search
		if(result == null)
			System.out.println("Element not present");
		else
			System.out.println(result.getKey()+" is present");
		myLinkedList.printNodes();
	}
	
	public static void main(String [] args) {
		Create();//Create() method to create a linked list 
		link();//this function will link 56->30->70
		//deleteTopNode();
		//deleteLastNode();
		searchNodeMethod();//calling method to search a element
	}
	
}