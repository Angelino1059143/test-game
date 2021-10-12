import java.util.*;

public class ChoiceCard {
    private String suit;
    private int value;
    
    ChoiceCard() {

        this.suit = setSuit();

    }
    private String setSuit() {
        Scanner scn = new Scanner(System.in);
        System.out.print("From the deck, which suit do you want to pick? ");
        int choice = scn.nextInt();
        String suit = "";
        
        while(choice > 4 || choice < 1) {
            System.out.println();
            System.out.print("Invalid number, pick again: ");
            choice = scn.nextInt();
        } 
        switch(choice) {
            case 1: suit = "\u2665"; // heart
            break;
            case 2: suit = "\u2666"; // diamond
            break;
            case 3: suit = "\u2660"; // spade
            break;
            case 4: suit = "\u2663";
            break;
        }
        return suit;

    }

    private String getSuit() {
        return this.suit;
    }


    
}
