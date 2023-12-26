package oops;

// linear collection of similar elements
public class Arrays {
    /**
     * Print Array to Console Type Does the fuck not matter
     *
     * @param <T>
     * @param arr
     */
    public static <T> void printArray(final T arr[]) {
	System.out.println();
	for (T item : arr) {
	    System.out.println(item);
	}

    }

    public static <T> boolean binarySearch(final T arr[], final T val) {
	boolean contains = false;
	int left = 0;
	int right = arr.length;

	while (!contains && left <= right) {
	    int mid = (left + right) / 2;

	    if (arr[mid] == val) {
		contains = true;
	    } else if (arr[mid].compare) {

	    }

	}

	return contains;
    }

    public static void main(String[] args) {

	// define an array
	String arrayOne[] = { "this", "now", "working" };
	printArray(arrayOne);

	Double arrayTwo[] = { 1.2, 1.9, 1.4, 2.4 };
	printArray(arrayTwo);

	Integer arrayThree[] = { 1, 2, 3, 4, 5, 6 };
	printArray(arrayThree);

    }

}
