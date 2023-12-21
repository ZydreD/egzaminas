import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends BasePage{
    @FindBy(css = ".oxd-topbar-header-breadcrumb-module")
    private WebElement loggedInTitle;

    public DashboardPage(WebDriver driver) {
        super(driver);
    }

    public String getLoggedInTitle() {
        return loggedInTitle.getText();
    }
}
