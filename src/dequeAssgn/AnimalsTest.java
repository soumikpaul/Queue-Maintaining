package dequeAssgn;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AnimalsTest {

	@Test
	void test() {
		//fail("Not yet implemented");
		Animals a=new Animals();
		String dummyAnimal="lion";
		assertEquals(a.getName().toLowerCase(),dummyAnimal);
	}

}
