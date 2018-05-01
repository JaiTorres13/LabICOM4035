package priorityQueue1;

import java.util.ArrayList;
import java.util.Comparator;

import priorityQueueInterfaces1.Entry;

/**
 * Implementation of a PriorityQueue based in an ArrayList<Entry<K, V>>.
 * @author pedroirivera-vega
 *
 * @param <K>
 * @param <V>
 */
public class SortedListPriorityQueue<K, V> extends AbstractListPriorityQueue<K, V> {
	public SortedListPriorityQueue(Comparator<K> cmp) { 
		super(cmp);
	}
	
	public SortedListPriorityQueue() { 
		super(); 
	}
	
    //altered for exercise 5
	@Override
	public Entry<K,V> insert(K key, V value) throws IllegalArgumentException {
		super.validate(key); 
		Entry<K,V> newest = new PQEntry<K,V>(key, value);
			int curr = 0 ; 
		while (curr < list.size()  && compare(list.get(curr), newest) <  0)
			curr++; 
		list.ensureCapacity(list.size() + 1);
		list.add(curr, newest); 
		return newest; 
	}

	@Override
	protected int minEntryIndex() {
		return 0;
	}

}
