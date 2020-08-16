package com.inetBanking.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class BaseClass {

	public String baseURL = "http://demo.guru99.com/Security/SEC_V1/index.php";
	public String username = "mngr278617";
	public String password = "meryquz";
	public static WebDriver driver;
	
	@BeforeClass
	public void setup() {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Driver//chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	
	
}
