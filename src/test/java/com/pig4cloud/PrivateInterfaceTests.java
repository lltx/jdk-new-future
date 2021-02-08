package com.pig4cloud;

import junit.framework.TestCase;
import org.junit.Test;

/**
 *
 * @author lengleng
 * @date 2021/2/8
 */
public class PrivateInterfaceTests  {

	@Test
	public void testGetPassword() {
		var privateInterface = new PrivateInterfaceImpl();
		privateInterface.getPassword();
	}
}
