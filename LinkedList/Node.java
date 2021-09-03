package LinkedList;

/*
 * @node class contains the data and node pointing to the next node
 * @param getkey 
 * @param 
 */
public class Node<K> implements INode<K> {//this Node class contains linkedlist data and next node
	private K key;
	private INode<K> next;
	
	public Node(K Key) {
		this.key = Key;
		this.next = null;
	}

	@Override
	public K getKey() {//is used get the key i.e. data
		return key;
	}

	@Override
	public void setKey(K key) {//setkey is used to point to the next node
		this.key = key;
		
	}

	@Override
	public INode<K> getNext() {
		return next;
	}

	@Override
	public void setNext(INode<K> next) {
		this.next = next;
		
	}
	
	public String toString() {
		StringBuilder myNodeString = new StringBuilder();
		myNodeString.append("MyNode{" + "key=").append(key).append('}');
		if(next != null) {
			myNodeString.append("->").append(next);
		}
		return myNodeString.toString();
	}
	
	
	
}