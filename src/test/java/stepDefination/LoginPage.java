package stepDefination;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPage{
	WebDriver driver;
	@Given("User Navigate to OrangeHrm site")
	public void user_navigate_to_orange_hrm_site() {
//		driver=Hooks.setup();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
	}

	@When("user put unsername {string}")
	public void user_put_unsername(String un) {
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(un);
		System.out.println("Username is Entered");
	}

	@And("password {string}")
	public void password(String pass) {
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pass);
		System.out.println("Password is Entered");
	}

	@And("click on login btn")
	public void click_on_login_btn() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		System.out.println("Clicked on Login Btn");
	}

	@Then("user should be in home page")
	public void user_should_be_in_home_page() {
		String un1 = driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']")).getText();
		System.out.println("Logger Is= " + un1);

	}

//	@When("user put unsername {string} and password {string}")
//	public void user_put_unsername_and_password(DataTable dataTable) {
//		// Initialize data table
//		List<String> data = dataTable.asList();
//		System.out.println(dataTable);
//		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(data.get(1));
//		System.out.println("Username is Entered");
//		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(data.get(3));
//		System.out.println("Password is Entered");
//	}
	
	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "D:\\Grid\\chromedriver.exe");
		driver = new ChromeDriver();
		
	}
	
	@After
	public void endup(){
		driver.quit();
	}

}
