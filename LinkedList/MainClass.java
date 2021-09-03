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
	
	public static void DeleteTopNode() {
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
	
	public static void main(String [] args) {
		Create();//Create() method to create a linked list 
		link();//this function will link 56->30->70
		DeleteTopNode();
	}
	
}