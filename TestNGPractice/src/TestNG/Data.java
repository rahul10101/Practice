package TestNG;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data {
	/*@Test(expectedExceptions= {ArithmeticException.class,IOException.class})
	public void positiveTestCase() {
		System.out.println("Hello");
		throw new ArithmeticException();
	}
	*/
	
@Test(dataProvider="LoginDataProvider")
public void m1(String uname, String pass) {
	System.out.println(uname+"\t"+pass);
}

@DataProvider(name="LoginDataProvider")
public Object[][] loginData(){
	Object[][] values= {{"user1","pass1"},{"user2","pass2"},{"user3","pass3"}};
	return values;
}

}
