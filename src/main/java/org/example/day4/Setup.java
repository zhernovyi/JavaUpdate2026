package org.example.day4;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Setup {
    static Playwright pw;
    static Browser browser;
    static Page page;

    static Page startUp() {
        pw = Playwright.create();
        browser = pw.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        page = browser.newPage();
        page.setViewportSize(1920, 1080);
        return page;
    }

    static void close(){
        pw.close();
    }

}
