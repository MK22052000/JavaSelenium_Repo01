package java_practice_newone;

import org.testng.annotations.*;

public class MultipleTestScript {
	
	
	@Test(enabled = true&false)
       private void S() {
		System.out.println("S Method ");	
		
}

	@Test(invocationCount = 3, priority = -100, enabled = true&true)
    private void d() {
		System.out.println("d Method ");
		
		
}
	
}