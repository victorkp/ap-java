public class SearchUtil  {

	/**
	 * Search the array for the value specified
	 * by using linear search (checking all values)
	 * @param array the array to search
	 * @param target the target value to search for
	 * @return the index of the value (or -1 if not found)
	 */
	public static int linearSearch(int[] array, int target) {
		for(int i = 0; i < array.length; i++) {
			if(array[i] == target) {
				// Found the target
				return i;
			}
		}

		// The target must not have been
		// in the array
		return -1;
	}

	/**
	 * Search the array for the value specified
	 * by using binary search. 
	 * @param array the array to search, must be sorted low to high
	 * @param target the target value to search for
	 * @return the index of the value (or -1 if not found)
	 */
	public static int binarySearch(int[] array, int target) {
		int left = 0;
		int right = array.length;
		int middle;

		while(left <= right) {
			middle = (left + right) / 2;

			if(target > array[middle]) {
				// The value is larger than what
				// we have checked
				left = middle + 1;
			} else if (target < array[middle]) {
				// The value is smaller than
				// what we have checked
				right = middle - 1;
			} else {
				// We have found target
				return middle;
			}
		}

		// If the code has gone this far,
		// then the target must not be in the array
		return -1;
	}



}
