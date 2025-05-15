package com.practice.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {

	public LoginPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='UserName']")
	WebElement userNametxt;

	@FindBy(xpath = "//input[@id='Password']")
	WebElement passWordtxt;

	@FindBy(xpath = "//button[@id='btnLogin']")
	WebElement signInbtn;

	public void login(String userName, String password) {

		userNametxt.sendKeys(userName);
		passWordtxt.sendKeys(password);

		//signInbtn.click();

	}

}
