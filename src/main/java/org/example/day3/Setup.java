package org.example.day3;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Playwright;

public class Setup {
    Playwright pw = Playwright.create();
    Browser initBrowser = pw.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
    void setup()  {
        initBrowser.newPage().navigate("https://playstation.com");
        try{
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        pw.close();

    }
}
