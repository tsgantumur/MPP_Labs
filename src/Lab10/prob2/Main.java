package Lab10.prob2;

import java.util.List;
import java.util.ListIterator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	private static <T extends Comparable> T secondSmallest(List<T> list)
	{		
		T minIndex;
	    if (list.isEmpty()) {
	        minIndex = -1;
	    } else {
	        final ListIterator<T> itr = list.listIterator();
	        T min = itr.next(); // first element as the current minimum
	        minIndex = itr.previousIndex();
	        while (itr.hasNext()) {
	            final T curr = itr.next();
	            if (curr.compareTo(min) < 0) {
	                min = curr;
	                minIndex = itr.previousIndex();
	            }
	        }
	    }
	    return minIndex;
		
	}

}
