package TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Testngcases {
	private static final String dependsOn = null;
	@Test(priority=2)
	public void m1()
	{
		System.out.println("m1 Test case");
		}


@Test(priority=1)
public void m2()
{
	System.out.println("m2 Test case");
	}

@Test(dependsOnMethods= {"m1"})
public void m3()
{
	System.out.println("m3 Test case");
	}

@Test(enabled=false)
public void m4()
{
	System.out.println("m4 Test case");
	}
@Test(enabled=true)
public void m5()
{
	System.out.println("m5 Test case");

}
}