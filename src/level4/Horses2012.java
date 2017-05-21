// Copyright Wintriss Technical Schools 2013

package level4;

import static org.junit.Assert.*;

import org.junit.Test;

public class Horses2012 {

	// 1. read question #3 here: http://apcentral.collegeboard.com/apc/public/repository/ap_frq_computerscience_12.pdf
	// 2. try to solve part (a) on paper

	// 3. make this test pass
	@Test 
	public void testHorseObject() throws Exception {
		Horse horse = new Horse("Trigger", 1340);
		assertEquals("Trigger", horse.getName());
		assertEquals(1340, horse.getWeight());
	}

	@Test
	public void testSetUpSpaces() throws Exception {
		// 4. create and initialize HorseBarn object
		// 5. initialize spaces as in AP exam page 14
		// 5.5 set the spaces array in the horseBarn object
		// 6. extract the last 3 steps into a method called "createTestBarn()"
		// 7. make the following asserts pass
		horseBarn horseBarn3 = horseBarn.createTestBarn();
		assertEquals("Trigger", horseBarn3.getSpaces()[0].getName());
		assertEquals("Silver", horseBarn3.getSpaces()[2].getName());
		//assertEquals("Lady", horseBarn3.getSpaces()[3].getName());
		assertEquals("Patches", horseBarn3.getSpaces()[5].getName());
		assertEquals("Duke", horseBarn3.getSpaces()[6].getName());
	}


	@Test
	public void testPartA() throws Exception {
		horseBarn horseBarn2 = horseBarn.createTestBarn();
		assertEquals(0, horseBarn2.findHorseSpace("Trigger"));// 0 A horse named Trigger is in space 0.
		assertEquals(2, horseBarn2.findHorseSpace("Silver")); // 2 A horse named Silver is in space 2.
		assertEquals(-1, horseBarn2.findHorseSpace("Coco"));// -1 A horse named Coco is not in the barn
	}
	
	// 8. try to solve part (b) on paper
	
	@Test
//	public void testPartB() throws Exception {
		// 9. set up the barn
		//horseBarn barn4 = horseBarn.createTestBarn();
		//barn4.consolidate();
		// 10. write asserts that verify that the barn was consolidated (see page 16)
		//assertTrue(true);
	//}
	
	

}


