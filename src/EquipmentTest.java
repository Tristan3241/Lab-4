public class EquipmentTest{
	/**
	 * testing equipment constructor
	 * @throws AssertException
	 */
	public void equipmentConstructorTest() throws AssertException {
		Equipment eq = new Equipment("Batwing/3,10.0,9.0,bat-shaped throwing stars");
		
		Assert.assertEquals(eq.getName(), "Batwing");
		Assert.assertEquals(eq.getCount(), 3);
		Assert.assertEquals(eq.getTotalWeight(), 10.0);
		Assert.assertEquals(eq.getTotalPrice(), 9.0);
		Assert.assertEquals(eq.getDescription(), "bat-shaped throwing stars");
	}
	/**
	 * testing equipment toString method
	 * @throws AssertException
	 */
	public void toStringTest() throws AssertException {
		Equipment eq = new Equipment("Batwing/3,10.0,9.0,bat-shaped throwing stars");

		String expected = "Name: Batwing, Number: 3, Weight: 10.00 lbs, Price: $9.00 - bat-shaped throwing stars";
		String actual = eq.toString();
		Assert.assertEquals(expected, actual);
	}
	/**
	 * testing Equipment equals method
	 * @throws AssertException
	 */
	public void equalsTest() throws AssertException {
		//testing true case
		Equipment equ = new Equipment("Batwing/3,10.0,9.0,bat-shaped throwing stars");
		Equipment equ2 = new Equipment("Batwing/3,10.0,9.0,bat-shaped throwing stars");
		boolean expected = true;
		boolean actual = equ.equals(equ2);
		Assert.assertEquals(expected, actual);
		//testing false case
		Equipment equ3 = new Equipment("Tabletop/3, 10.4,9.6,bat-shaped table");
		expected = false;
		actual = equ.equals(equ3);
		Assert.assertEquals(expected, actual);
		
	}
	
}