/**
 *
 */
package oops;

/**
 *
 */
public class Book {
    /**
     * @return the price
     */
    public float getPrice() {
	return this.price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(float price) {
	this.price = price;
    }

    /**
     * @return the name
     */
    public String getName() {
	return this.name;
    }

    /**
     * @return the insb
     */
    public int getInsb() {
	return this.insb;
    }

    private final String name;
    private final int insb;
    private float price;

    /**
     *
     */
    public Book(final String name, final int insb, final float price) {
	this.name = name;
	this.insb = insb;
	this.price = price;
    }

    @Override
    public boolean equals(Object obj) {

	return super.equals(obj);
    }

    @Override
    public String toString() {
	// TODO Auto-generated method stub
	return super.toString();
    }

}
