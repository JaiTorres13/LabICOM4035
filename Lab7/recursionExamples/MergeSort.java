package recursionExamples;

import java.util.ArrayList;

public class MergeSort<E> {
	
	public static <E> void sort(ArrayList<E> myList){

		if (myList.size() > 1) {
			ArrayList<E> a1, a2;
			a1 = new ArrayList<E>();
			a2 = new ArrayList<E>();
			for(int i= 0 ; i<myList.size()/2; i++){
				a1.add(myList.get(i));
			}

			for(int i= myList.size()/2 ; i<myList.size(); i++){
				a2.add(myList.get(i));
			}

			sort(a1);
			sort(a2);
			int i = 0, j = 0;

			while (i + j < myList.size()) {
				if (j == a2.size() || (i < a1.size() && (((Comparable<E>) a1.get(i)).compareTo(a2.get(j)) < 0)))
					myList.set(i + j, a1.get(i++));
				else
					myList.set(i+j, a2.get(j++));
			}
		}
	}
}
