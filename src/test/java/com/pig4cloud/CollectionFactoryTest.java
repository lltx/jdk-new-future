package com.pig4cloud;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

/**
 *
 * @author lengleng
 * @date 2021/2/8
 */
public class CollectionFactoryTest {

	@Test
	public void testNewJdk9() {
		var fruits = List.of("apple", "banana", "orange");
		var numbers = Map.of(1, "one", 2, "two", 3, "three");
	}


	@Test
	public void testNormal(){
		List<String> fruitsTmp = new ArrayList<>();
		fruitsTmp.add("apple");
		fruitsTmp.add("banana");
		fruitsTmp.add("orange");


		Map<Integer, String> numbersTmp = new HashMap<>();
		numbersTmp.put(1, "one");
		numbersTmp.put(2, "two");
		numbersTmp.put(3, "three");
	}
}
