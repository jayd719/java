/**
 *
 */
package oops;

/**
 *
 */
public class Friends {
    private static int count = 0;
    String name;

    /**
     *
     */
    public Friends(final String name) {
	++count;
	this.name = name;

	this.hello();
    }

    public static int displayCount() {
	return count;
    }

    public void hello() {
	System.out.println("Hello " + this.name);

    }

}
