package org.example.day3_1;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.Response;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Page session = Setup.startUp("https://playwright.dev/java");
        Page page = Setup.getPage();
        System.out.println(page.title());
        System.out.println(session.url());
        Thread.sleep(5000);
        Setup.close();
    }
}
