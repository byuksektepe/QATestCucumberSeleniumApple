package abstractions.utils;

public class Transformer {

    /**
     * Method to replaces all non char values to empty shells.
     * @param s : String
     * @return : String : Only Char String
     */
    public String replaceAllNonCharValueToVoid(String s) {
        return s.replaceAll("[^a-zA-Z]", "");
    }

    public String replaceAllUnWantedValueToVoid(String s,  String[] uws){
        for (String unwanted : uws ) {

            s.replace(unwanted, "");
        }
        return s;
    }
}
