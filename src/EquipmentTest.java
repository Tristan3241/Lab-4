public class EquipmentTest{
	
	public void equipmentConstructorTest() throws AssertException {
		Equipment eq = new Equipment("Batwing/3,10.0,9.0,bat-shaped throwing stars");
		
		Assert.assertEquals(eq.getName(), "Batwing");
		Assert.assertEquals(eq.getCount(), 3);
		Assert.assertEquals(eq.getTotalWeight(), 10.0);
		Assert.assertEquals(eq.getTotalPrice(), 9.0);
		Assert.assertEquals(eq.getDescription(), "bat-shaped throwing stars");
	}
}