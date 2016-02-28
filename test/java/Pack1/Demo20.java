package Pack1;

import java.sql.Date;
import java.util.Calendar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new FirefoxDriver();
driver.navigate().to("http://www.timeanddate.com/weather/");
driver.manage().window().maximize();
WebElement search_btn = driver.findElement(By.id("wcquery"));
search_btn.sendKeys("bangalore");	
WebElement click_btn = driver.findElement(By.cssSelector("input[class='three blue'][value='Search']"));
click_btn.click();

/*WebElement current_time = driver.findElement(By.cssSelector("span[id='wtct']"));
WebElement current_time = driver.findElement(By.linkText("21 Feb 2016, 14:44:17"));
String text = current_time.getText();
System.out.println(text);
long currentTimeMillis = System.currentTimeMillis();
 Calendar instance = Calendar.getInstance();

Syif(text.equals(currentTimeMillis)){
	System.out.println("pass");
}
else{
	System.out.println("fail");
}*/


WebElement weather_now = driver.findElement(By.xpath(".//*[@id='wt-5hr']/tbody/tr[3]/td[1]"));
String td1 = weather_now.getText();
System.out.println(td1);
WebElement weather_1hour = driver.findElement(By.xpath(".//*[@id='wt-5hr']/tbody/tr[3]/td[2]"));
String td2 = weather_1hour.getText();
System.out.println(td2);
WebElement weather_2hour = driver.findElement(By.xpath(".//*[@id='wt-5hr']/tbody/tr[3]/td[3]"));
String td3 = weather_2hour.getText();
System.out.println(td3);
WebElement weather_3hour = driver.findElement(By.xpath(".//*[@id='wt-5hr']/tbody/tr[3]/td[4]"));
String td4 = weather_3hour.getText();
System.out.println(td4);
WebElement weather_4hour = driver.findElement(By.xpath(".//*[@id='wt-5hr']/tbody/tr[3]/td[5]"));
String td5 = weather_4hour.getText();
System.out.println(td5);
WebElement weather_5hour = driver.findElement(By.xpath(".//*[@id='wt-5hr']/tbody/tr[3]/td[6]"));
String td6 = weather_5hour.getText();
System.out.println(td6);







	}

}
