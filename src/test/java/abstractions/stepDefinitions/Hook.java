package abstractions.stepDefinitions;
import abstractions.utils.DriverManager;
import abstractions.utils.IUtils;
import io.cucumber.java.*;

public class Hook extends DriverManager implements IUtils {

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
