package Pokerhaus;

public final class Utility {


    public enum Hands {

        High_Card, One_Pair, Two_Pair,Three_of_a_Kind, Four_of_a_Kind, Straight, Flush, Full_House, Straight_Flush, Five_of_a_Kind ;

        int rank() {
            switch (this) {

                case High_Card:
                    return 1;
                case One_Pair:
                    return 2;
                case Two_Pair:
                    return 3;
                case Three_of_a_Kind:
                    return 4;
                case Straight:
                    return 5;
                case Flush:
                    return 6;
                case Full_House:
                    return 7;
                case Four_of_a_Kind:
                    return 8;
                case Straight_Flush:
                    return 9;
                case Five_of_a_Kind:
                    return 10;
                default:
                    return 0;
            }

        }
    }

        public static boolean isNumeric(String s) {
        return java.util.regex.Pattern.matches("\\d+", s);
    }






}
