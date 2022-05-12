package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {
    public static final String XPATH_SELECT_DAY="//div[contains(@class, \"58mq\")]/div/span/span/select[1]";
    public static final String XPATH_SELECT_MONTH="//div[contains(@class, \"58mq\")]/div/span/span/select[2]";
    public static final String XPATH_SELECT_YEAR="//div[contains(@class, \"58mq\")]/div/span/span/select[3]";
    public static void main(String[] args) {

        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.FIREFOX);
        driver.get("https://www.facebook.com/");

        WebElement selectComboDay=driver.findElement(By.xpath(XPATH_SELECT_DAY));
        Select selectBoardDay=new Select(selectComboDay);
        selectBoardDay.selectByVisibleText("12");

        WebElement selectComboMonth=driver.findElement(By.xpath(XPATH_SELECT_MONTH));
        Select selectBoardMonth=new Select(selectComboMonth);
        selectBoardMonth.selectByVisibleText("MAJ");

        WebElement selectComboYear=driver.findElement(By.xpath(XPATH_SELECT_YEAR));
        Select selectBoardYear=new Select(selectComboYear);
        selectBoardYear.selectByVisibleText("1995");
    }
}
