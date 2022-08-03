package Rock_Paper_Scissor_Game;

import java.util.*;
import java.util.Random;

class Game {
    public String Rock = "ROCK";
    public String Paper = "PAPER";
    public String Scissor = "SCISSOR";
    public void RockPaperScissor() {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        //generate random value up to 0-3
        int randomLimit = 3; 
        //random number 1-3
        int randomNumber = rand.nextInt(randomLimit) +1; 
        System.out.println(">>>>> WELCOME TO PLAY ROCK PAPER SCISSORS GAME <<<<<");
            System.out.println("\nEnter Any One Of The Following Inputs");
            System.out.println("1 For Rock.\n2 For Paper.\n3 For Scissors");
            String selection = input.next();
            String upperCase = selection.toUpperCase();
            if (upperCase.equals("ROCK")){
                System.out.println("YOUR MOVE IS " + upperCase + ".");
                if (randomNumber == 1){
                    System.out.println("COMPUTER MOVE IS ALSO " + Rock + ".");
                    System.out.println("OHH! GAME IS TIE.");
                    //IF BOTH NUMBER IS EQUAL
                }
                else if (randomNumber == 2){
                    System.out.println("COMPUTER MOVE IS " + Paper + ".");
                    System.out.println("OHH! COMPUTER WINS. TRY NEXT TIME.");
                    System.out.println("ROCK COVER PAPER");
                    //IF USER = 1 AND RANDOM NUMBER IS 2. SO ROCK COVER PAPER
                }
                else if (randomNumber == 3){
                    System.out.println("COMPUTER MOVE IS " + Scissor + ".");
                    System.out.println("CONGRATULATIONS YOU WIN.");
                    System.out.println("ROCK BREAK SCISSOR");
                    //IF USER = 1 AND RANDOM NUMBER IS 3. SO ROCK BREAK / BEATS SCISSOR
                }
            }
            else if (upperCase.equals("PAPER")){
                System.out.println("YOUR MOVE IS " + upperCase + ".");
                if (randomNumber == 1){
                    System.out.println("COMPUTER MOVE IS " + Rock + ".");
                    System.out.println("CONGRATULATIONS YOU WIN.");
                    System.out.println("PAPER FOLD ROCK");
                    //IF USER = 2 AND RANDOM NUMBER IS 1. SO PAPER FOLD ROCK. PAPER BEAT ROCK
                }
                else if (randomNumber == 2){
                    System.out.println("COMPUTER MOVE IS ALSO " + Paper + ".");
                    System.out.println("OHH! GAME IS TIE.");
                    //IF USER = 2 AND RANDOM NUMBER IS 2. BOTH NUMBER IS EQUAL
                }
                else if (randomNumber == 3){
                    System.out.println("COMPUTER MOVE IS " + Scissor + ".");
                    System.out.println("OHH! COMPUTER WINS. TRY NEXT TIME.");
                    System.out.println("PAPER WILL BE CUTS INTO PIECES BY SCISSOR");
                    //IF USER = 2 AND RANDOM NUMBER IS 3. SO SCISSOR CUT PAPER OR SCISSOR BEATS PAPER
                }
            }
            else if (upperCase.equals("SCISSOR")){
                System.out.println("YOUR MOVE IS " + upperCase + ".");
                if (randomNumber == 1){
                    System.out.println("COMPUTER MOVE IS " + Rock + ".");
                    System.out.println("OHH! COMPUTER WINS. TRY NEXT TIME.");
                    System.out.println("ROCK BEAT SCISSOR");
                    //IF USER = 3 AND RANDOM NUMBER IS 1. SO ROCK BEAT OR BROKE SCISSOR
                }
                else if (randomNumber == 2){
                    System.out.println("COMPUTER MOVE IS " + Paper + ".");
                    System.out.println("CONGRATULATIONS YOU WIN.");
                    System.out.println("SCISSOR CUT PAPER INTO PIECES");
                    //IF USER = 3 AND RANDOM NUMBER IS 2. SO SCISSOR CUT PAPER
                }
                else if (randomNumber == 3){
                    System.out.println("COMPUTER MOVE IS ALSO " + Scissor + ".");
                    System.out.println("OHH! GAME IS TIE.");
                    //IF USER = 3 AND RANDOM NUMBER IS 3. BOTH NUMBER IS EQUAL
                }
            }
            else {
                System.out.println("WRONG ENTER. TRY AGAIN !!!");
            }
    }
}
