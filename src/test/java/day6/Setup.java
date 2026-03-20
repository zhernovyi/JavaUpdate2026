package day6;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Setup {
    public static Playwright getPw() {
        return pw;
    }

    public static void setPw(Playwright pw) {
        Setup.pw = pw;
    }

    public Browser getBrowser() {
        return browser;
    }

    public void setBrowser(Browser browser) {
        this.browser = browser;
    }

    public Page getPage() {
        return page;
    }

    public void setPage(Page page) {
        this.page = page;
        this.page.setViewportSize(1920, 1080);

    }

    private static Playwright pw;
    private Browser browser;
    private Page page;


    Setup() {
        setPw(Playwright.create());
    }
}
