package day6;

import org.junit.jupiter.api.Test;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;


public class FirstTests extends BaseTest{

//    @Test
    public void verifyRightTitle(){
        WebActions.openPage(getPage(), "https://dou.ua");
        assertThat(getPage()).hasTitle("Спільнота програмістів | DOU");
    }

//    @Test
    public void checkRightUrl(){
        WebActions.openPage(getPage(), "https://dou.ua");
        assertThat(getPage().locator("a[href='https://jobs.dou.ua/salaries/']")).isVisible();
    }
}
