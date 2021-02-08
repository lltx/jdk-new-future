package com.pig4cloud;

/**
 *
 * @author lengleng
 * @date 2021/2/8
 */
public interface PrivateInterface {

	private void printF(){
		System.out.println("lengleng");
	}

	default void getPassword(){
		printF();
		System.out.println("123456");
	}
}
