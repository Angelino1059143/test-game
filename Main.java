import java.util.*;
import java.io.*;


class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    Card randoCard = new Card();
    ChoiceCard myCard = new ChoiceCard();
    Player p1 = new Player(inputName());
    
    

  }

  public static char inputChar() {
    Scanner scn = new Scanner(System.in);
    System.out.println();
    System.out.print("Welcome to card game. Would you like to play?");
    char answer = scn.next().charAt(0);
    return answer;
  }

  public static boolean doesUserWantToPlay(Scanner scan) {
    System.out.println("Do you want to keep playing? ");
    String select = scan.next();
    boolean input = select.contains("y");
    
    return input;
  }
 
  public static String inputName() {

    Scanner scn = new Scanner(System.in);
    System.out.print("Enter your name: ");
    String tmpName = scn.next();
    return tmpName;
  }
}