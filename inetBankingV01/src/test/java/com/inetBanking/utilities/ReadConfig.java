package com.inetBanking.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	
	Properties pro;
	
	public ReadConfig() {
		
		File src = new File ("C:\\Users\\vkbora\\eclipse-workspace\\inetBankingV01\\Configuration\\config.properties");
		
		try {
			
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		}catch (Exception e) {
			System.out.println("Exception is "+e.getMessage());
		}
	}
	
	
	public String getAppURL() {
		String url = pro.getProperty("baseURL");
		return url;
	}
	
	public String getUsername() {
		String uname = pro.getProperty("username");
		return uname;
	}
	
	public String getPassword() {
		String Password = pro.getProperty("password");
		return Password;
	}
	
	public String getChromepath() {
		String chromepath = pro.getProperty("chromepath");
		return chromepath;
	}
	
	public String getFirefoxpath() {
		String firefoxpath = pro.getProperty("firefoxpath");
		return firefoxpath;
	}
	
	public String getIEpath() {
		String Iepath = pro.getProperty("iepath");
		return Iepath;
	}
	
	
}
