import java.util.Scanner;

public class main {



    public static void main(String[] args) {

    //Simple input handling
        System.out.println("Enter Poker Hand:");
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String [] cards = line.split(" ");

        if (cards.length != 5){

            throw  new IllegalArgumentException("Invalid number of cards provided");

        }

        else{

            System.out.println(cards[0]);

        }






    }



}
