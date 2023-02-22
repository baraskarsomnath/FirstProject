package Assertion;

import org.testng.annotations.Test;

public class SoftAssert {
	@Test
	public void m1() {
		
		SoftAssert aa = new SoftAssert();
		
		String a=("Somnath Baraskar");
		String b=("Somnath Baraskar");
		
	    aa.assertEquals(a, b);
		System.out.println("Frist soft assert is pass");
		
		String c=("Somnath Baraskar");
		String d=("Somnath ");
		
		aa.assertEquals(c, d);
		System.out.println("Second soft assert is Filed");
		
		String e=("Somnath Baraskar");
		String f=("Somnath Baraskar");
		
		aa.assertEquals(e, f);
		System.out.println("Third soft assert is pass");
		
	    aa.assertAll();
	    }

	     private void assertAll() {
		// TODO Auto-generated method stub
		
	}

	    private void assertEquals(String a, String b) {
		// TODO Auto-generated method stub
		
	}

	
	}

	
		
	
	    
        