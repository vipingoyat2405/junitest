package junitestpackage;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class testAddNumbers {

	@Test
	public void test() {
		junitestfunctions JUnit = new junitestfunctions();
		int result = JUnit.addnumber(100,200);
		assertEquals(300,result);
	}

}