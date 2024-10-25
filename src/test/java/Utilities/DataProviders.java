

package Utilities;

import java.io.IOException;
import org.testng.annotations.DataProvider;

public class DataProviders {

    @DataProvider(name = "Logindata")
    public static Object[][] getData() throws IOException {
    	
    	System.out.println("DataProvider method called");
    	
        String path = "/home/yagvendra/Documents/PracticalMaven/Java/TestData/testdata.xlsx";
        
        ExcelUtility xlutil = new ExcelUtility(path);
        
        int totalrows = xlutil.getRowCount("Sheet1");  // 
        int totalcols = xlutil.getCellCount("Sheet1", 1); // 
        
        Object[][] loginData = new Object[totalrows][totalcols]; // 
        
        for (int i = 1; i <= totalrows; i++) {
            for (int j = 0; j < totalcols; j++) {
                loginData[i - 1][j] = xlutil.getCellData("Sheet1", i, j); // 
            }
        }
        return loginData;
    }
}

