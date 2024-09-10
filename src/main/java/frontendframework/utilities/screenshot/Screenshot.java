package frontendframework.utilities.screenshot;

import frontendframework.resource.staticResource.Static;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

public class Screenshot
{
    public static void  TakeScreenShot(String  screenshotName) {
        try {
            TakesScreenshot screenshot = (TakesScreenshot) Static.driver;

            File screenshotSource = screenshot.getScreenshotAs(OutputType.FILE);

            File screenshotDestination = new File("C:/screenshot/"+Static.TEST_CASE_ID+"/"+screenshotName+".png");

            FileUtils.copyFile(screenshotSource,screenshotDestination);



        }
        catch(IOException e ) {
            System.out.println("please check the destination");

        }}}