package Gold_Utility;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Gold_Base {

	public static WebDriver driver;
	public static Properties GoPro;
	
	
	
	public Gold_Base() {
	try {
		FileInputStream goFle = new FileInputStream(System.getProperty("user.dir")+("//src//test//java//Gold_Config//Gold_Config.Properties"));
		GoPro = new Properties();
		GoPro.load(goFle);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		System.out.println("Please,look the code");
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	public void GoBrowser() {
	String GoAllBrowser	= GoPro.getProperty("GoBrowser1");
	
	if(GoAllBrowser.equalsIgnoreCase("Chrome")) {
	
	System.setProperty("Webdriver.chrome.driver",System.getProperty("user.dir")+("//Gold_ChromeDriver//chromedriver.exe"));	
	ChromeOptions ss = new ChromeOptions();
	ss.addArguments("--remote-allow-origins=*");
	driver = new ChromeDriver();
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.manage().window().maximize();
	
		
	}
		
	else if(GoAllBrowser.equalsIgnoreCase("Edge")) {
	System.setProperty("Webdriver.edge.driver",System.getProperty("user.dir")+("//Gold_EdgeDriver//msedgedriver.exe"));	
	EdgeOptions ss = new EdgeOptions();
	ss.addArguments("--remote-allow-origins=*");
	driver = new EdgeDriver();
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Gold_Utiliti.pageLoadTimeout));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Gold_Utiliti.implicitlyWait));
	driver.manage().window().maximize();
		
	
	}
	}
	public static void GoLaunchURL(String URL) {
		driver.get(GoPro.getProperty("GoURL"));
		
	}
	
}
