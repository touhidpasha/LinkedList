package LinkedList;



public class MainClass {
	
	
	public static void Create() {//Create() method to create a linked list 
		Node<Integer> myFirstNode = new Node<>(56);//creting first node
		Node<Integer> mySecondNode = new Node<>(30);
		Node<Integer> myThirdNode = new Node<>(70);
		
		myFirstNode.setNext(mySecondNode);
		mySecondNode.setNext(myThirdNode);
		
	}
	
	public static void main(String [] args) {
		Create();
		
	}
}