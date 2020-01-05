package TestNG;

import org.testng.annotations.DataProvider;

public class DataProviders {
	@DataProvider(name="LoginDataProvider")
	public Object[][] loginData(){
		Object[][] values= {{"user1","pass1"},{"user2","pass2"},{"user3","pass3"},{"Rahul","Rahul123"}};
		return values;
	}
	@DataProvider(name="SignDataProvider")
public void signUpData() {
		System.out.println("Accept Signup Data from Excel Sheet");
	}
@DataProvider(name="CustomerDataProviders")
public void customerData() {
	
}
}
