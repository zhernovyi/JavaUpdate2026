package day6;

import org.junit.jupiter.api.Test;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;


public class DemoQaTests extends BaseTest {
//    @Test
    public void fillTheForm(){
        WebActions.openPage(getPage(), "https://demoqa.com/");
        WebActions.clickOnElement(getPage(), "a[href='/elements']");
        WebActions.clickOnElement(getPage(), "a[href='/text-box']");
        WebActions.fillTextField(getPage(),"#userName", faker.funnyName().name());
        WebActions.fillTextField(getPage(),"#userEmail", faker.internet().emailAddress());
        WebActions.fillTextField(getPage(),"#currentAddress", faker.hobbit().quote().toLowerCase());
        WebActions.fillTextField(getPage(),"#permanentAddress", (faker.address().country()+", "+faker.address().city()));
    }

//    @Test
    public void checkSubmitButton(){
        WebActions.openPage(getPage(), "https://demoqa.com/");
        WebActions.clickOnElement(getPage(), "a[href='/elements']");
        WebActions.clickOnElement(getPage(), "a[href='/text-box']");
        assertThat(getPage().locator("#submit")).isVisible();
    }

    @Test
    public void compareSubmitedData(){
        WebActions.openPage(getPage(), "https://demoqa.com/");
        WebActions.clickOnElement(getPage(), "a[href='/elements']");
        WebActions.clickOnElement(getPage(), "a[href='/text-box']");
        String name = faker.funnyName().name();
        String email = faker.internet().emailAddress();
        String curAddress = faker.hobbit().quote().toLowerCase();
        String perAddress = faker.address().country()+", "+faker.address().city();

        WebActions.fillTextField(getPage(),"#userName", name);
        WebActions.fillTextField(getPage(),"#userEmail", email);
        WebActions.fillTextField(getPage(),"#currentAddress", curAddress);
        WebActions.fillTextField(getPage(),"#permanentAddress", perAddress);

        WebActions.clickOnElement(getPage(), "#submit");

        assertThat(getPage().locator("#name")).containsText(name);
        assertThat(getPage().locator("#email")).containsText(email);
        assertThat(getPage().locator("#currentAddress.mb-1")).containsText(curAddress);
        assertThat(getPage().locator("#permanentAddress.mb-1")).containsText(perAddress);
    }
}
