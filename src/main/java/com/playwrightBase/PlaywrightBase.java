package com.playwrightBase;

import java.io.IOException;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.ElementHandle;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.Response;

public class PlaywrightBase {

    public static Browser browser;

    public static Browser browserLaunch(String type) {
        try {
            Playwright playwright = Playwright.create();
            BrowserType.LaunchOptions options = new BrowserType.LaunchOptions().setHeadless(false);
            if (type.equalsIgnoreCase("chrome")) {
                browser = playwright.chromium().launch(options);
            } else if (type.equalsIgnoreCase("firefox")) {
                browser = playwright.firefox().launch(options);
            } else if (type.equalsIgnoreCase("edge")) {
                browser = playwright.webkit().launch(options);
            } else {
                throw new RuntimeException("Browser type is not valid");
            }
            return browser;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
    }

    public static Browser browserClose() {
        try {
            browser.close();
            return browser;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
    }

    public static Browser browserQuit() {
        try {
            browser.close();
            return browser;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
    }

    public static Response launchUrl(String url) {
        try {
            return browser.newPage().navigate(url);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
    }

    public static void clickOnElement(ElementHandle element) {
        try {
            element.click();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
    }

    @SuppressWarnings("deprecation")
	public static void inputValueElement(ElementHandle element, String inputValue) {
        try {
            element.type(inputValue);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
    }

    public static void navigateToURL(String navigateUrl) {
        try {
            browser.newPage().navigate(navigateUrl);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
    }

//    public static void navigateBack() {
//        try {
//            browser.waitForPage(() -> browser.goBack());
//        } catch (Exception e) {
//            e.printStackTrace();
//            throw new RuntimeException();
//        }
//    }

//    public static void navigateForward() {
//        try {
//            browser.waitForPage(() -> browser.goForward());
//        } catch (Exception e) {
//            e.printStackTrace();
//            throw new RuntimeException();
//        }
//    }

//    public static void navigateRefresh() {
//        try {
//            browser.waitForPage(() -> browser.reload());
//        } catch (Exception e) {
//            e.printStackTrace();
//            throw new RuntimeException();
//        }
//    }

    public static String getAttributeValue(ElementHandle element, String attribute) {
        try {
            return element.getAttribute(attribute);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
    }

//    public static String getCurrentURL() {
//        try {
//            return browser.pages().get(0).url();
//        } catch (Exception e) {
//            e.printStackTrace();
//            throw new RuntimeException();
//        }
//    }

//    public static String getTitle() {
//        try {
//            return browser.pages().get(0).title();
//        } catch (Exception e) {
//            e.printStackTrace();
//            throw new RuntimeException();
//        }
//    }

    public static String getText(ElementHandle element) {
        try {
            return element.innerText();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
    }

//    public static String getPageSource() {
//        try {
//            return browser.pages().get(0).content();
//        } catch (Exception e) {
//            e.printStackTrace();
//            throw new RuntimeException();
//        }
//    }

//    public static String getWindowHandle() {
//        try {
//            return browser.pages().get(0).mainFrame().name();
//        } catch (Exception e) {
//            e.printStackTrace();
//            throw new RuntimeException();
//        }
//    }

//    public static void acceptAlert() {
//        try {
//            browser.waitForPage(() -> browser.pages().get(0).dialog().accept());
//        } catch (Exception e) {
//            e.printStackTrace();
//            throw new RuntimeException();
//        }
//    }

//    public static void dismissAlert() {
//        try {
//            browser.waitForPage(() -> browser.pages().get(0).dialog().dismiss());
//        } catch (Exception e) {
//            e.printStackTrace();
//            throw new RuntimeException();
//        }
//    }

//    public static void sendValueAlertBox(String input) {
//        try {
//            browser.waitForPage(() -> browser.pages().get(0).dialog().accept(input));
//        } catch (Exception e) {
//            e.printStackTrace();
//            throw new RuntimeException();
//        }
//    }

//    public static String getValueInAlertText() {
//        try {
//            return browser.pages().get(0).dialog().message();
//        } catch (Exception e) {
//            e.printStackTrace();
//            throw new RuntimeException();
//        }
//    }

    // Actions

    public static void actionsUsingClick(ElementHandle element) {
        try {
            element.click();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
    }

//    public static void actionsUsingContextClick(ElementHandle element) {
//        try {
//            element.click({ button: 'right' });
//        } catch (Exception e) {
//            e.printStackTrace();
//            throw new RuntimeException();
//        }
//    }

    // Similarly, you can convert other actions methods

    public static void main(String[] args) throws IOException {
        // Example usage:
        Playwright playwright = Playwright.create();
        browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        Page page = browser.newPage();
        page.navigate("https://example.com");
        ElementHandle element = page.querySelector("input[name='q']");
        inputValueElement(element, "Playwright");
        browser.close();
    }
}
