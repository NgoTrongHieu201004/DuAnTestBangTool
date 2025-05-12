package demo2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

	public class bai3 {

	    @SuppressWarnings("deprecation")
	    public static void main(String[] args) {
	        // Thiết lập đường dẫn tới ChromeDriver
	        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();

	        // Mở URL
	        driver.get("https://demo.guru99.com/test/web-table-element.php");
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	        // Lấy số lượng cột
	        List<WebElement> col = driver.findElements(By.xpath("//*[@id='leftcontainer']/table/thead/tr/th"));
	        System.out.println("Số cột là: " + col.size());

	        // Lấy số lượng dòng
	        List<WebElement> rows = driver.findElements(By.xpath("//*[@id='leftcontainer']/table/tbody/tr/td[1]"));
	        System.out.println("Số dòng là: " + rows.size());

	        driver.close();
	    }
}
