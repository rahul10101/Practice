package APITest;

public class Test_API {

	public static void main(String[] args) {

		String temp = given().baseurl("http://localhost:3030/");
		when().get("product/1051384074145").asString();
		System.out.println(temp);

	}

}
