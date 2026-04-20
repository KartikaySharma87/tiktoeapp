import java.util.Random;
public class Uc2 {



        public static void main(String[] args) {

            // Step 1: Create Random object for toss
            Random random = new Random();

            // Step 2: Generate random number (0 or 1)
            int toss = random.nextInt(2);

            // Step 3: Declare game state variables
            String player1 = "Player 1";
            String player2 = "Player 2";
            String currentPlayer;
            char player1Symbol, player2Symbol;

            // Step 4: Conditional logic based on toss
            if (toss == 0) {
                currentPlayer = player1;
                player1Symbol = 'X';
                player2Symbol = 'O';
            } else {
                currentPlayer = player2;
                player2Symbol = 'X';
                player1Symbol = 'O';
            }

            // Step 5: Display results
            System.out.println("Toss Result: " + (toss == 0 ? player1 : player2) + " starts first!");
            System.out.println(player1 + " Symbol: " + player1Symbol);
            System.out.println(player2 + " Symbol: " + player2Symbol);
            System.out.println("Current Player: " + currentPlayer);
        }
    }
