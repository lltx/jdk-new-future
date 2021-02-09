package com.pig4cloud;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

/**
 *
 * @author lengleng
 * @date 2021/2/9
 */
public class VarLocalVariablelTest {

	@Test
	public void testJDK10VarLocalVariable(){
		var num1 = 1000;
		var num2 = 1.001;
		var str = "hello var";
		var list = new ArrayList<>();
		var map = new HashMap<>();
	}

	@Test
	public void testNoramlVariable(){
		int num1 = 1000;
		double num2 = 1.001;
		String str = "hello var";
		List list = new ArrayList<>();
		Map map = new HashMap();
	}
}
