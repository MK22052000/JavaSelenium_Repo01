package java_practice_newone;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion2 {
	
	@Test
	public void a() {
		
		int a = 10;
		int b = 10;
		
		Assert.assertEquals(a,b,"Assertion is failed");
		System.out.println("Assertion equals");
		
		
		//falseassertion 
		Assert.assertFalse(a>b);
		System.out.println("False assertion verified");
		
		
		
		//trueAssertion 
		Assert.assertTrue(a<b,"not true assertion");
		System.out.println("true assertion ");
	}
	
	
	@Test
	public void b() {
		
		System.out.println("Hi new");
	}

}
