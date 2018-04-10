package recursionExamples;

import java.util.ArrayList;
import java.util.List;


public class SLL<E> {
	
	private static class Node<E> {
		private E element; 
		private Node<E> next;
		public Node(E element, Node<E> next) {
			super();
			this.element = element;
			this.next = next;
		}
		public Node(E element) { this(element, null); } 
		public Node() { this(null, null); }
		public E getElement() { return element; }
		public void setElement(E element) { this.element = element; }
		public Node<E> getNext() { return next; }
		public void setNext(Node<E> next) { this.next = next; }	
	}

	private Node<E> first = null; 
	private int size = 0; 
	public void addFirst(E e) { 
		Node<E> nuevo = new Node<>(e, first); 
		first = nuevo; 
		size++; 
	}
	public String toString() { 
		String s = ""; 
		Node<E> current = first; 
		while (current != null) { 
			s += " " + current.getElement(); 
			current = current.getNext(); 
		}
		return s; 
	}

	public void iterReverse() { 
		if (size > 1) {   // if size is 1, the list is already its reverse...
			Node<E> c = first, a = first.getNext(), b = null; 
			while (a != null) { 
				c.setNext(b);
				b = c; 
				c = a; 
				a = a.getNext(); 
			} 
			c.setNext(b);
			first = c; 
		} 
	}
	
	public void nodeReverse() { 
		   if (size > 1)  
		     first=nodeRecReverse(null, first); 
		} 
	
	private Node<E> nodeRecReverse(Node<E> b, Node<E> c) { 
	       if  (c==null) return b;
	       Node<E> a=c.getNext(); 
	       c.setNext(b);
	       return nodeRecReverse(c, a);
	}
	
	public void reverse() { 
		   if (size > 1) 
		      first =  (Node<E>) pairRecReverse(first).getFirst();
		} 
	
	private Pair<Node<E>> pairRecReverse(Node<E> f){
		Node<E> rf = f;
		Pair<Node<E>> rev = new Pair<Node<E>>(nodeRecReverse(null, f), rf);
		return  rev;
	}
	
	public ArrayList<E> lessThan(E e) { 
		   ArrayList<E> result = new ArrayList<>();     // and empty ArrayList object
		   if (size > 0) 
		      recLessThan(first, e, result);   // passing only reference to result
		   return result; 
		}

	private void recLessThan(Node<E> fr, E e, ArrayList<E> result) { 
		   if (fr != null) { 
		      if (((Comparable<E>) fr.getElement()).compareTo(e) < 0)
		         result.add(e); 
		      recLessThan(fr.getNext(), e, result);  // passing reference to result
		   }
		} 
	
	public ArrayList<Pair<E>> consecutiveIncreasingPairs() { 
		   ArrayList<Pair<E>> result = new ArrayList<>();     // and empty ArrayList object
		   if (size > 0) 
		      recCIP(first, result); 
		   return result; 
		}

	public void  recCIP(Node<E> first, ArrayList<Pair<E>>result) {
		if (first.getNext() != null) { 
		      if (((Comparable<E>) first.getElement()).compareTo(first.getNext().getElement()) < 0) {
		    	  	Pair<Node<E>> p = new Pair<>(first, first.getNext());
		         result.add((Pair<E>) p); 
		      }
		      recCIP(first.getNext(), result);  // passing reference to result
		   }
	}
	
	

}

