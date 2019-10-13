package assi;

import org.testng.annotations.DataProvider;

public class Data {
	
@DataProvider (name="RegisterData")
public Object [] [] testdata(){
	return new Object [] [] {
		{"Pradnya", "Bedke"},
		{"Nidhi", "Taranekar"},
		{"Snehal", "Shevade"}
	};
}

}
