package linkedLists;

import java.util.NoSuchElementException;

import linkedLists.AbstractSLList.SNode;

public class DLDHDTList_Lab3<E> extends AbstractDLList<E> {
	private DNode<E> header, trailer; 
	private int length; 
	
	public DLDHDTList_Lab3() { 
		 header = new DNode<>();   // node with null fields
		   trailer = new DNode<>();  // node with null fields
		   header.setNext(trailer);  // link the two nodes to each other  
		   trailer.setPrev(header);  // link the two nodes to each other
		   length = 0; 

	}
	
	public void addFirstNode(Node<E> nuevo) {
		addNodeAfter(header, nuevo); 
	}
	
	public void addLastNode(Node<E> nuevo) { 
		DNode<E> dnuevo = (DNode<E>) nuevo; 
		DNode<E> nBefore = trailer.getPrev();  
		nBefore.setNext(dnuevo); 
		trailer.setPrev(dnuevo); 
		dnuevo.setPrev(nBefore); 
		dnuevo.setNext(trailer); 
		length++; 
	}

	public void addNodeAfter(Node<E> target, Node<E> nuevo) {
		DNode<E> dnuevo = (DNode<E>) nuevo; 
		DNode<E> nBefore = (DNode<E>) target; 
		DNode<E> nAfter = nBefore.getNext(); 
		nBefore.setNext(dnuevo); 
		nAfter.setPrev(dnuevo); 
		dnuevo.setPrev(nBefore); 
		dnuevo.setNext(nAfter); 
		length++; 
	}

	public void addNodeBefore(Node<E> target, Node<E> nuevo) {
		DNode<E> dnuevo = (DNode<E>) nuevo; 
		DNode<E> nAfter = (DNode<E>) target; 
		DNode<E> nBefore =nAfter.getPrev(); 
		nBefore.setNext(dnuevo); 
		nAfter.setPrev(dnuevo); 
		dnuevo.setPrev(nBefore); 
		dnuevo.setNext(nAfter); 
		length++; 
	}

	public Node<E> createNewNode() {
		return new DNode<E>();
	}

	public Node<E> getFirstNode() throws NoSuchElementException {
		if (length == 0) 
			throw new NoSuchElementException("List is empty."); 
		return header.getNext();
	}

	public Node<E> getLastNode() throws NoSuchElementException {
		if (length == 0) 
			throw new NoSuchElementException("List is empty."); 
		return trailer.getPrev();
	}

	public Node<E> getNodeAfter(Node<E> target)
			throws NoSuchElementException {
		if(target == trailer) throw new NoSuchElementException("Target is alredy the last one");
		DNode<E> nodeAf = ((DNode<E>) target).getNext();
		return nodeAf; 
	}

	public Node<E> getNodeBefore(Node<E> target)
			throws NoSuchElementException {
		if(target == header) throw new NoSuchElementException("Target is alredy the first one");
		DNode<E> nodeBef= ((DNode<E>) target).getPrev();
		return nodeBef; 
	}

	public int length() {
		return length;
	}

	public void removeNode(Node<E> target) {	
		DNode<E> dtarget = (DNode<E>) target; 
		DNode<E> nAfter = ((DNode<E>) target).getNext(); 
		DNode<E> nBefore =((DNode<E>) target).getPrev(); 
		dtarget.clean();
		nBefore.setNext(nAfter);
		nAfter.setPrev(nBefore);
		length--;
	}
	
	/**
	 * Prepares every node so that the garbage collector can free 
	 * its memory space, at least from the point of view of the
	 * list. This method is supposed to be used whenever the 
	 * list object is not going to be used anymore. Removes all
	 * physical nodes (data nodes and control nodes, if any)
	 * from the linked list
	 */
	private void destroy() {
		while (header != null) { 
			DNode<E> nnode = header.getNext(); 
			header.clean(); 
			header = nnode; 
		}
	}
	
	/**
	 * The execution of this method removes all the data nodes from
	 * the current instance of the list, leaving it as a valid empty
	 * doubly linked list with dummy header and dummy trailer nodes. 
	 */
	public void makeEmpty() { 
		DNode<E> currentNode = header;
		while( currentNode != trailer.getPrev()) {
			destroy();
		}
		trailer.getPrev().setElement(null);
		trailer.setPrev(null)	;
		trailer.setElement(null);
		trailer.setNext(null);
	}
		
	protected void finalize() throws Throwable {
	    try {
			this.destroy(); 
	    } finally {
	        super.finalize();
	    }
	}

}
