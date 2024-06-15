package Test.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import dev.failsafe.internal.util.Assert;

public class myfirstproject {

	private static final String Assertions = null;
	private static final String List = null;

	public static void main(String[] args) throws InterruptedException {

		// Hello
			
		System.setProperty ("Webdriver.chrome.driver", "C:\\apps\\Selenium\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tendable.com");
		
		WebElement home= driver.findElement(By.xpath("//a[@class='logo']"));
		
		home.click();
        System.out.println("Home Menu is accessible");
		
		//Verify if the button is present
		boolean isElementDisplayed = driver.findElement(By.xpath("//a[@class='button ' and text()='Request A Demo']")).isDisplayed();
		Assert.isTrue(isElementDisplayed, Assertions, true);
		System.out.println("Request A Demo is Displayed on Home");
		
		//Verify if the button is active
		boolean isElementEnabled = driver.findElement(By.xpath("//a[@class='button ' and text()='Request A Demo']")).isEnabled();
		Assert.isTrue(isElementEnabled, Assertions, true);
		System.out.println("Request A Demo is Enabled on Home");
		
		Thread.sleep(3000);
		
		WebElement ourStory= driver.findElement(By.xpath("//a[text()='Our Story ']"));
		ourStory.click();
		System.out.println("Our Story Menu is accessible");
		
		//Verify if the button is present
		boolean isElementDisplayed1 = driver.findElement(By.xpath("//a[@class='button ' and text()='Request A Demo']")).isDisplayed();
		Assert.isTrue(isElementDisplayed1, Assertions, true);
		System.out.println("Request A Demo is Displayed on Our Story Menu");
		
		//Verify if the button is active
		boolean isElementEnabled1 = driver.findElement(By.xpath("//a[@class='button ' and text()='Request A Demo']")).isEnabled();
		Assert.isTrue(isElementEnabled1, Assertions, true);
		System.out.println("Request A Demo is Enabled on Our Story Menu");
		
		WebElement ourSolution= driver.findElement(By.xpath("//a[text()='Our Solution ']"));		
		ourSolution.click();
		
		System.out.println("Our Solution Menu is accessible");
		
		//Verify if the button is present
		boolean isElementDisplayed11 = driver.findElement(By.xpath("//a[@class='button ' and text()='Request A Demo']")).isDisplayed();
		Assert.isTrue(isElementDisplayed11, Assertions, true);
		System.out.println("Request A Demo is Displayed on Our Story Menu");
		
		//Verify if the button is active
		boolean isElementEnabled11 = driver.findElement(By.xpath("//a[@class='button ' and text()='Request A Demo']")).isEnabled();
		Assert.isTrue(isElementEnabled11, Assertions, true);
		System.out.println("Request A Demo is Enabled on Our Story Menu");
		
		WebElement whyTendable= driver.findElement(By.xpath("//a[text()='Why Tendable? ']"));
		whyTendable.click();
		
		System.out.println("Why Tendable? Menu is accessible");
		
		//Verify if the button is present
		boolean isElementDisplayed2= driver.findElement(By.xpath("//a[@class='button ' and text()='Request A Demo']")).isDisplayed();
		Assert.isTrue(isElementDisplayed2, Assertions, true);
		System.out.println("Request A Demo is Displayed on Why Tendable? Menu");
		
		//Verify if the button is active
		boolean isElementEnabled2 = driver.findElement(By.xpath("//a[@class='button ' and text()='Request A Demo']")).isEnabled();
		Assert.isTrue(isElementEnabled2, Assertions, true);
		System.out.println("Request A Demo is Enabled on Why Tendable? Menu");
		
		//Navigate to Contact Us
		driver.findElement(By.xpath("//a[text()='Contact Us']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[text()='Contact'])[1]")).click();
		driver.findElement(By.xpath("(//input[@name='fullName'])[1]")).sendKeys("Supriya Kundale");
		driver.findElement(By.xpath("(//input[@name= 'organisationName'])[1]")).sendKeys("HCL");
		driver.findElement(By.xpath("(//input[@name='cellPhone'])[1]")).sendKeys("123456789");
		driver.findElement(By.xpath("(//input[@name='email'])[1]")).sendKeys("abc@gmail.com");
		Select dropdown = new Select(driver.findElement(By.xpath(("(//select[@id='form-input-jobRole'])[1]"))));
		dropdown.selectByVisibleText("Other");
		driver.findElement(By.xpath("(//input[@name='consentAgreed'])[1]")).click();
		driver.findElement(By.xpath("(//button[text()='Submit'])[1]")).click();
		
		Thread.sleep(3000);

		String actualerrormsg;
		actualerrormsg= driver.findElement(By.xpath("//div[@class='ff-form-errors']")).getText();

		if(actualerrormsg.equals("Sorry, there was an error submitting the form. Please try again.")) {
			System.out.println("Test Passed");	
		}
		else {
			System.out.println("Test Failed");	
		}

		driver.quit();
	}

}
