import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;



public class Parameters {

		WebDriver driver = new ChromeDriver();
		SoftAssert myAssertion = new SoftAssert();
		
		static String URL = "https://www.almosafer.com/en";
		String DefaultCurrency = "SAR";
		String QatariCurrency = "QAR";
		String ContactNumber = "+966554400000";
		
		

	}


