package Pack1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alertpop_up {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver =new FirefoxDriver();
driver.get("http://www.indiaproperties.com/");
driver.manage().window().maximize();
Thread.sleep(3000);
driver.findElement(By.id("btnPropSearch")).click();
Thread.sleep(3000);
Alert alert_btn = driver.switchTo().alert();
alert_btn.accept();
	}

}
