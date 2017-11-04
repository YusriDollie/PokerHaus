import Pokerhaus.Utility;
import org.junit.Test;
import static org.junit.Assert.*;
import Pokerhaus.Card;

import java.util.Arrays;

public class UnitTest {



        @Test
        public void testPairEdges () {

            String EdgeTest = "3d 5s 5s 2c 3h";
            String [] rawCards = EdgeTest.split(" ");
            Card [] edgeHand = new Card[5];
            for(int x = 0 ; x<5 ;x++){
                //Constructing hand of cards
                int subIndex = rawCards[x].length();
                Card temp = new Card(rawCards[x].substring(0,subIndex-1),rawCards[x].substring(subIndex-1));
                edgeHand[x]=temp;

            }

            Arrays.sort(edgeHand,Card.cardComparator);
            assertEquals("Two Pair", Utility.evaluateHand(edgeHand));
            assertFalse(Utility.suitMatch(edgeHand));
            assertFalse(Utility.isSequential(edgeHand));

            String EdgeTest2 = "4d 5s 5S 2c 4h";
            String [] rawCards2 = EdgeTest2.split(" ");
            Card [] edgeHand2 = new Card[5];
            for(int x = 0 ; x<5 ;x++){
                //Constructing hand of cards
                int subIndex = rawCards2[x].length();
                Card temp = new Card(rawCards2[x].substring(0,subIndex-1),rawCards2[x].substring(subIndex-1));
                edgeHand2[x]=temp;

            }
            Arrays.sort(edgeHand2,Card.cardComparator);
            assertEquals("Two Pair", Utility.evaluateHand(edgeHand2));
            assertFalse(Utility.suitMatch(edgeHand2));
            assertFalse(Utility.isSequential(edgeHand2));


            String EdgeTest3 = "3d 5s 5S 2c 4h";
            String [] rawCards3 = EdgeTest3.split(" ");
            Card [] edgeHand3 = new Card[5];
            for(int x = 0 ; x<5 ;x++){
                //Constructing hand of cards
                int subIndex = rawCards2[x].length();
                Card temp = new Card(rawCards3[x].substring(0,subIndex-1),rawCards3[x].substring(subIndex-1));
                edgeHand3[x]=temp;

            }
            Arrays.sort(edgeHand3,Card.cardComparator);
            assertEquals("One Pair", Utility.evaluateHand(edgeHand3));
            assertFalse(Utility.suitMatch(edgeHand3));
            assertFalse(Utility.isSequential(edgeHand3));

        }




    @Test
    public void sequentialTesting () {

        String seqTest = "3d 6s 4S 5c 2h";
        String [] rawCards = seqTest.split(" ");
        Card [] seqHand = new Card[5];
        for(int x = 0 ; x<5 ;x++){
            //Constructing hand of cards
            int subIndex = rawCards[x].length();
            Card temp = new Card(rawCards[x].substring(0,subIndex-1),rawCards[x].substring(subIndex-1));
            seqHand[x]=temp;

        }

        Arrays.sort(seqHand,Card.cardComparator);
        assertEquals("Straight", Utility.evaluateHand(seqHand));
        assertFalse(Utility.suitMatch(seqHand));
        assertTrue(Utility.isSequential(seqHand));

        String secTest2 = "Kd Js 10h Qc 9H";
        String [] rawCards2 = secTest2.split(" ");
        Card [] seqHand2 = new Card[5];
        for(int x = 0 ; x<5 ;x++){
            //Constructing hand of cards
            int subIndex = rawCards2[x].length();
            Card temp = new Card(rawCards2[x].substring(0,subIndex-1),rawCards2[x].substring(subIndex-1));
            seqHand2[x]=temp;

        }
        Arrays.sort(seqHand2,Card.cardComparator);
        assertEquals("Straight", Utility.evaluateHand(seqHand2));
        assertFalse(Utility.suitMatch(seqHand2));
        assertTrue(Utility.isSequential(seqHand2));

        String secTest3 = "Kd Js 8h Qc 9H";
        String [] rawCards3 = secTest3.split(" ");
        Card [] seqHand3 = new Card[5];
        for(int x = 0 ; x<5 ;x++){
            //Constructing hand of cards
            int subIndex = rawCards3[x].length();
            Card temp = new Card(rawCards3[x].substring(0,subIndex-1),rawCards3[x].substring(subIndex-1));
            seqHand3[x]=temp;

        }
        Arrays.sort(seqHand3,Card.cardComparator);
        assertEquals("High Card", Utility.evaluateHand(seqHand3));
        assertFalse(Utility.suitMatch(seqHand3));
        assertFalse(Utility.isSequential(seqHand3));


    }



    @Test
    public void fullHouseTesting () {

        String fhTest = "3d 3s KS Kc 3h";
        String [] rawCards = fhTest.split(" ");
        Card [] fhHand = new Card[5];
        for(int x = 0 ; x<5 ;x++){
            //Constructing hand of cards
            int subIndex = rawCards[x].length();
            Card temp = new Card(rawCards[x].substring(0,subIndex-1),rawCards[x].substring(subIndex-1));
            fhHand[x]=temp;

        }

        Arrays.sort(fhHand,Card.cardComparator);
        assertEquals("Full-House", Utility.evaluateHand(fhHand));
        assertFalse(Utility.suitMatch(fhHand));
        assertFalse(Utility.isSequential(fhHand));


        String fhTest2 = "Kd 3s KS Kc 3h";
        String [] rawCards2 = fhTest2.split(" ");
        Card [] fhHand2 = new Card[5];
        for(int x = 0 ; x<5 ;x++){
            //Constructing hand of cards
            int subIndex = rawCards2[x].length();
            Card temp = new Card(rawCards2[x].substring(0,subIndex-1),rawCards2[x].substring(subIndex-1));
            fhHand2[x]=temp;

        }

        Arrays.sort(fhHand2,Card.cardComparator);
        assertEquals("Full-House", Utility.evaluateHand(fhHand2));
        assertFalse(Utility.suitMatch(fhHand2));
        assertFalse(Utility.isSequential(fhHand2));

        String fhTest3 = "Kd Ks KS Kc Kh";
        String [] rawCards3 = fhTest3.split(" ");
        Card [] fhHand3 = new Card[5];
        for(int x = 0 ; x<5 ;x++){
            //Constructing hand of cards
            int subIndex = rawCards3[x].length();
            Card temp = new Card(rawCards3[x].substring(0,subIndex-1),rawCards3[x].substring(subIndex-1));
            fhHand3[x]=temp;

        }

        Arrays.sort(fhHand3,Card.cardComparator);
        assertEquals("Five of a Kind", Utility.evaluateHand(fhHand3));
        assertFalse(Utility.suitMatch(fhHand3));
        assertFalse(Utility.isSequential(fhHand3));


    }



    @Test
    public void flushTesting () {

        String fTest = "2s 3s KS Qs 4s";
        String [] rawCards = fTest.split(" ");
        Card [] fHand = new Card[5];
        for(int x = 0 ; x<5 ;x++){
            //Constructing hand of cards
            int subIndex = rawCards[x].length();
            Card temp = new Card(rawCards[x].substring(0,subIndex-1),rawCards[x].substring(subIndex-1));
            fHand[x]=temp;

        }

        Arrays.sort(fHand,Card.cardComparator);
        assertEquals("Flush", Utility.evaluateHand(fHand));
        assertTrue(Utility.suitMatch(fHand));
        assertFalse(Utility.isSequential(fHand));


        String fTest2 = "Js 3s KS Qs 4s";
        String [] rawCards2 = fTest2.split(" ");
        Card [] fHand2 = new Card[5];
        for(int x = 0 ; x<5 ;x++){
            //Constructing hand of cards
            int subIndex = rawCards2[x].length();
            Card temp = new Card(rawCards2[x].substring(0,subIndex-1),rawCards2[x].substring(subIndex-1));
            fHand2[x]=temp;

        }

        Arrays.sort(fHand2,Card.cardComparator);
        assertEquals("Flush", Utility.evaluateHand(fHand2));
        assertTrue(Utility.suitMatch(fHand2));
        assertFalse(Utility.isSequential(fHand2));

        String fTest3 = "2s 3D KS Qs 4d";
        String [] rawCards3 = fTest3.split(" ");
        Card [] fHand3 = new Card[5];
        for(int x = 0 ; x<5 ;x++){
            //Constructing hand of cards
            int subIndex = rawCards3[x].length();
            Card temp = new Card(rawCards3[x].substring(0,subIndex-1),rawCards3[x].substring(subIndex-1));
            fHand3[x]=temp;

        }

        Arrays.sort(fHand3,Card.cardComparator);
        assertEquals("High Card", Utility.evaluateHand(fHand3));
        assertFalse(Utility.suitMatch(fHand3));
        assertFalse(Utility.isSequential(fHand3));


    }

    @Test
    public void tripTesting () {

        String tTest = "3c 3s KS Qs 3d";
        String [] rawCards = tTest.split(" ");
        Card [] tHand = new Card[5];
        for(int x = 0 ; x<5 ;x++){
            //Constructing hand of cards
            int subIndex = rawCards[x].length();
            Card temp = new Card(rawCards[x].substring(0,subIndex-1),rawCards[x].substring(subIndex-1));
            tHand[x]=temp;

        }

        Arrays.sort(tHand,Card.cardComparator);
        assertEquals("Three of a Kind", Utility.evaluateHand(tHand));
        assertFalse(Utility.suitMatch(tHand));
        assertFalse(Utility.isSequential(tHand));


        String tTest2 = "Qc 3s KS Qs Qd";
        String [] rawCards2 = tTest2.split(" ");
        Card [] tHand2 = new Card[5];
        for(int x = 0 ; x<5 ;x++){
            //Constructing hand of cards
            int subIndex = rawCards2[x].length();
            Card temp = new Card(rawCards2[x].substring(0,subIndex-1),rawCards2[x].substring(subIndex-1));
            tHand2[x]=temp;

        }

        Arrays.sort(tHand2,Card.cardComparator);
        assertEquals("Three of a Kind", Utility.evaluateHand(tHand2));
        assertFalse(Utility.suitMatch(tHand2));
        assertFalse(Utility.isSequential(tHand2));


        String tTest3 = "Qc Ks KS Qs Qd";
        String [] rawCards3 = tTest3.split(" ");
        Card [] tHand3 = new Card[5];
        for(int x = 0 ; x<5 ;x++){
            //Constructing hand of cards
            int subIndex = rawCards2[x].length();
            Card temp = new Card(rawCards3[x].substring(0,subIndex-1),rawCards3[x].substring(subIndex-1));
            tHand3[x]=temp;

        }

        Arrays.sort(tHand3,Card.cardComparator);
        assertFalse(Utility.evaluateHand(tHand3).equals("Three of a Kind"));
        assertFalse(Utility.suitMatch(tHand3));
        assertFalse(Utility.isSequential(tHand3));

    }


    @Test
    public void quadTesting () {

        String qTest = "3c 3s KS 3h 3d";
        String [] rawCards = qTest.split(" ");
        Card [] qHand = new Card[5];
        for(int x = 0 ; x<5 ;x++){
            //Constructing hand of cards
            int subIndex = rawCards[x].length();
            Card temp = new Card(rawCards[x].substring(0,subIndex-1),rawCards[x].substring(subIndex-1));
            qHand[x]=temp;

        }

        Arrays.sort(qHand,Card.cardComparator);
        assertEquals("Four of a Kind", Utility.evaluateHand(qHand));
        assertFalse(Utility.suitMatch(qHand));
        assertFalse(Utility.isSequential(qHand));


        String qTest2 = "Qc Qh KS Qs Qd";
        String [] rawCards2 = qTest2.split(" ");
        Card [] qHand2 = new Card[5];
        for(int x = 0 ; x<5 ;x++){
            //Constructing hand of cards
            int subIndex = rawCards2[x].length();
            Card temp = new Card(rawCards2[x].substring(0,subIndex-1),rawCards2[x].substring(subIndex-1));
            qHand2[x]=temp;

        }

        Arrays.sort(qHand2,Card.cardComparator);
        assertEquals("Four of a Kind", Utility.evaluateHand(qHand2));
        assertFalse(Utility.suitMatch(qHand2));
        assertFalse(Utility.isSequential(qHand2));


        String qTest3 = "Qc Ks KS Qs Qd";
        String [] rawCards3 = qTest3.split(" ");
        Card [] qHand3 = new Card[5];
        for(int x = 0 ; x<5 ;x++){
            //Constructing hand of cards
            int subIndex = rawCards2[x].length();
            Card temp = new Card(rawCards3[x].substring(0,subIndex-1),rawCards3[x].substring(subIndex-1));
            qHand3[x]=temp;

        }

        Arrays.sort(qHand3,Card.cardComparator);
        assertFalse(Utility.evaluateHand(qHand3).equals("Four of a Kind"));
        assertFalse(Utility.suitMatch(qHand3));
        assertFalse(Utility.isSequential(qHand3));

    }



}
