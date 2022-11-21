package junitestpackage;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class testAddStrings {

	@Test
	public void test() {
		junitestfunctions JUnit = new junitestfunctions();
		String result = JUnit.addstring("Vipin ", "Goyat");
		assertEquals("Vipin Goyat",result);
	}

}