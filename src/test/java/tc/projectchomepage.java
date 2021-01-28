package tc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import po.projecthomepage;
public class projectchomepage {
@Test
public void phphometest()
{
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://phptravels.com");
	projecthomepage obj1=PageFactory.initElements(driver, projecthomepage.class);
	obj1.logintest();
}

}
