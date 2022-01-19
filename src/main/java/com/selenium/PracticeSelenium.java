package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeSelenium {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		// WebDriver obj = new WebDriver(): //not possible since WebDriver is an
		// interface
		WebDriver driver = new ChromeDriver(); // upcasting since ChromeDriver is a class
		driver.get("https://en.wikipedia.org/wiki/Main_Page");

	}

}
