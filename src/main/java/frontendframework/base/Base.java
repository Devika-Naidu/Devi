package frontendframework.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Base
{
    WebDriver driver;
    Properties prop;
    public void loadProperties() throws IOException {
        FileInputStream file=new FileInputStream("C:\\hybrid\\DeviFramework\\Frontend_Framework\\src\\main\\java\\frontendframework\\config\\Config.properties");
       prop=new Properties();
        prop.load(file);
    }
    public void openBrowser(String browser)
    {
        if(browser.equals("Chrome")||browser.equals("chrome"))
            driver=new ChromeDriver();
       if(browser.equals("Firefox")||browser.equals("firefox"))
        driver=new FirefoxDriver();
       if(browser.equals("Edge")||browser.equals("edge"))
           driver=new EdgeDriver();

    }
     public void launchBrowser() throws IOException, InterruptedException {
        loadProperties();
        String br=prop.getProperty("Browser");
         System.out.println(br);
        openBrowser(br);
        driver.manage().window().maximize();
       //driver.get("https://ui.cogmento.com/");

       String url=prop.getProperty("Url");
      // driver.get(prop.getProperty("url"));
       driver.get(url);
        Thread.sleep(2000);
       // System.out.println(url);
     }

    public static void main(String[] args) throws IOException, InterruptedException {
        Base b=new Base();
        b.launchBrowser();
    }
}
