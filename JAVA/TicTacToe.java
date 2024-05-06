import java.util.*;

public class TicTacToe {
    static char[] board = {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '};
    static char currentPlayer;
    static char computerPlayer;
    static char humanPlayer;

    static void initBoard() {
        for (int i = 0; i < 9; i++) {
            board[i] = ' ';
        }
    }

    static void printBoard() {
        System.out.println(board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("---------");
        System.out.println(board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("---------");
        System.out.println(board[6] + " | " + board[7] + " | " + board[8]);
    }

    static void choosePlayer() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Choose your symbol (X or O): ");
            char choice = scanner.next().toUpperCase().charAt(0);
            if (choice == 'X' || choice == 'O') {
                humanPlayer = choice;
                computerPlayer = (choice == 'X') ? 'O' : 'X';
                break;
            } else {
                System.out.println("Invalid choice. Please choose X or O.");
            }
        }
    }

    static void switchPlayer() {
        currentPlayer = (currentPlayer == humanPlayer) ? computerPlayer : humanPlayer;
    }

    static boolean makeMove(int position) {
        if (position < 0 || position >= 9 || board[position] != ' ') {
            return false;
        }
        board[position] = currentPlayer;
        return true;
    }

    static boolean checkWinner() {
        int[][] winConditions = {
                {0, 1, 2}, {3, 4, 5}, {6, 7, 8}, // Rows
                {0, 3, 6}, {1, 4, 7}, {2, 5, 8}, // Columns
                {0, 4, 8}, {2, 4, 6} // Diagonals
        };

        for (int[] condition : winConditions) {
            if (board[condition[0]] != ' ' &&
                    board[condition[0]] == board[condition[1]] &&
                    board[condition[0]] == board[condition[2]]) {
                return true;
            }
        }
        return false;
    }

    static boolean isDraw() {
        for (char c : board) {
            if (c == ' ') {
                return false;
            }
        }
        return true;
    }

    static void playGame() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            initBoard();
            choosePlayer();
            currentPlayer = (humanPlayer == 'X') ? 'X' : 'O';

            while (true) {
                printBoard();

                if (currentPlayer == humanPlayer) {
                    while (true) {
                        System.out.print("Enter your move (1-9): ");
                        int move = scanner.nextInt() - 1;
                        if (makeMove(move)) {
                            break;
                        } else {
                            System.out.println("Invalid move. Please try again.");
                        }
                    }
                } else {
                    Random random = new Random();
                    int move;
                    do {
                        move = random.nextInt(9);
                    } while (!makeMove(move));
                    System.out.println("Computer chose position " + (move + 1));
                }

                if (checkWinner()) {
                    printBoard();
                    System.out.println((currentPlayer == humanPlayer ? "You" : "Computer") + " win!");
                    break;
                }

                if (isDraw()) {
                    printBoard();
                    System.out.println("It's a draw!");
                    break;
                }

                switchPlayer();
            }

            System.out.print("Do you want to play again? (yes/no): ");
            String playAgain = scanner.next();
            if (!playAgain.equalsIgnoreCase("yes")) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        playGame();
    }
}
