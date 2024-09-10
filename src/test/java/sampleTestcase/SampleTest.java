package sampleTestcase;

import frontendframework.base.Base;
import frontendframework.resource.staticResource.Static;
import frontendframework.utilities.screenshot.Screenshot;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class SampleTest extends Base
{
    @BeforeMethod(alwaysRun = true)

    public void startingMethod() throws IOException, InterruptedException
    {
        launchBrowser();
    }
  @Test
    public void method1()
  {
   Static.TestCaseID(1);
   Screenshot.TakeScreenShot("screenshot.png");

  }
}
