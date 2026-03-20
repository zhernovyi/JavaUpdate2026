package day6;

import com.github.javafaker.Faker;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Playwright;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class BaseTest extends Setup{
    protected static Faker faker = new Faker();

    @BeforeAll
    public static void startPlaywright(){
        setPw(Playwright.create());
    }


    @BeforeEach
    public void startBrowser(){
        setBrowser(getPw().chromium().launch(new BrowserType.LaunchOptions().setHeadless(false)));
        setPage(getBrowser().newPage());
    }


    @AfterEach
    public void closeBrowser(){
        getBrowser().close();
    }

    @AfterAll
    public static void closeAll(){
        getPw().close();
    }

}
