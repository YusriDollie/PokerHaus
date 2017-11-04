package Pokerhaus;

public final class Utility {

    public static boolean isNumeric(String s) {
        return java.util.regex.Pattern.matches("\\d+", s);
    }

}
