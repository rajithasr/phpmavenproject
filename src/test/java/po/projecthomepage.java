package po;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class projecthomepage {
  WebDriver driver;
	public projecthomepage(WebDriver d)
	{
	  this.driver= d;
    }
	
@FindBy(how=How.XPATH,using="//a[@href='https://phptravels.org/']")	
WebElement login;
public void logintest()
{
	login.click();
}
}
