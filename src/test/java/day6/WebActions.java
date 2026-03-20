package day6;

import com.microsoft.playwright.Page;

public class WebActions extends Setup {

    public static void openPage(Page page, String url){
        page.navigate(url);
    }

    public static void clickOnElement(Page page, String locator){
        page.click(locator);
    }

    public static void fillTextField(Page page, String locator, String text){
        page.locator(locator).fill(text);
    }


}
