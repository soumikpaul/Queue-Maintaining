package dequeAssgn;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BooksTest {

	@Test
	void test() {
		//fail("Not yet implemented");
		String dummyBookName="the";
		int dummyPrice=500;
		Books newBook=new Books();
		assertEquals(newBook.getName(),dummyBookName);
		assertEquals(newBook.getPrice(),dummyPrice);

	}

}
