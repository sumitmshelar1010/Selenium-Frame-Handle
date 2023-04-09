package MainPackage.SeleniumChromeDriver.locators.iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class IFrameSimple {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver wd = new ChromeDriver();
        wd.get("https://www.hyrtutorials.com/p/frames-practice.html");
        wd.manage().window().maximize();

        List<WebElement> frms = wd.findElements(By.tagName("iframe"));
        System.out.println(frms.size());

        wd.switchTo().frame(wd.findElement(By.id("frm1")));
        Select s = new Select(wd.findElement(By.id("course")));
        Thread.sleep(3000);
        s.selectByVisibleText("Python");
        wd.switchTo().defaultContent();//This is used to switch to  parent webPage
        Thread.sleep(3000);
        wd.findElement(By.id("name")).sendKeys("Sumit");
        Thread.sleep(3000);
        wd.close();
    }
}
