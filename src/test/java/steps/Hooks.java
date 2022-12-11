package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.CommonMethods;

public class Hooks extends CommonMethods {
    //use i.o cucumber.jave to import this hook
    @Before
    public void preCondition(){
        openBrowserAndLaunchApplication();
    }

    @After
    public void postCondition(){
        closeBrowser();
    }
}
