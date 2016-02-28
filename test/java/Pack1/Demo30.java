package Pack1;

import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String exact1;
		String exact12="17";
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("http://www.timeanddate.com/weather/");
		driver.manage().window().maximize();
		WebElement search_btn = driver.findElement(By.id("wcquery"));
		search_btn.sendKeys("bangalore");	
		WebElement click_btn = driver.findElement(By.cssSelector("input[class='three blue'][value='Search']"));
		click_btn.click();
		WebElement current_time = driver.findElement(By.cssSelector("span[id='wtct']"));
		//WebElement current_time = driver.findElement(By.linkText("21 Feb 2016, 14:44:17"));
		String text = current_time.getText();
		String text1=text.substring(13,15);
		//int length1 = text.length();
		System.out.println(text1);
		
		 Calendar instance = Calendar.getInstance();
		 Date time = instance.getTime();
		 
		System.out.println(time);
		String string12 = time.toString();
		System.out.println("converted string is "+string12);
		CharSequence exact = string12.substring(11, 13);
		System.out.println("exact time is "+exact);
		
		
		System.out.println("next time is "+exact);
	
		
		WebElement now_date = driver.findElement(By.xpath("//*[@id='wt-5hr']/tbody/tr[1]/td[2]"));
		String nowtime = now_date.getText();
		System.out.println("curren hour is " +nowtime);
		if(exact.equals(nowtime)){
			System.out.println("passed");
		}
		else{
			System.out.println("failed");
		}
		driver.quit();
		
		
		
		
		
	
		
		
		
		
		
		
		

	
	}

}
