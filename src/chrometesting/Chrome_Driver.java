package chrometesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome_Driver {
    public static void main(String[] args) {
     Chrome_Driver c = new Chrome_Driver();
     c.m1();
    }
    public void m1(){
        String baseURL ="https://courses.ultimateqa.com/users/sign_in";//storing base url
        System.setProperty("webdriver.chrome.driver","webdrivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();//creating object for chrome driver
        driver.get(baseURL);
        driver.manage().window().maximize();
        String title =driver.getTitle();
        System.out.println(title);
        driver.close();

    }
}
