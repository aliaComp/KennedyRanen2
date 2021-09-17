import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of card");
        int card = in.nextInt();

          if (card >= 0 && card <= 8) { // from 0 to 8 - clubs
            switch (card) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                    System.out.println( card + 6 + " Clubs");
                    break;
                case 5:
                    System.out.println("Jack of Clubs");
                    break;
                case 6:
                    System.out.println("Queen of Clubs");
                    break;
                case 7:
                    System.out.println("King of Clubs");
                case 8:
                    System.out.println("Ace of Clubs");
                    break;

            }
        } else if (card >= 9 && card <= 17) { //from 9 to 17 diamonds
            switch (card){
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                    System.out.println( card -3 + " Diamonds");
                    break;
                case 14:
                    System.out.println("Jack of Diamonds");
                    break;
                case 15:
                    System.out.println("Queen of Diamonds");
                    break;
                case 16:
                    System.out.println("King of Diamonds");
                    break;
                case 17:
                    System.out.println("Ace of Diamonds");
                    break;

            }
        } else if (card >= 18 && card <= 26){ //from 18 to 26 Hearts
            switch (card){
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                    System.out.println( card -8 + " Hearts");
                    break;
                case 23:
                    System.out.println("Jack of Hearts");
                    break;
                case 24:
                    System.out.println("Queen of Hearts");
                    break;
                case 25:
                    System.out.println("King of Hearts");
                    break;
                case 26:
                    System.out.println("Ace of Hearts");
                    break;
            }

            } else if (card >= 27 && card <= 35){ // from 27 to 35 spades
            switch(card){
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                    System.out.println( card - 21 + " Spades");
                    break;
                case 32:
                    System.out.println("Jack of Spades");
                    break;
                case 33:
                    System.out.println("Queen of Spades");
                    break;
                case 34:
                    System.out.println("King of Spades");
                    break;
                case 35:
                    System.out.println("Ace of Spades");

            }
        } else {
              System.out.println("No such card");
          }
        }
    }

