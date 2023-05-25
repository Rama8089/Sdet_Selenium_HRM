package in.prodapt;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC001 {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver",
				"D:\\Drivers\\ChromeDriver\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// navigate url
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		// verify title
		if (driver.getTitle().equals("OrangeHRM")) {
			System.out.println("Title Matched");
		} else {
			System.out.println("Title not matched");
		}
		System.out.println("Thank you");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		// Thread.sleep(3000);

		// Login and logout
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		// login button
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);

		/*
		 * Actions actions = new Actions(driver);
		 * actions.moveToElement(driver.findElement(By.xpath(
		 * "//p[@class='oxd-userdropdown-name']"))).click();
		 */
		driver.findElement(By.linkText("PIM")).click();

		// Add employee
		Thread.sleep(3000);
		driver.findElement(By.linkText("Add Employee")).click();
		// Enter first name
		Thread.sleep(3000);
		driver.findElement(By.name("firstName")).sendKeys("varun");

		// Enter middle name
		Thread.sleep(3000);
		driver.findElement(By.name("middleName")).sendKeys("kumar");

		// Enter last name
		Thread.sleep(3000);
		driver.findElement(By.name("lastName")).sendKeys("kotti");
		// save employee
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@type='submit']")).submit();

		Thread.sleep(5000);
		driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']")).click();
		// Thread.sleep(5000);

		// logout button
		driver.findElement(By.linkText("Logout")).click();
	}
}
