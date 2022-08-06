package abstractions.utils;

public class Transformer {

    public String replaceAllNonCharValue(String s) {
        return s.replaceAll("[^a-zA-Z]", "");
    }
}
