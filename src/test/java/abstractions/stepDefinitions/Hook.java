package abstractions.stepDefinitions;
import abstractions.utils.DriverManager;
import io.cucumber.java.*;

import static abstractions.utils.IUtils.assertionMethods;


public class Hook extends DriverManager{

    @Before
    public void StartTest(){
        setDriver();
    }

    @After
    public void EndTest(){
        assertionMethods.isWait(2000);
        destroyDriver();
    }
}
