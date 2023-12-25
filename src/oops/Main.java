/**
 *
 */
package oops;

/**
 *
 */
public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {

	// reverse a number

	System.out.println(String.format("Reverse of -981 is %d", Functions.reverseNumber(-981)));
	System.out.println(String.format("Reverse of 1307 is %d\n", Functions.reverseNumber(1307)));

	System.out.println(String.format("5 AutoMorphic: %b", Functions.checkAutomorphic(25)));
	System.out.println(String.format("6 AutoMorphic: %b", Functions.checkAutomorphic(6)));
	System.out.println(String.format("10 AutoMorphic: %b\n", Functions.checkAutomorphic(10)));

    }

}
