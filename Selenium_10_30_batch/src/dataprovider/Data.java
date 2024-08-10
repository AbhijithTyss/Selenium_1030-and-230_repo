package dataprovider;

import org.testng.annotations.DataProvider;

public class Data {
	@DataProvider
	public String[][] loginData() {
		String data[][]= {
				{"admin","admin"},
				{"user","user"},
				{"abhis@gmail.com","abhi@1234"}
				};
		return data;
	}
}
