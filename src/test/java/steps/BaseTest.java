package steps;

import com.talentlms.UI.helpers.Helper;
import com.talentlms.UI.pages.AdminHomePage;
import com.talentlms.UI.pages.LoginPage;

public abstract class BaseTest {
    LoginPage loginPage = new LoginPage();
    Helper helper = new Helper();
    AdminHomePage adminHomePage = new AdminHomePage();

}
