package org.example.day3_1;

import com.microsoft.playwright.*;

public class Setup {
    static Playwright pw = Playwright.create();
    static Browser initBrowser = pw.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
    static Page page = initBrowser.newPage();


    static Page startUp(String link){
        getPage().navigate(link);
        return page;
    }

    static Page getPage(){
        return page;
    }

    static void close(){
        initBrowser.close();
        pw.close();
    }
}