package java_practice_newone;

import org.testng.Assert;
import org.testng.annotations.Test;

public class trycatchassertion {

	int a = 50;
	int b = 100;
	
	@Test
	public void a() {
		try {
			Assert.assertEquals(a,b,"Assertion is failed");
		}catch(AssertionError e) {
			e.printStackTrace();	
		}
		System.out.println("Assertion equals");
	}
}
