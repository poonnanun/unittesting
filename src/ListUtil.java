import java.util.ArrayList;
import java.util.List;

/**
 * This is class for utility usage of list.
 * @author Poonnanun Poonnopathum
 *
 */
public class ListUtil {

	/**
     * Count the number of distinct elements in a list.
     * The list may be empty but not null.
     * 
     * @param list a list of elements
     * @return the number of distinct elements in list
     */
	public static int countUnique(List<Object> list) {
		if(list == null) {
			 throw new IllegalArgumentException("Parameter Type cannot be null");
		}
		if(list.isEmpty()) {
			return 0;
		}
		int count = 0;
		List<Object> temp = new ArrayList<>();
		for(int i=0; i<list.size(); i++) {
			if(!temp.contains(list.get(i))) {
				temp.add(list.get(i));
				count++;
			}
		}
		return count;
	}
	
	public static <T extends Comparable<? super T>> int binarySearch(T[] array, T element) {
		if(element == null || array == null) {
			throw new IllegalArgumentException("Parameter Type cannot be null");
		}
		int low = 0;
		int high = array.length;
		while(true) {
			int mid = (high + low)/2;
			if(element.compareTo(array[mid])>0) {
				low = mid;
			}else if(element.compareTo(array[mid])<0) {
				high = mid;
			}else {
				return mid;
			}
		}
	}
	
}
