package java_practice_newone;

import org.testng.annotations.*;


public class TESTNG1 {
	
	@Test
	public void a2() {
		System.out.println("Hello a2 test method");
	}
	
	@BeforeTest
	public void b() {
		System.out.println("Hello b method ");
	}
	

	@BeforeSuite
	public void c() {
		System.out.println("Hello c method ");
	}
	
	@AfterMethod
	public void d() {
		System.out.println("Hello d method ");
	}
	
	@BeforeClass
	public void e() {
		System.out.println("Hello e method ");
	}


	@AfterTest
	public void f() {
		System.out.println("Hello f method ");
	}
	
	@AfterClass
	public void g() {
		System.out.println("Hello g method ");
	}
	
	@AfterSuite
	public void h() {
		System.out.println("Hello h method ");
	}
	
	@BeforeMethod
	public void i() {
		System.out.println("Hello i method ");
	}
	
	@Test
	public void a1() {
		System.out.println("Hello a1 test method ");
	}
	
	@Test
	public void A1() {
		System.out.println("Hello A1 test method ");
	}
	
	
}
