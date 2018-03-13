package linkedLists;
/**
 * Singly linked list with references to its first and its
 * last node. 
 * 
 * @author pirvos
 *
 */

import java.util.NoSuchElementException;

import linkedLists.LinkedList;

public class SLFLList<E> extends SLList<E>
{
	private SNode<E> first, last;   // reference to the first node and to the last node
	int length; 
	
	public SLFLList() {       // to create an empty list instance
		first = last = null; 
		length = 0; 
	}
	
	
	public void addFirstNode(Node<E> nuevo) {
		if(length == 0) {
			first = last = (SNode<E>) nuevo;
		}
		else {
			((SNode<E>) nuevo).setNext(first);
			first = (SNode<E>) nuevo;
		}
		length++;
	}

	public void addNodeAfter(Node<E> target, Node<E> nuevo) {
		if (target == last) {
			last = (SNode<E>) nuevo;
		}
		((SNode<E>) nuevo).setNext(((SNode<E>) target).getNext());
		((SNode<E>) target).setNext((SNode<E>) nuevo);
		length++;
	}

	public void addNodeBefore(Node<E> target, Node<E> nuevo) {
		if (target == first) {
			first = (SNode<E>) nuevo;
		}
			Node<E> prevNode = getNodeBefore(target);
			this.addNodeAfter(prevNode, nuevo);
			length++;
	}

	public Node<E> getFirstNode() throws NoSuchElementException {
		return first;
	}

	public Node<E> getLastNode() throws NoSuchElementException {
		return last;
	}

	public Node<E> getNodeAfter(Node<E> target) throws NoSuchElementException {
		SNode<E> afterN = ((SNode<E>) target).getNext();
		if( afterN == null) throw new NoSuchElementException ("The target element is already the last");
		return afterN;
		
	}

	public Node<E> getNodeBefore(Node<E> target)
			throws NoSuchElementException {
	
		if( first == target) throw new NoSuchElementException ("The target element is already the first");
		SNode<E> beforeN = first;
		while(beforeN != null && beforeN.getNext() != target)
			beforeN = beforeN.getNext();
		return beforeN;
	}

	public int length() {
		return length;
	}

	public void removeNode(Node<E> target) {
		if(target == first) {
			SNode<E> nodetr = first;
			first = first.getNext();
			 nodetr.setNext(null);
		}
		
		else {
			SNode<E> beforeN = (SNode<E>) this.getNodeBefore(target);
			beforeN.setNext(((SNode<E>) target).getNext());
		}
		length--;
	}
	
	public Node<E> createNewNode() {
		return new SNode<E>();
	}

}
