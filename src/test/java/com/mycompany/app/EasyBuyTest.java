package com.mycompany.app;

import org.testng.annotations.Test;

public class EasyBuyTest {
	
	//for each class we have mention Test in the classname then only our tests will run
	@Test
	public void first()
	{
		System.out.println("first test case");
	}
	
	@Test
	public void second()
	{
		System.out.println("second test case");
	}
}
