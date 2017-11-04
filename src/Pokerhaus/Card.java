package Pokerhaus;

import java.util.Comparator;
import java.util.regex.Pattern;
public class Card implements Comparator <Card>  {

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

    public  String getSuite (){

        return  suite;
    }

    public int getValue (){

        return value;
    }

    public String toString(){

        return "Face Value: "+value+ " Suite: "+ suite;

    }


    @Override
    public int compare(Card o1, Card o2) {
        if(o1.value>o2.value){
            return 1;
        }

        else if (o1.value<o2.value){
            return  -1;
        }

        else return 0;
    }
}
