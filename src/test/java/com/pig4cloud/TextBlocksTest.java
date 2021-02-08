package com.pig4cloud;

import org.junit.Test;

/**
 *
 * @author lengleng
 * @date 2021/2/8
 */
public class TextBlocksTest {

	@Test
	public void testNewJdk13TextBlock(){
		var text = """
               {
                    "username": "lengleng",
                    "password": "123456"
               }
               """;
		System.out.println(text);
	}

	@Test
	public void testNormalString(){
		String text = "{" + "\n"
				+"    \"username\": \"lengleng\",\n"
				+"    \"password\": \"123456\" \n"
				+"}";
		System.out.println(text);
	}
}
