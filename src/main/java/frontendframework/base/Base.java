package frontendframework.base;

import frontendframework.resource.staticResource.Static;
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
    public void loadProperties() throws IOException {
        FileInputStream file=new FileInputStream("C:\\hybrid\\DeviFramework\\Devi\\src\\main\\java\\frontendframework\\config\\Config.properties");
      Static.prop=new Properties();
        Static.prop.load(file);
    }
    public void openBrowser(String browser)
    {
        if(browser.equals("Chrome")||browser.equals("chrome"))
            Static.driver=new ChromeDriver();
       if(browser.equals("Firefox")||browser.equals("firefox"))
        Static.driver=new FirefoxDriver();
       if(browser.equals("Edge")||browser.equals("edge"))
        Static.driver=new EdgeDriver();

    }
     public void launchBrowser() throws IOException, InterruptedException {
        loadProperties();
        String br=Static.prop.getProperty("Browser");
         System.out.println(br);
        openBrowser(br);
        Static.driver.manage().window().maximize();
         String url=Static.prop.getProperty("Url");
         Static.driver.get(url);
        System.out.println(url);
     }

    public static void main(String[] args) throws IOException, InterruptedException {
        Base b=new Base();
        b.launchBrowser();
    }
}
