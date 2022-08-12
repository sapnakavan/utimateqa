package edgetesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Edge_Driver {
    public static void main(String[] args) {
      Edge_Driver e = new Edge_Driver();
      e.m1();
    }
    public void m1(){
        String baseURL = "https://courses.ultimateqa.com/users/sign_in";//storing base url
        System.setProperty("webdriver.edge.driver","webdrivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();//creating object for edge driver
        driver.get(baseURL);
        driver.manage().window().maximize();
        String title =driver.getTitle();
        System.out.println(title);
        driver.close();
    }
}
