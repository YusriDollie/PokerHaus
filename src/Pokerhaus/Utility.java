package Pokerhaus;

public final class Utility {



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

            if ((hand[i].getValue())!=(hand[i-1].getValue() -1)){

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


    public static int matching (Card [] hand){

        int initial = hand[0].getValue();
        int total = 0;
        int max1 =0;
        int pairs = 0;

        for (int i = 0; i < 5; i++) {
            if (hand[i].getValue() == initial){
                total++;
            }
            else{
                initial=hand[i].getValue();
                if(max1<total) {
                    max1 = total;
                }

                total=1;
            }

            if(max1<total){
                max1=total;
            }

            if(max1 == total && max1 ==2){
                pairs++;
            }





        }
        System.out.println("PAIRS: "+pairs);
         return max1;
    }


//    public static String evaluateHand(Card [] hand){
//
//        //Test in Descending Order and eliminate as many as possible as quickly as possible
//        int largestMatch = matching(hand);
//
//        if(largestMatch==5){
//
//            return "Five of a Kind";
//
//        }
//
//        else{
//
//            if(isSequential(hand)){
//
//                if(suitMatch(hand)){
//                    //If both sequential and all suits match
//                    return "Straight Flush";
//                }
//
//
//                else{
//                    //if only sequential
//
//
//
//                }
//
//
//            }
//
//
//            else if(largestMatch==4){
//
//                return "Four of a Kind";
//            }
//
//
//            else if (fullhouse(hand)){
//
//                return "Full-House";
//
//            }
//
//            else if(largestMatch==3){
//
//                return "Three of a Kind";
//            }
//
//
//            else if(largestMatch==2){
//
//                return "Two of a Kind";
//            }
//
//
//
//
//
//
//
//        }
//
//
//
//    }


    }


