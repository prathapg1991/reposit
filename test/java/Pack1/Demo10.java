package Pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo10 {

	public static void main(String[] args) {
	
//String expected_value="1,00,000";		
		
		// TODO Auto-generated method stub
WebDriver driver =new FirefoxDriver();
driver.get("https://search.yahoo.com/");
driver.manage().window().maximize();
WebElement Search_btn = driver.findElement(By.id("yschsp"));
Search_btn.sendKeys("Selenium");
driver.findElement(By.className("sbb")).click();
String text = driver.findElement(By.xpath("//span[contains(text(),'results')]")).getText();
//String text = driver.findElement(By.cssSelector("/html/body/div[3]/div[3]/div[1]/div/div[1]/div/ol/li/div/div/span")).getText();
//String text = driver.findElement(By.cssSelector("span[id='yui_3_10_0_1_1455961274261_900']")).getText();
System.out.println(text);
//String replace = text.replace(" results", "");
//System.out.println(replace);
//int parseInt = Integer.parseInt("text");
String string1 = text.split(" ")[0];
String str12=string1.replace(",","");
String str123=str12.replace("results",",");
int parseInt = Integer.parseInt(str123);
if(parseInt>100000)
{
	System.out.println("pass");
}
else{
	System.out.println("fail");
}




	}



	}


