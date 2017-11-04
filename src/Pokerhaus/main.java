package Pokerhaus;

import java.util.Arrays;
import java.util.Scanner;

public class main {



    public static void main(String[] args) {

    //Simple input handling
        System.out.println("Enter Poker Hand:");
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String [] rawCards = line.split(" ");
        Card [] hand = new Card[5];
        if (rawCards.length != 5){

            throw  new IllegalArgumentException("Invalid number of cards provided");

        }

        else{
            for(int x = 0 ; x<5 ;x++){
                //Constructing hand of cards
                int subIndex = rawCards[x].length();
                Card temp = new Card(rawCards[x].substring(0,subIndex-1),rawCards[x].substring(subIndex-1));
                hand[x]=temp;

            }
        }

    //Sort hand to rank and allow for quick comparisons
    Arrays.sort(hand,Card.cardComparator);

        for (Card c : hand){
            System.out.println(c.toString());
        }

        System.out.println("Fullhouse?\n" +  Utility.fullhouse(hand));






    }



}
