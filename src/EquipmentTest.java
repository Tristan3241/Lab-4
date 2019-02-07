public class EquipmentTest{
	
	public void equipmentConstructorTest() throws AssertException {
		Equipment eq = new Equipment("Batwing/3,10.0,9.0,bat-shaped throwing stars");
		
		Assert.assertEquals(eq.getName(), "Batwing");
		Assert.assertEquals(eq.getCount(), 3);
		Assert.assertEquals(eq.getTotalWeight(), 10.0);
		Assert.assertEquals(eq.getTotalPrice(), 9.0);
		Assert.assertEquals(eq.getDescription(), "bat-shaped throwing stars");
	}
	public void toStringTest() throws AssertException {
		Equipment eq = new Equipment("Batwing/3,10.0,9.0,bat-shaped throwing stars");

		String expected = "Name: Batwing, Number: 3, Weight: 10.00 lbs, Price: $9.00 - bat-shaped throwing stars";
		String actual = eq.toString();
		Assert.assertEquals(expected, actual);
	}
	
}