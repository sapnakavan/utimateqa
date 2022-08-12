package firefoxtesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Geco_Driver {
    public static void main(String[] args) {
       Geco_Driver g = new Geco_Driver();
       g.m1();
    }
    public void m1(){
        String baseURL = "https://courses.ultimateqa.com/users/sign_in";//storing base url
        System.setProperty("webdriver.gecko.driver","webdrivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();//create object for firefox driver
        driver.get(baseURL);
        driver.manage().window().maximize();
        String title = driver.getTitle();
        System.out.println(title);
        driver.close();
    }
}
