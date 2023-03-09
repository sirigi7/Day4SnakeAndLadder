public class SnakeAndLadder {


    static int diceRoll = 0;
    public static void main(String[] args) {

        System.out.println("Welcome to snake and ladder game.");
        diceRoll = ((int) (Math.random()*10)%6)+1; // Used random function to generate random numbers.
        System.out.println(diceRoll);
        int player1Position = 0; // For player 1 initial position has declared.
    }
    }

