package java_practice_newone;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependentTestScript {
	
	@Test
	public void a() {
		Assert.assertTrue(3>12);
		System.out.println("Condition is true");
	}
	
	
	@Test
	public void b() {
		Assert.assertTrue(3<12 & 4>3);
		System.out.println("Condition is true");
	}
	

	@Test(dependsOnMethods = {"a","b"})
	public void c() {
		System.out.println("Condition is true");
	}
	
	
	
}
