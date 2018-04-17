package llPositionalList;

import java.util.Iterator;
import java.util.NoSuchElementException;

import interfaces.Position;
import interfaces.PositionalList;

public class ElementBackwardIterator<E> implements Iterator<E> { 
	PositionalList<E> list;
	Position<E> current, recent;
	
	public  ElementBackwardIterator(PositionalList<E> list) {
		this.list = list;
		current = list.last();
		recent = null;
	}
	@Override
	public boolean hasNext() {
		return current != null;
	}

	@Override
	public E next() throws NoSuchElementException {
		if (!hasNext())
			throw new NoSuchElementException("No more elements."); 
		recent = current; 
		current = list.before(current); 
		return recent.getElement();
	} 
	
	public void remove() throws IllegalStateException { 
		if (recent == null) 
			throw new IllegalStateException("remove() not valid at this state of the iterator."); 
		list.remove(recent);
		recent = null;
	}
}      