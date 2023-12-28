package oops;

import java.util.Scanner;

class Solution {

    private static int mainRev(int a, int b, int n) {
	int sum = 0;
	if (n == 0) {
	    sum = (a + ((2 ^ n) * b));
	} else
	    sum = sum + mainRev(a, b, n - 1);
	return sum;
    }

    public static void main(String[] argh) {
	Scanner in = new Scanner(System.in);
	int t = in.nextInt();
	for (int i = 0; i < t; i++) {
	    int a = in.nextInt();
	    int b = in.nextInt();
	    int n = in.nextInt();

	    int k = 0;
	    while (k < n) {
		System.out.print(mainRev(a, b, k) + " ");
		++k;
	    }
	    System.out.println();
	}

	in.close();
    }
}