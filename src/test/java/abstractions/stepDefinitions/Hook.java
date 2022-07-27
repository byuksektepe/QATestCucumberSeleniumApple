package abstractions.stepDefinitions;
import abstractions.utils.DriverManager;
import io.cucumber.java.*;


public class Hook extends DriverManager {

    @Before
    public void StartTest(){
        setDriver();
    }

    @After
    public void EndTest(){
        destroyDriver();
    }
}
