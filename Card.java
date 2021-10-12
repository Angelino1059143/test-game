import java.io.*;
import java.util.*;

public class Card {

  private int value;
  private String suit;
  Random r = new Random();


  public Card() {
    this.value = value(r);
    this.suit = suit(r);
  }

  private int value(Random r) {
    int value = r.nextInt(13) + 1;
    return value;
  }

  public int getValue() {
    return value;
  }

  private String suit(Random r) {
    String suits = "";
    int tmp = r.nextInt(4);
    switch(tmp) {
      case 0: suits = "\u2665"; // heart
      break;
      case 1: suits = "\u2666"; // diamond
      break;
      case 2: suits = "\u2660"; // spade
      break;
      case 3: suits = "\u2663"; // clubs
    }
    return suits;
  }

  public String getSuit() {
    return suit;
  }
  
}