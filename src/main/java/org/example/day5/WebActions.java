package org.example.day5;

public class WebActions {
    Setup session = null;

    WebActions(Setup session) {
        this.session = session;
    }


    void openPage(String url) {
        this.session.page.navigate(url);
//        page.navigate(url);
    }

    void clickElement(String elementName) {
        this.session.page.click(elementName);
    }
}
