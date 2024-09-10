package frontendframework.resource.staticResource;

import org.openqa.selenium.WebDriver;

import java.util.Properties;

public class Static
{
public static WebDriver driver;
public static Properties prop;
public static int TEST_CASE_ID;

public static void TestCaseID(int id){
        TEST_CASE_ID = id;
    }


}
