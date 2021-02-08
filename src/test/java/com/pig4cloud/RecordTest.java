package com.pig4cloud;

import org.junit.Test;

/**
 *
 * @author lengleng
 * @date 2021/2/8
 */
public class RecordTest {

	@Test
	public void testJdk15Record() {
		var demo = new Demo("lengleng", "123456");
		System.out.println(demo.password());
		System.out.println(demo.username());
	}

}
