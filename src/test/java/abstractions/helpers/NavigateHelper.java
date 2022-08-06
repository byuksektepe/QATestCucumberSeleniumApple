package abstractions.helpers;

import static abstractions.utils.Constants.Global.MAIN_URL;


public class NavigateHelper implements HelperInterface{

    public void navigateToMainUrl(){

        dM.getDriver()
                .navigate()
                .to(MAIN_URL);

        dW.waitUntilJSReady();
    }

}
