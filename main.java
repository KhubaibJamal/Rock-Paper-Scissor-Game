package Rock_Paper_Scissor_Game;
import java.util.*;

class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner input = new Scanner(System.in);
        Game RPS = new Game();
        String againPlay;
        boolean isStop = false;

        while(!isStop){
            // CALLING RockPaperScissor METHOD
            RPS.RockPaperScissor(); 
            System.out.println("\nWould You Like To Continue? (Yes or No)");
            againPlay = input.nextLine();
            if (againPlay.equals("no") || againPlay.equals("NO")){
                System.out.println("I HOPE YOU ENJOYED. PLEASE COME NEXT TIME");
                isStop = true;
                break;
            }
        }
        input.close();

    }
    
}
