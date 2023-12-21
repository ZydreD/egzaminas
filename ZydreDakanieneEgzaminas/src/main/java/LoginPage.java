import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Arrays;
import java.util.stream.Collectors;

public class LoginPage extends BasePage{

    @FindBy(xpath = "//input[@name='username']")
    private WebElement inputUserName;
    @FindBy(xpath = "//input[@type='password']")
    private WebElement inputPassword;
    @FindBy(css = "button.orangehrm-login-button")
    private WebElement linkToLogin;
    @FindBy (xpath = "//*[@class='oxd-sheet oxd-sheet--rounded oxd-sheet--gutters oxd-sheet--gray-lighten-2 orangehrm-demo-credentials']/p[1]")
    private WebElement userName;
    @FindBy (xpath = "//*[@class='oxd-sheet oxd-sheet--rounded oxd-sheet--gutters oxd-sheet--gray-lighten-2 orangehrm-demo-credentials']/p[2]")
    private  WebElement userPassword;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void setInputUserName(String userName) {
        inputUserName.sendKeys(userName);
    }

    public void setInputPassword(String userPassword) {
        inputPassword.sendKeys(userPassword);
    }

    public void clickLogin() {
        linkToLogin.click();
    }

    public String getUserName() {
        return Arrays.stream(userName.getText().split(" : ")).toList().get(1);


    }

    public String getPassword() {
        return Arrays.stream(userPassword.getText().split(" : ")).toList().get(1);
    }
}
