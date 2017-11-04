package Pokerhaus;

import java.util.regex.Pattern;
public class Card {

    private int value;
    private String suite;


    public Card(String v, String s) {

        if(Utility.isNumeric(v)){
            value= Integer.parseInt(v);
            if (value >14  || value<2){

                throw new IllegalArgumentException("Invalid Card Value:" + v);

            }
        }

        else {
            if (v.equals("J")) {
                value = 11;
            } else if (v.equals("Q")) {
                value = 12;
            } else if (v.equals("K")) {
                value = 13;
            } else if (v.equals("A")) {
                value = 14;
            }

            else{
                throw new IllegalArgumentException("Invalid Card Value:" + v);
            }
        }

        if (Pattern.matches("[DHCS]",s.toUpperCase())) {

            suite = s.toUpperCase();

        }
         else{

            throw new IllegalArgumentException("Invalid Suit:" + s);
        }

    }

    public String toString(){

        return "Face Value: "+value+ " Suite: "+ suite;

    }





}
