/**
 * Testing class for Product object
 *
 * @author Stephen Thung, references previous code from Dr.Fagg, Taner Davis
 * @version 2018-08-25
 */
public class AnimalTest
{

    /**
     * Test the empty Animal constructor and the getters
     */
    public void emptyConstructorTest() throws AssertException
    {
        // Use the default constructor
        Animal animal = new Animal();

        // The name should be "noname", color "unknown", height and weight 0.
        Assert.assertEquals("unknown", animal.getColor());
        Assert.assertEquals("noname", animal.getName());
        Assert.assertEquals(0, animal.getHeight(), 0.01);
        Assert.assertEquals(0, animal.getWeight(), 0.01);
    }
    /**
     * Test the full Animal constructor and the getters
     * @throws AssertException
     */
    public void fullConstructorTest() throws AssertException{
    	Animal animal = new Animal("Orange", "Tony", 200.1, 20);
    	Assert.assertEquals("Tony", animal.getName());
    	Assert.assertEquals("Orange", animal.getColor());
    	Assert.assertEquals(20, animal.getHeight(), 0.01);
    	Assert.assertEquals(200.1, animal.getWeight(), 0.01);
    }
    // TODO: test full constructor, getters, and toString
    /**
     * Test the toString method
     * @throws AssertException
     */
    public void toStringTest() throws AssertException {
    	Animal ani = new Animal("Blue", "Tim", 23, 34);
    	String expected = "Tim, a Blue-colored animal. 23.0 pounds, 34.0 inches\n";
    	String actual = ani.toString();
    	
    	Assert.assertEquals(expected, actual);
    }

    //Tested getters in the empty constructor and full constructor
}

