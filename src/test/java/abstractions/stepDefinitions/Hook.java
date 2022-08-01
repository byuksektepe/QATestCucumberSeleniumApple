package abstractions.stepDefinitions;
import abstractions.utils.DriverManager;
import abstractions.utils.UtilsInterface;
import io.cucumber.java.*;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class Hook extends DriverManager implements UtilsInterface {

    @Before
    public void StartTest(){

        setDriver();
    }

    @After
    public void EndTest(){
        assertionMethods.isWait(1000);
        destroyDriver();
    }
}
