package week4.day1;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class HtmlPrinttheValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =new ChromeDriver();
		driver.get("http://html.com/tags/table/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		String marketShare = driver.findElement(By.xpath("((//table)[1]//tr)[2]/td[1]")).getText();
		System.out.println(marketShare);
		
		List<String> listmarketShare = new ArrayList<String>();
		for (int i = 1; i <= 4; i++) {
			
			String marketShare1 = driver.findElement(By.xpath("((//table)[1]//tr)[2]/td["+i+"]")).getText();
			listmarketShare.add(marketShare1);
			
			
		}
		System.out.println("MarketSHare vaule--" + listmarketShare);
		
		String library2= driver.findElement(By.xpath("((//table)[1]//tr)[3]/td[1]")).getText();
		System.out.println(library2);
		//ABS
		List<String> AbsoluteUsage1 = new ArrayList<String>();
		for(int j=1; j<=4;j++) {
			String absusage = driver.findElement(By.xpath("((//table)[1]//tr)[3]/td["+j+"]")).getText();
			AbsoluteUsage1.add(absusage);
			
		}
		
		System.out.println("AbsoluteUsage vaule--"  + AbsoluteUsage1);
	}

}
