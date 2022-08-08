package abstractions.utils;

public class Transformer {

    /**
     * Method to replaces all non char values to empty shells.
     * @param s : String
     * @return : String : Only Char String
     */
    public String replaceAllNonCharValue(String s) {
        return s.replaceAll("[^a-zA-Z]", "");
    }
}
