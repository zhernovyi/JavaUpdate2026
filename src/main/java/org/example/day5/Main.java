package org.example.day5;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;


public class Main {
    public static void main(String[] args) throws InterruptedException {
        {//test1
            WebActions session = new WebActions(new Setup());
            session.openPage("https://dou.ua");
            assertThat(Setup.page).hasTitle("Спільнота програмістів | DOU");
            assertThat(Setup.page.locator("[href='https://dou.ua/forums/']")).isVisible();
            assertThat(Setup.page.locator("[href='https://dou.ua/forums/']")).containsText("Форум");
            Setup.page.locator("[href='https://dou.ua/forums/']").click();
            assertThat(Setup.page).hasURL("https://dou.ua/forums/");
            Setup.close();
        }

        {//test2
            WebActions session = new WebActions(new Setup());
            session.openPage("https://example.com");
            assertThat(Setup.page).hasTitle("Example Domain");
            assertThat(Setup.page.locator("h1")).isVisible();
            assertThat(Setup.page.locator("h1")).hasText("Example Domain");
            assertThat(Setup.page.getByText("Learn more")).isVisible();

            Setup.close();
        }
    }
}
