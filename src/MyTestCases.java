import org.testng.annotations.AfterTest;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyTestCases extends Parameters {

	@BeforeTest
	public void MyBeforeTest() {
		driver.get(URL);
	}

	@Test
	public void TestDefaultCurrency() throws InterruptedException {

		WebElement GetDefaultCurrency = driver.findElement(By.className("sc-eAKXzc"));
		String DefaultCurrencyText = GetDefaultCurrency.getText();
		// System.out.println("Default Currency is: "+DefaultCurrencyText);

		if (DefaultCurrency.equals(DefaultCurrencyText)) {

			System.out.println("Default Currency is: " + DefaultCurrencyText);
			String Actual = DefaultCurrencyText;
			String Expected = "SAR";
			myAssertion.assertEquals(Actual, Expected);

		}

		else if (DefaultCurrencyText != DefaultCurrency) {
			System.out.println("Default Currency is not SAR");
		}

	}

	@Test
	public void TestContactNumbers() {

		WebElement GetContactNumber = driver.findElement(By.xpath("//*[@id=\"__next\"]/header/div/div[1]/div[2]/div/a[2]/strong"));
		String ContactNumberTxt = GetContactNumber.getText();
		// Boolean BooleanContactNumber = Boolean.parseBoolean(ContactNumber);
		// System.out.println("******************"+ContactNumber);

		if (ContactNumber.equals(ContactNumberTxt)) {
			System.out.println("Contact Number is: " + ContactNumber);
			String ActualNumber = ContactNumberTxt;
			String ExpectedContactNumber = "+966554400000";
			myAssertion.assertEquals(ActualNumber, ExpectedContactNumber);
		}
		

	}

	@AfterTest
	private void AfterTest() {

		myAssertion.assertAll();
		driver.quit();

	}

}
