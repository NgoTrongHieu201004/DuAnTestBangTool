package demo2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class bai1_1 {

    public static void main(String[] args) {
        // Thiết lập đường dẫn tới ChromeDriver
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Mở URL
        driver.get("https://demo.guru99.com/test/web-table-element.php");

        // Lấy giá trị từ ô cụ thể trong bảng và lưu vào biến
        String sCellValue = driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[5]/td[4]")).getText();
        System.out.println(sCellValue);

        // Lấy tiêu đề của các cột và in ra
        for (int k = 1; k < 6; k++) {
            String Header = driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th[" + k + "]")).getText();
            System.out.print(Header + "---");
        }

        // Đóng trình duyệt
        driver.close();
    }
}

