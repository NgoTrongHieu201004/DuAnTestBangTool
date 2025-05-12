package demo2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class bai2 {

    public static void main(String[] args) {
        // Thiết lập đường dẫn tới ChromeDriver
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Mở URL
        driver.get("https://demo.guru99.com/test/web-table-element.php");

        String Expect_Value = "A";
        for (int i = 1; i <= 5; i++) {
            String Actual_Value = null;
            Actual_Value = driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[" + i + "]/td[2]")).getText();
            if (Actual_Value.equalsIgnoreCase(Expect_Value)) {
                // Nếu sValue khớp với mô tả, nó sẽ khởi tạo thêm một vòng lặp bên trong cho tất cả các cột của hàng 'i'
            	for (int j = 1; j <= 5; j++) 
            	{ 
            		String RowValues = driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[" + i + "]/td[" + j + "]")).getText();
            		System.out.print(RowValues + "---");
            	}
            	System.out.println();
            }
        }
    }

}
