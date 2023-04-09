package MainPackage.SeleniumChromeDriver.locators.iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeNested {//Nested Iframes
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver wd = new ChromeDriver();
        wd.get("https://www.hyrtutorials.com/p/frames-practice.html");
        WebElement we = wd.findElement(By.id("name"));
        we.sendKeys("SumitShelar");
        Thread.sleep(3000);
        wd.switchTo().frame(wd.findElement(By.id("frm3")));
         wd.findElement(By.id("name")).sendKeys("BhavikaShelar");
        Thread.sleep(3000);
        wd.switchTo().frame(wd.findElement(By.id("frm2")));
        Thread.sleep(3000);
        wd.findElement(By.id("lastName")).sendKeys("PrachiShelar");
        wd.switchTo().defaultContent(); // This is used to switch to Home Page
        wd.switchTo().parentFrame();// This is used to switch to parent frame
        wd.findElement(By.id("name"));
        Thread.sleep(3000);
        we.sendKeys("SumitShelar");
        wd.close();



    }
}
