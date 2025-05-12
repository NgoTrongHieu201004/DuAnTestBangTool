package baiTap;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class alert {
	public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/delete_customer.php");
        driver.findElement(By.name("cusid")).sendKeys("22558899");
        driver.findElement(By.name("submit")).submit();

        org.openqa.selenium.Alert alert = driver.switchTo().alert();

        String alertMessage = alert.getText();

        System.out.println(alertMessage);
        Thread.sleep(3000);

        alert.accept();

        driver.findElement(By.name("cusid")).sendKeys("12345");
        driver.findElement(By.name("submit")).click();
        Thread.sleep(3000);

        alert = driver.switchTo().alert();
        alert.dismiss();
        Thread.sleep(3000);

        driver.findElement(By.name("res")).click();
    }
}
