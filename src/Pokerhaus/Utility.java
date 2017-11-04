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

        public static boolean suitMatch(Card[] hand){

            boolean suitMatch = true;
            for(int i =1 ; i<5;i++){

                if (!hand[i].getSuite().equals(hand[i-1].getSuite())){

                    suitMatch = false;
                    return suitMatch;
                }

            }

            return suitMatch;


        }

    public static boolean isSequential(Card[] hand){

        boolean seq = true;
        for(int i =1 ; i<5;i++){

            if ((hand[i].getValue())!=(hand[i-1].getValue() +1)){

                seq = false;
                return seq;
            }

        }

        return seq;


    }

    public static boolean fullhouse (Card [] hand){

            // looking for 3 matching and 2 matching
            // since hand is sorted, first and last will be different
            // first card
            int value = hand[0].getValue();
            int total = 1;
            // last card
            int value2 = hand[4].getValue();
            int total2 = 1;
            // count cards similar to first and last cards

            for (int i = 1; i < 4; i++) {
                if (hand[i].getValue() == value) total++;
                if (hand[i].getValue() == value2) total2++;
            }

            // is it a full house?
            if (total == 3 && total2 == 2) return true;
            if (total == 2 && total2 == 3) return true;
            // no full house
            return false;
        }

    }


