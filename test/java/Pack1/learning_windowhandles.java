package Pack1;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class learning_windowhandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		
		String Parent_window = driver.getWindowHandle();
		System.out.println(Parent_window);
		
		String Child_window="";
		
		//driver.manage().window().maximize();
		driver.get("http://in.rediff.com/");
		
		Set<String> windowhandles = driver.getWindowHandles();
		
		System.out.println("-------------------");
		for(String element:windowhandles )
		{
			
			System.out.println(element);
			if((element.contains(Parent_window))==false)
			{
				driver.switchTo().window(element);
				System.out.println(driver.getTitle());
				driver.close();
			}
		}
		
		driver.switchTo().window(Parent_window);
		System.out.println(driver.getTitle());
		driver.close();
		
		
		

	}

}
