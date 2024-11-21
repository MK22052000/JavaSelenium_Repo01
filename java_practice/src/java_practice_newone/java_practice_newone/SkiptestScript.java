package java_practice_newone;


import org.testng.SkipException;
import org.testng.annotations.*;

public class SkiptestScript {
	@Test //1st way    use // before test annotation to skip
	public void a() {
		
		System.out.println("Hello a test method");
	}
	
	//2nd way - used in earlier 
	@Test(enabled = false)
	public void b() {
		 System.out.println("Hello b test method");
	}
	
	@Test(enabled = true)//true can be executable 
	public void c() {
		 System.out.println("Hello c test method");
	}
	
	@Test(invocationCount = 5)//invocation count = 5 times  executed 
	public void d() {
		 System.out.println("Hello d test method");
	}
	
	@Test(invocationCount = 0)//invocation count = 0 times executed
	public void e() {
		 System.out.println("Hello e test method");
	}
	
	//Conditional skipping 
	
	@Test
	public void f() {
		System.out.println("f test method");
		throw new  SkipException("Skipping f test method");
	}
	

}
