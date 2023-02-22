package Assertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert {
	@Test
	public void m1() {
		String a=("Somnath Baraskar");
		String b=("Somnath Baraskar");
		
		Assert.assertEquals(a, b);
		System.out.println("Frist hard assert is pass");
		
		String c=("Somnath Baraskar");
		String d=("Somnath ");
		
		Assert.assertEquals(c, d);
		System.out.println("Second hard assert is pass");
		
		String e=("Somnath Baraskar");
		String f=("Somnath Baraskar");
		
		Assert.assertEquals(e, f);
		System.out.println("Third hard assert is pass");
	    }
	    }
