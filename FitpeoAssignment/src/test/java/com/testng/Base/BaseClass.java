package com.testng.Base;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;


	public class BaseClass {
		WebDriver driver;
		
		public void launchChromeBrowser()
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\ChromeDriver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://www.fitpeo.com/");
			driver.manage().window().maximize();
			driver.get("https://fitpeo.com/revenue-calculator");
			
	}

	public void searchAndAccessApp() throws InterruptedException
	{
		
		 JavascriptExecutor js = (JavascriptExecutor) driver;
         js.executeScript("window.scrollBy(0, 400);");
         Thread.sleep(2000);

		WebElement inputField = driver.findElement(By.id(":R57alklff9da:"));
        inputField.click();
        Actions actions = new Actions(driver);
        actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).perform();
		driver.findElement(By.id(":R57alklff9da:")).sendKeys("820");
       
		Thread.sleep(2000);
		WebElement inputField1 = driver.findElement(By.id(":R57alklff9da:"));
        inputField1.click();
        Actions actions1 = new Actions(driver);
        actions1.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).perform();
		driver.findElement(By.id(":R57alklff9da:")).sendKeys("560");
		Thread.sleep(2000);
		WebElement inputField2 = driver.findElement(By.id(":R57alklff9da:"));
        inputField2.click();
        Actions actions2 = new Actions(driver);
        actions2.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).perform();
		driver.findElement(By.id(":R57alklff9da:")).sendKeys("820");
		Thread.sleep(2000);
	}

		public void validateCheckbox() {
		List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
          for (int i = 0; i < 4; i++) {
              WebElement checkbox = checkboxes.get(i);
                  checkbox.click();
              }}
		public void validateValue() throws InterruptedException {
			FluentWait<WebDriver> wait = new FluentWait<>(driver)
	                .withTimeout(Duration.ofSeconds(30))
	                .pollingEvery(Duration.ofSeconds(2))
	                .ignoring(Exception.class);
			
          WebElement totalReimbursementHeader = wait.until(ExpectedConditions.visibilityOfElementLocated(
        		  By.cssSelector("div.MuiBox-root.css-m1khva p.MuiTypography-root.MuiTypography-body1.inter.css-12bch19")));
              String totalReimbursementValue = totalReimbursementHeader.getText();
              
              boolean isValueCorrect = totalReimbursementValue.equals("110700");
              System.out.println("Is the total reimbursement value correct?" + isValueCorrect);
              Thread.sleep(2000);
     		 JavascriptExecutor js1 = (JavascriptExecutor) driver;
             js1.executeScript("window.scrollTo(0, document.body.scrollHeight);");
             Thread.sleep(2000);
		}
             public void closeBrowser() {
              driver.quit();
	}
	}



