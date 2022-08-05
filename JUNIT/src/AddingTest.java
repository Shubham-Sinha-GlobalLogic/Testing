import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AddingTest {

	@Test
	void testAdd() {
		
		Adding ob=new Adding();
		int res=ob.add(10, 20);
		assertEquals(30,res);
		
	}

}
