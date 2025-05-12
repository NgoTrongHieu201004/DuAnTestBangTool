package demo2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class bai1 {
		    public static void main(String[] args) {
		        // Thiết lập đường dẫn tới ChromeDriver
		        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		        WebDriver driver = new ChromeDriver();
		        driver.manage().window().maximize();
		        // Mở URL
		        driver.get("https://demo.guru99.com/test/web-table-element.php");

		        // Lấy giá trị từ ô cụ thể trong bảng và lưu vào biến
		        String sCellValue = driver.findElement(By.xpath("/html/body/div/div[3]/div[1]/table/tbody/tr[1]/td[1]")).getText();
		        System.out.println(sCellValue);

		        // Click vào liên kết trong ô bảng
		        driver.findElement(By.xpath("/html/body/div/div[3]/div[1]/table/tbody/tr[1]/td[1]")).click();
		    }
	}
