package baiTap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class selinumversion2 {
	public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://chercher.tech/practice/dropdowns");

        List<String> expect_result = Arrays.asList(new String[]{"Bing", "Google", "Iphone 14", "Yahoo"});

        WebElement actualDropdown = driver.findElement(By.id("order-same"));
        Select actual = new Select(actualDropdown);
        actualDropdown.click();
        Thread.sleep(2000);
        actualDropdown.click();
        
        List<WebElement> actualListElements = actual.getOptions();
        
        List<String> actual_result = new ArrayList<String>();
        
        for (WebElement option : actualListElements) {
            actual_result.add(option.getText());
        }

        if (expect_result.equals(actual_result)) {
            System.out.println("Kết quả thực tế đúng với Kết quả mong đợi");
        } else {
            System.out.println("Kết quả thực tế khác kết quả mong đợi");
            System.out.println("Kết quả mong đợi: " + expect_result.toString());
            System.out.println("Kết quả thực tế: " + actual_result.toString());
        }

        String default_value_expect = "Samsung";
        if (actual.getFirstSelectedOption().getText().equals(default_value_expect)) {
            System.out.println("Giá trị mặc định của DropDown List đúng - PASS");
        } else {
            System.out.println("Giá trị mặc định của DropDown List không đúng - FAIL");
            System.out.println("Kết quả mong đợi là: " + default_value_expect);
            System.out.println("Kết quả thực tế là: " + actual.getFirstSelectedOption().getText());
        }
        driver.close();
    }
}
