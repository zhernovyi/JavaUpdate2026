package org.example.day4;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import jdk.jfr.Timestamp;

import java.sql.Time;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) throws InterruptedException {

//        {//@test1
//            Page page = WebActions.openLink("https://playwright.dev/java");
//            System.out.println(page.locator("h1").textContent());
//            WebActions.close();
//        }
//        {//@test2
//            Page page = WebActions.openLink("https://playwright.dev/java");
//            Locator lc = page.locator("#__docusaurus_skipToContent_fallback > main > section.features_keug > div > div > div:nth-child(1) > div > p:nth-child(3) > a:nth-child(6)");
//            System.out.println(lc.textContent());
//            WebActions.close();
//        }
//        {//@test3
//            Page page = WebActions.openLink("https://playwright.dev/java");
//            Locator lc = page.getByText("Get started");
//            System.out.println(lc.textContent());
//            lc.click();
//            WebActions.close();
//        }
//        {//@test4
//            Page page = WebActions.openLink("https://demoqa.com");
//            Thread.sleep(1000);
//            WebActions.clickAction(".card-up");
//            Thread.sleep(1000);
//            WebActions.clickAction("a[href='/text-box']");
//            Thread.sleep(1000);
//            WebActions.clickAction("#userName");
//            Thread.sleep(1000);
//            WebActions.fillText("#userName","Test_day_4");
//            Thread.sleep(1000);
//            WebActions.clickAction("#submit");
//            Thread.sleep(1000);
//            WebActions.screenshot();
//            Thread.sleep(1000);
//            WebActions.close();
//        }
        {//@test5
            Page page = WebActions.openLink("https://demoqa.com");
            WebActions.clickAction(".card-up");
            WebActions.clickAction("a[href='/text-box']");
            WebActions.fillText("#userName","Test_day_4");
            WebActions.fillText("#userEmail","test@user.com");
            WebActions.fillText("#currentAddress","Rondo Daszyńśkiego, Warszawa, Poland");
            WebActions.clickAction("#submit");
            WebActions.screenshot();
            WebActions.close();
        }
    }
}
