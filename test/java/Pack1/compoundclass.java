package Pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class compoundclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
WebDriver driver = new FirefoxDriver();
		
		//driver.manage().window().maximize();
		driver.get("http://www.calcxml.com/calculators/mortgage-calculator?");
		driver.findElement(By.id("loanAmount")).clear();
		driver.findElement(By.id("loanAmount")).sendKeys("2000");
		
		driver.findElement(By.id("interestRate")).clear();
		
		
		
		//driver.manage().window().maximize();
		driver.findElement(By.id("interestRate")).sendKeys("6%");
		
		
		
		driver.findElement(By.id("termMonths")).clear();
		driver.findElement(By.id("termMonths")).sendKeys("20");
		
		
		
	driver.findElement(By.className("pure-button-primary")).click();
		
	driver.findElement(By.className("pure-button-primary")).sendKeys(Keys.END);
		
		
		
	}

}
