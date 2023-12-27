package oops;

import java.util.Arrays;

//

/**
 * linear collection of similar elements
 *
 * int arr[] = new int[5]; String arr2[]= {"object","object"}
 *
 *
 */
public class ArraysTD {
    /**
     * Print Array to Console Type Does the fuck not matter
     *
     * @param <T>
     * @param arr
     */
    public static <T> void printArray(final T arr[]) {
	System.out.println("-".repeat(20));
	for (T item : arr) {
	    System.out.println(item);
	}

    }

    /**
     * print 2d Array
     *
     * @param <T>
     * @param arr
     */
    public static <T> void print2DArray(final T arr[][]) {
	System.out.println("-".repeat(20));
	for (T[] row : arr) {
	    for (T col : row) {
		System.out.print(col + " ");
	    }
	    System.out.println();

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

	String twoDarray[][] = { { "this", "is", "now" }, { "bourne", "agian", "shell" }, { "okay" } };
	print2DArray(twoDarray);

	Integer twoDarray2[][] = { { 1, 2, 3, 4, 5, 6 }, { 1, 2, 3, 4, 5, 6 }, { 1, 2, 3, 4, 5, 6 } };
	print2DArray(twoDarray2);

	String[] toolList = new String[4];
	toolList[0] = "hammer";
	toolList[1] = "nails";
	toolList[2] = "someTool";
	toolList[3] = "some Other Tool";

	printArray(toolList);
	System.out.println(Arrays.toString(toolList));

	String menuList[] = { "Funtions", "edit" };
	printArray(menuList);
    }

}
