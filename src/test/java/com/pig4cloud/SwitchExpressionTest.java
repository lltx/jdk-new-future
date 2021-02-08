package com.pig4cloud;

import org.junit.Test;

public class SwitchExpressionTest {

	@Test
	public void testNewJdk12MultiSwitch() {
		var day = 2;
		switch (day) {
		case 1, 2, 3, 4, 5 -> System.out.println("workday");
		case 6, 7 -> System.out.println("weekend");
		default -> System.out.println("invalid");
		}
	}

	@Test
	public void testNormalSwitch() {
		int day = 2;
		switch (day) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("workday");
		case 6:
		case 7:
			System.out.println("weekend");
		default:
			System.out.println("invalid");
		}
	}
}
