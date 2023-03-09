public class SnakeAndLadder {
    static int diceRoll = 0;
    static int option = 0;

    public static void main(String[] args) {

        System.out.println("Welcome to snake and ladder game.");
        int player1Position = 0; // For player 1 initial position has declared.
        while (player1Position != 100) {
            diceRoll = ((int) (Math.random() * 10) % 6) + 1; // Used random function to generate random numbers.
            System.out.println("After rolling the dice the value is: " + diceRoll);
            option = ((int) (Math.random() * 10) % 3);
            System.out.println("Option appeared for the player: " + option);
            switch (option) {
                case 0:
                    System.out.println("No play! The position of the player will be same as before. " + player1Position);
                    break;
                case 1:
                    player1Position = player1Position + diceRoll;
                    System.out.println("Player moved ahead by ladder of " + diceRoll);
                    break;
                case 2:
                    player1Position = player1Position - diceRoll;
                    System.out.println("player position moved back by " + diceRoll);
                    break;
            }
            System.out.println(player1Position);
            if (player1Position < 0) { //condition given if the position comes less than zero then it will start from zero again.
                player1Position = 0;
            }
        }
    }
}





