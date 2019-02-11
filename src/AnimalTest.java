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
    /**
     * Tests equals method in Animal testing both true and false case
     * @throws AssertException
     */
    public void equalsTest() throws AssertException{
    	//testing true case
    	Animal ani = new Animal ("blue", "Jerry", 25.65,49.57);
    	Animal ani2 = new Animal ("blue", "Jerry", 25.65, 49.57);
    	boolean expected = true;
    	boolean actual = ani.equals(ani2);
    	Assert.assertEquals(expected, actual);
    	//testing false case
    	Animal ani3 = new Animal("Green", "jim", 45, 76);
    	actual = ani.equals(ani3);
    	Assert.assertFalse(actual);
    }

    //Tested getters in the empty constructor and full constructor
}

