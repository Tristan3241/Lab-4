public class ZooTest {
	//tests getTotalHeight
	public void getTotalHeightTest() throws AssertException{
			Zoo zoo = new Zoo(3);
			Animal ani = new Animal("blue", "jim", 30.56, 40.65);
			Animal ani2 = new Animal("green", "tim", 40.56, 60.30);
			Animal ani3 = new Animal("purple", "linus", 20.00, 34.00);
			zoo.addAnimal(ani);
			zoo.addAnimal(ani2);
			zoo.addAnimal(ani3);
			double expected = 134.95;
			double actual = zoo.getTotalHeight();
			Assert.assertEquals(expected, actual, 0.01);
	}
	//tests getCapacity
	public void getCapacityTest() throws AssertException {
		Zoo zoo = new Zoo(3);
		Animal ani = new Animal("blue", "jim", 30.56, 40.65);
		Animal ani2 = new Animal("green", "tim", 40.56, 60.30);
		Animal ani3 = new Animal("purple", "linus", 20.00, 34.00);
		zoo.addAnimal(ani);
		zoo.addAnimal(ani2);
		zoo.addAnimal(ani3);
		double expected = 3;
		double actual = zoo.getCapacity();
		Assert.assertEquals(expected, actual);
	}
	//tests toString()
	public void toStringTest() throws AssertException {
		Zoo zoo = new Zoo(3);
		Animal ani = new Animal("blue", "jim", 30.56, 40.65);
		zoo.addAnimal(ani);
		
		String expected = "These animals live in the zoo: \n" + "jim, a blue-colored animal. 30.6 pounds, 40.7 inches\n";
		String actual = zoo.toString();
		Assert.assertEquals(expected, actual);
	}
}