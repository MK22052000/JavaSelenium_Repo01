package java_practice_newone;

import org.testng.annotations.*;

public class HandlingMultipleTestScript {
	
	@Test(priority = -10) //priority to execute
	public void a1(){
		System.out.println("a1 test method");
	}
	@Test
	public void ab(){
		System.out.println("ab test method");
	}
	@Test(priority = -5)
	public void a2(){
		System.out.println("a2 test method");
	}
	@Test(priority = 0)
	public void ad(){
		System.out.println("ad test method");
	}
	
}
