package oops;

import java.io.File;
import java.time.LocalDateTime;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Functions {

    public static boolean checkAutomorphic(final int n) {
	// time complexity - O(log N)
	boolean isAutomorphic = false;
	int square = n * n;
	int lenght = String.valueOf(n).length();
	if (String.valueOf(square).substring(String.valueOf(square).length() - lenght)
		.compareTo(String.valueOf(n)) == 0) {
	    isAutomorphic = true;
	}
	return isAutomorphic;
    }

    /**
     * @param value
     * @return
     */
    public static boolean checkPalindrome(final String value) {
	boolean isPalindrome = true;

	int i = 0;
	int n = value.length() - 1;
	while (isPalindrome && i < (value.length() / 2)) {
	    if (value.charAt(i) != value.charAt(n)) {
		isPalindrome = false;
	    }
	    ++i;
	    --n;
	}

	return isPalindrome;
    }

    /**
     * @param num
     * @return
     */
    public static int reverseNumber(int num) {
	// time complexity of O(log num)
	boolean negativeSign = false;
	if (num < 0) {
	    num = Math.abs(num);
	    negativeSign = true;
	}

	int number = 0;
	while (num > 0) {
	    int rem = num % 10;
	    number = number * 10 + rem;
	    num = num / 10;
	}
	if (negativeSign) {
	    number = number * -1;
	}
	return number;
    }

    /**
     * @param num
     * @return
     */
    public static String convertNumberToWork(final int num) {
	String number = "Out of Bound";

	String[] onedigit = new String[] { "Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight",
		"Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen",
		"Eighteen", "Nineteen" };

	String[] multipleoftens = new String[] { "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy",
		"Eighty", "Ninety" };

	if (num < 100) {
	    if (num <= 19) {
		number = onedigit[num];
	    } else {
		number = String.format("%s %s", multipleoftens[num / 10], onedigit[num % 10]);
	    }
	}
	return number;
    }

    /**
     * @return
     */
    public static int randomNumber() {
	return new Random().nextInt(10);
    }

    /**
     * @param n
     * @return
     */
    private static int factorialAux(int n) {
	if (n == 0) {
	    return 1;
	} else {
	    return n * factorialAux(n - 1);
	}

    }

    /**
     * @param n
     * @return
     */
    public static int factorial(final int n) {
	return factorialAux(n);
    }

    /**
     *
     */
    public static void runner() {
	while (true) {
	    System.out.println(LocalDateTime.now());
	    try {
		TimeUnit.SECONDS.sleep(1);
	    } catch (InterruptedException e) {
		e.printStackTrace();
	    }
	}
    }

    /**
     * @param filePath
     * @return
     */
    public static boolean checkExists(final String filePath) {
	return new File(filePath).exists();
    }

    /**
     * @param valString
     * @return
     */
    private static String reverseAux(String valString) {
	String returnString = "";
	if (valString.length() > 0) {
	    returnString = valString.charAt(valString.length() - 1)
		    + reverseAux(valString.substring(0, valString.length() - 1));
	}
	return returnString;
    }

    /**
     * @param valString
     * @return
     */
    public static String reverseStringRec(final String valString) {
	return reverseAux(valString);
    }

    /**
     * @param valString
     * @return
     */
    public static String reverseString(final String valString) {
	int i = valString.length() - 1;
	String returnVal = "";
	while (i >= 0) {
	    returnVal += valString.charAt(i);
	    --i;
	}
	return returnVal;
    }

    /**
     * @return
     */
    public boolean thisFunction() {
	return true;
    }

}