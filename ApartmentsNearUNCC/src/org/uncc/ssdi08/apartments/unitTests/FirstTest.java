package org.uncc.ssdi08.apartments.unitTests;

import static org.junit.Assert.*;

import org.junit.Test;
import org.uncc.ssdi08.apartments.models.dao.DatabaseConnection;

public class FirstTest {

	@Test
	public void test() {
		boolean isTrue=DatabaseConnection.isValidLogin("test1@test.com", "test");
		assertEquals(true, isTrue);
		//fail("Not yet implemented");
	}

}
