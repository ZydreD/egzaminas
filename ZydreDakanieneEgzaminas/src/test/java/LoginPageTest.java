import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.assertj.core.api.Assertions.assertThat;

public class LoginPageTest extends BaseTest {
    LoginPage loginPage;
    DashboardPage dashboardPage;

    @Test
    void userLoggingIn() {
        loginPage = new LoginPage(driver);
        dashboardPage = new DashboardPage(driver);



        loginPage.setInputUserName(loginPage.getUserName());
        loginPage.setInputPassword(loginPage.getPassword());
        loginPage.clickLogin();

        String expectedLoggedInTitle = "Dashboard";
        String actualLoggedInlTitle = dashboardPage.getLoggedInTitle();

        assertThat(actualLoggedInlTitle).isEqualTo(expectedLoggedInTitle);
    }
}
