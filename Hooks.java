package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void beforeScenario() {
        System.out.println("==== Script Start Execution ====");
    }

    @After
    public void afterScenario() {
        System.out.println("==== Script End Execution ====");
    }
}
