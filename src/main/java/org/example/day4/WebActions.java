package org.example.day4;

import com.microsoft.playwright.Page;
import jdk.jfr.Timestamp;

import java.nio.file.Path;
import java.sql.Time;
import java.time.LocalTime;

public class WebActions extends Setup {
    static Page openLink(String link){
        startUp();
        page.navigate(link);
        return page;
    }

    static Page clickAction(String locator){
        page.click(locator);
        return page;
    }

    public static void fillText(String locator, String name) {
        page.locator(locator).fill(name);
    }

    public static void screenshot() {
        String str = String.format("result%s.png", Time.valueOf(LocalTime.now()));
        page.screenshot(new Page.ScreenshotOptions().setPath(Path.of(str)));
    }
}
