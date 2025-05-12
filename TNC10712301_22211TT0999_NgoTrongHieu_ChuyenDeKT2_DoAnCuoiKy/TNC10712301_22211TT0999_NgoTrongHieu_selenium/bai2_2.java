package demo2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class bai2_2 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        // Mở URL
        driver.get("https://demo.guru99.com/test/web-table-element.php");

        // Duyệt qua các hàng của bảng
        for (int i = 1; i <= 26; i++) {
            String actualValue = driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[" + i + "]/td[1]")).getText();
            
            // Kiểm tra nếu giá trị chứa chữ "Ch"
            if (actualValue.contains("Ch")) {
                // Duyệt qua các cột của hàng được tìm thấy
                for (int j = 1; j <= 5; j++) {
                    String rowValues = driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[" + i + "]/td[" + j + "]")).getText();
                    System.out.print(rowValues + "---");
                }
                System.out.println();
            }
        }
        // Đóng trình duyệt
         driver.close();
    }
}
