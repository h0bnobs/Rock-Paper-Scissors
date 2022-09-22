
import java.util.Scanner;

public class RPS {
    public static void main(String[] args) {

            System.out.println("hey, enter 'r' 'p' or 's' to play rock paper scissors\nor type 'quit' to leave: ");

            while(true) {

            Scanner scanner = new Scanner(System.in);
            String myMove = scanner.nextLine();

            if (myMove.equals("quit")) {
                break;
            }
            else if (!myMove.equals("r") && !myMove.equals("p") && !myMove.equals("s")) {
                System.out.println("Enter a valid move! ");
            }

            int randomNumber = (int) (Math.random() * 3);
            String opponentMove = "";

            if (randomNumber == 0) {
                opponentMove = "r";
            }
            if (randomNumber == 1) {
                opponentMove = "p";
            }
            if (randomNumber == 2) {
                opponentMove = "s";
            }

            if (myMove.equals(opponentMove)) {
                System.out.println("It's a tie");
                break;
            }
            else if (myMove.equals("r") && opponentMove.equals("s") ||
                    myMove.equals("s") && opponentMove.equals("p") ||
                    myMove.equals("p") && opponentMove.equals("r")) {
                System.out.println("you win! the answer was: " + myMove);
                break;
            }
            else if (!myMove.equals("r") && opponentMove.equals("s") ||
                    !myMove.equals("s") && opponentMove.equals("p") ||
                    !myMove.equals("p") && opponentMove.equals("r")) {
                System.out.println("you lose! the answer was: " + opponentMove);
                break;
            }
        }
    }
}
