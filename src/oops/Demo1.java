package oops;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Demo1 {

    public static int getSum(int n) {
	int sum = 0;

	while (n > 0) {
	    sum = sum + n % 10;
	    n = n / 10;
	}
	return sum;
    }

    public static void main(String[] args) {
	ArrayList<Integer> listOne = new ArrayList<>();
	listOne.add(34);
	listOne.add(10);
	listOne.add(51);
	listOne.add(45);

	Collections.sort(listOne);
	System.out.println(listOne);

	Collections.sort(listOne, new Comparator<Integer>() {
	    @Override
	    public int compare(Integer o1, Integer o2) {
		return getSum(o1) - getSum(o2);
	    }
	});

	System.out.println(listOne);
	Collections.sort(listOne, (a, b) -> (getSum(b) - getSum(a)));
	System.out.println(listOne);

	Collections.sort(listOne, (a, b) -> (getSum(a) - getSum(b)));

    }

}
