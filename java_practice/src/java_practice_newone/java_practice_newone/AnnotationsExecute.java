package java_practice_newone;

import org.testng.annotations.*;

public class AnnotationsExecute {

     @Test
     public  void a() {
    	                                             /// before suite ,beforemethod ,test a, aftermethod, before suite,beforemethod,test b,aftermethod
    	                        
    	                               
   	 System.out.println("A Test method ");
     }
     
     @Test
     public void b() {
    	 
    	 System.out.println("B Test method");
     }
     
     @BeforeSuite 
     public void c() {
    	 
    	 System.out.println("C Before Suite Method");
    	 
     }
     
     @BeforeMethod
     public void  d() {
    	 System.out.println("D Before Method ");
     }
     
     @AfterMethod
    	 public void e() {
    		 System.out.println("E After method ");
    	 }
    	 
     @BeforeClass
    		 public void f() {
    			 System.out.println("F before class method");
    	 
    	 
     }

}
