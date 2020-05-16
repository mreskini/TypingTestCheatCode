package com.company;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.seleniumhq.jetty9.server.AcceptRateLimit;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<String> obj = new ArrayList<String>();
        System.setProperty("webdriver.chrome.driver", "C:\\IMP\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://10fastfingers.com/typing-test/english");
        String  html = driver.findElement(By.id("row1")).getAttribute("innerHTML").toString();
        Document document = Jsoup.parse(html);
        for (int i = 0; i < 340; i++) {
            driver.findElement(By.id("inputfield")).sendKeys(document.select("span").get(i).html());
            driver.findElement(By.id("inputfield")).sendKeys(" ");
        }
    }
}
