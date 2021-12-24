package page;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestPage {
	
	public static WebDriver driver;

	public static void init() {
		System.setProperty("webdriver.chrome.driver","drivers\\chromedriver.exe" );
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
	}
	public static void  takeScreenShot(WebDriver driver) throws WebDriverException, IOException {
		TakesScreenshot sc = (TakesScreenshot)driver;
		sc.getScreenshotAs(OutputType.FILE);
		System.getProperty("user.dir");
		SimpleDateFormat format = new SimpleDateFormat("MMddyy");
		Date date = new Date();
		String lable = format.format(date);
		FileUtils.copyFile(sc.getScreenshotAs(OutputType.FILE), new File(System.getProperty("user.dir") + "/screenshoot/" + lable +".png"));
		
	}
}
