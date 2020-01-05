package TestNG;


import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import CustomExceptions.InvalidUserorPasswordException;

public class TestData1{
	/*@Test(expectedExceptions= {ArithmeticException.class,IOException.class})
	public void positiveTestCase() {
		System.out.println("Hello");
		throw new ArithmeticException();
	}
	*/
	
@Test(dataProvider="LoginDataProvider", dataProviderClass=DataProviders.class)
public void m1(String uname, String pass) throws InvalidUserorPasswordException {
	if(uname.contains("user")&& pass.contains("pass")) {
		System.out.println(uname+"\t"+pass);
	}else {
		throw new InvalidUserorPasswordException();
	}
	System.out.println(uname+"\t"+pass);
}

}

