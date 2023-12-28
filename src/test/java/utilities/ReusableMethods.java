package utilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.function.Function;

public class ReusableMethods {
    /*HOW DO YOU GET SCREENSHOT?
     * I use getScreenShotAs method to take a screenshot in selenium in my framework
     * I actually store the screenshot with unique name in my framework*/
    public static String getScreenshot(String name) throws IOException {
//        THIS METHOD TAKES SCREENSHOT AND STORE IN /test-output FOLDER
//        NAME OF THE SCREEN IS BASED ON THE CURRENT TIME
//        SO THAN WE CAN HAVE UNIQUE NAME
        // naming the screenshot with the current date to avoid duplication
        String date = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        // TakesScreenshot is an interface of selenium that takes the screenshot. SAME IS IN THE HOOKS
        TakesScreenshot ts = (TakesScreenshot) Driver.getDriver();
        File source = ts.getScreenshotAs(OutputType.FILE);
        // full path to the screenshot location
        String target = System.getProperty("user.dir") + "/test-output/Screenshots/" + name + date + ".png";
        File finalDestination = new File(target);
        // save the screenshot to the path given
        FileUtils.copyFile(source, finalDestination);
        return target;
    }
    //========Switching Window=====//
    public static void switchToWindow(String targetTitle) {
        String origin = Driver.getDriver().getWindowHandle();
        for (String handle : Driver.getDriver().getWindowHandles()) {
            Driver.getDriver().switchTo().window(handle);
            if (Driver.getDriver().getTitle().equals(targetTitle)) {
                return;
            }
        }
        Driver.getDriver().switchTo().window(origin);
    }
    //========Hover Over=====//
    public static void hover(WebElement element) {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(element).perform();
    }
    //==========Return a list of string given a list of Web Element====////
    public static List<String> getElementsText(List<WebElement> list) {
        List<String> elemTexts = new ArrayList<>();
        for (WebElement el : list) {
            if (!el.getText().isEmpty()) {
                elemTexts.add(el.getText());
            }
        }
        return elemTexts;
    }
    //========Returns the Text of the element given an element locator==//
    public static List<String> getElementsText(By locator) {
        List<WebElement> elems = Driver.getDriver().findElements(locator);
        List<String> elemTexts = new ArrayList<>();
        for (WebElement el : elems) {
            if (!el.getText().isEmpty()) {
                elemTexts.add(el.getText());
            }
        }
        return elemTexts;
    }
    //   HARD WAIT WITH THREAD.SLEEP
//   waitFor(5);  => waits for 5 second
    public static void waitFor(int sec) {
        try {
            Thread.sleep(sec * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    //===============Explicit Wait==============//
    public static WebElement waitForVisibility(WebElement element, int timeout) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(timeout));
        return wait.until(ExpectedConditions.visibilityOf(element));
    }
    public static WebElement waitForVisibility(By locator, int timeout) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(timeout));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
    public static WebElement waitForClickablility(WebElement element, int timeout) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(timeout));
        return wait.until(ExpectedConditions.elementToBeClickable(element));
    }
    public static WebElement waitForClickablility(By locator, int timeout) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(timeout));
        return wait.until(ExpectedConditions.elementToBeClickable(locator));
    }
    public static void clickWithTimeOut(WebElement element, int timeout) {
        for (int i = 0; i < timeout; i++) {
            try {
                element.click();
                return;
            } catch (WebDriverException e) {
                waitFor(1);
            }
        }
    }
    public static void waitForPageToLoad(long timeout) {
        ExpectedCondition<Boolean> expectation = new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver driver) {
                return ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete");
            }
        };
        try {
            System.out.println("Waiting for page to load...");
            WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(timeout));
            wait.until(expectation);
        } catch (Throwable error) {
            System.out.println(
                    "Timeout waiting for Page Load Request to complete after " + timeout + " seconds");
        }
    }
    //======Fluent Wait====//
    public static WebElement fluentWait(final WebElement webElement, int timeout) {
        //FluentWait<WebDriver> wait = new FluentWait<WebDriver>(Driver.getDriver()).withTimeout(timeinsec, TimeUnit.SECONDS).pollingEvery(timeinsec, TimeUnit.SECONDS);
        FluentWait<WebDriver> wait = new FluentWait<WebDriver>(Driver.getDriver())
                .withTimeout(Duration.ofSeconds(3))//Wait 3 second each time
                .pollingEvery(Duration.ofSeconds(1));//Check for the element every 1 second
        WebElement element = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return webElement;
            }
        });
        return element;
    }
    /**
     * Performs double click action on an element
     * @param element
     */
    public static void doubleClick(WebElement element) {
        new Actions(Driver.getDriver()).doubleClick(element).build().perform();
    }
    /**
     * @param element
     * @param check
     */
    public static void selectCheckBox(WebElement element, boolean check) {
        if (check) {
            if (!element.isSelected()) {
                element.click();
            }
        } else {
            if (element.isSelected()) {
                element.click();
            }
        }
    }
    /**
     * Selects a random value from a dropdown list and returns the selected Web Element
     * @param select
     * @return
     */
    public static WebElement selectRandomTextFromDropdown(Select select) {
        Random random = new Random();
        List<WebElement> weblist = select.getOptions();
        int optionIndex = 1 + random.nextInt(weblist.size() - 1);
        select.selectByIndex(optionIndex);
        return select.getFirstSelectedOption();
    }
    public static void JSEScrollBy() {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0,2500)");
        waitFor(2);
    }

        //HARD WAIT METHOD
        public static void bekle(int saniye) {
            try {
                Thread.sleep(saniye * 1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        //Alert ACCEPT
        public static void alertAccept() {
            Driver.getDriver().switchTo().alert().accept();
        }

        //Alert DISMISS
        public static void alertDismiss() {
            Driver.getDriver().switchTo().alert().dismiss();
        }

        //Alert getText()
        public static void alertText() {
            Driver.getDriver().switchTo().alert().getText();
        }

        //Alert promptBox
        public static void alertprompt(String text) {
            Driver.getDriver().switchTo().alert().sendKeys(text);
        }

        //DropDown VisibleText
    /*
        Select select2 = new Select(gun);
        select2.selectByVisibleText("7");

        //ddmVisibleText(gun,"7"); --> Yukarıdaki kullanım yerine sadece method ile handle edebilirim
     */
        public static void ddmVisibleText(WebElement ddm, String secenek) {
            Select select = new Select(ddm);
            select.selectByVisibleText(secenek);
        }

        //DropDown Index
        public static void ddmIndex(WebElement ddm, int index) {
            Select select = new Select(ddm);
            select.selectByIndex(index);
        }

        //DropDown Value
        public static void ddmValue(WebElement ddm, String secenek) {
            Select select = new Select(ddm);
            select.selectByValue(secenek);
        }

        //SwitchToWindow1
        public static void switchToWindow(int sayi) {
            List<String> tumWindowHandles = new ArrayList<String>(Driver.getDriver().getWindowHandles());
            Driver.getDriver().switchTo().window(tumWindowHandles.get(sayi));
        }

        //SwitchToWindow2
        public static void window(int sayi) {
            Driver.getDriver().switchTo().window(Driver.getDriver().getWindowHandles().toArray()[sayi].toString());
        }
        //EXPLICIT WAIT METHODS

        //Visible Wait
        public static void visibleWait(WebElement element, int sayi) {
            WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(sayi));
            wait.until(ExpectedConditions.visibilityOf(element));

        }

        //VisibleElementLocator Wait
        public static WebElement visibleWait(By locator, int sayi) {
            WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(sayi));
            return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

        }

        //Alert Wait
        public static void alertWait(int sayi) {
            WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(sayi));
            wait.until(ExpectedConditions.alertIsPresent());

        }
        //Tüm Sayfa ScreenShot
        public static String tumSayfaResmi(String name) {
            String tarih = new SimpleDateFormat("_hh_mm_ss_ddMMyyyy").format(new Date());
            TakesScreenshot ts = (TakesScreenshot) Driver.getDriver();
            String dosyaYolu = System.getProperty("user.dir") + "/target/Screenshots/" + name + tarih + ".png";
            try {
                FileUtils.copyFile(ts.getScreenshotAs(OutputType.FILE), new File(dosyaYolu));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            return dosyaYolu;
        }

        //WebElement ScreenShot
        public static void webElementResmi(WebElement element) {
            String tarih = new SimpleDateFormat("_hh_mm_ss_ddMMyyyy").format(new Date());
            String dosyaYolu = "TestOutput/screenshot/webElementScreenshot" + tarih + ".png";

            try {
                FileUtils.copyFile(element.getScreenshotAs(OutputType.FILE), new File(dosyaYolu));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }


        //WebTable
        public static void printData(int satir, int sutun) {
            WebElement satirSutun = Driver.getDriver().findElement(By.xpath("(//tbody)[1]//tr[" + satir + "]//td[" + sutun + "]"));
            System.out.println(satirSutun.getText());
        }

        //Click Method
        public static void click(WebElement element) {
            try {
                element.click();
            } catch (Exception e) {
                JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
                js.executeScript("arguments[0].click();", element);
            }
        }

        //JS Scroll
        public static void scroll(String s, WebElement element) {
            JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
            js.executeScript("arguments[0].scrollIntoView(true);", element);
        }

        //JS Sayfa Sonu Scroll
        public static void scrollEnd() {
            JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
            js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
        }

        //JS Sayfa Başı Scroll
        public static void scrollHome() {
            JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
            js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
        }

        //JS SendKeys
        public static void sendKeysJS(WebElement element, String text) {
            JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
            js.executeScript("arguments[0].value='" + text + "'", element);

        }

        //JS SendAttributeValue
        public static void sendAttributeJS(WebElement element, String text) {
            JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
            js.executeScript("arguments[0].setAttribute('value','" + text + "')", element);
        }

        //JS GetAttributeValue
        public static void getValueByJS(String id, String attributeName) {
            JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
            String attribute_Value = (String) js.executeScript("return document.getElementById('" + id + "')." + attributeName);
            System.out.println("Attribute Value: = " + attribute_Value);
        }
        //File Upload Robot Class
        public static void uploadFile(String dosyaYolu) {
            try {
                StringSelection stringSelection = new StringSelection(dosyaYolu);
                Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
                Robot robot = new Robot();
                robot.keyPress(KeyEvent.VK_CONTROL);
                robot.keyPress(KeyEvent.VK_V);
                robot.keyRelease(KeyEvent.VK_CONTROL);
                robot.keyRelease(KeyEvent.VK_V);
                robot.delay(3000);
                robot.keyPress(KeyEvent.VK_ENTER);
                robot.keyRelease(KeyEvent.VK_ENTER);
                robot.delay(3000);
            } catch (Exception ignored) {


            }

        }
        public static void clickElementByJS(WebElement element) {
            ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);", ReusableMethods.waitForVisibility(element,5));
            ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].click();", element);
        }

}
