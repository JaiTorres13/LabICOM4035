package TreeLab2_Student.src.testerClasses;

import java.util.Comparator;

public class IntegerComparator2 implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		return o2.compareTo(o1);
	}

}