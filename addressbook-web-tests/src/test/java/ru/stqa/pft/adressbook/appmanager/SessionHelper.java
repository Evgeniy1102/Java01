package ru.stqa.pft.adressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Евгений Сироткин on 21.02.2017.
 */
public class SessionHelper extends HelperBase{

    public SessionHelper(WebDriver wd) {
        super(wd);
    }

    public void login(String UserName, String PassWord) {
        type(By.name("user"), UserName);
        type(By.name("pass"), PassWord);

        click(By.xpath("//form[@id='LoginForm']/input[3]"));
    }
}
