import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] gameBoard = createGameBoard();
        boolean playerOneTurn = true;
        boolean playerWin = false;

        while(playerWin == false) {
            if (playerOneTurn) {
                int player = 1;
                printBoard(gameBoard);
                playerTurn(gameBoard, true, scanner, player);
                playerWin = checkWin(gameBoard, 'X');
                playerOneTurn = false;
                if (playerWin) {
                    printBoard(gameBoard);
                    System.out.println("Congratulations player " + player + " you win!");
                    break;
                }
                continue;
            }

            int player = 2;
            printBoard(gameBoard);
            playerTurn(gameBoard, false, scanner, player);
            playerWin = checkWin(gameBoard, 'O');
            playerOneTurn = true;
            if (playerWin) {
                printBoard(gameBoard);
                System.out.println("Congratulations player " + player + " you win!");
                break;
            }
        }

    }

    public static char[] createGameBoard() {
        char[] gameBoardArray = new char[9];
        gameBoardArray[0] = '1';
        gameBoardArray[1] = '2';
        gameBoardArray[2] = '3';
        gameBoardArray[3] = '4';
        gameBoardArray[4] = '5';
        gameBoardArray[5] = '6';
        gameBoardArray[6] = '7';
        gameBoardArray[7] = '8';
        gameBoardArray[8] = '9';

        return gameBoardArray;
    }

    public static void playerTurn(char[] gameBoard, boolean playerOneTurn, Scanner scanner, int player) {
        System.out.println("Input your choice player " + player + ".");
        int playerInput = scanner.nextInt();
        if (playerOneTurn == true) {
            gameBoard[playerInput - 1] = 'X';
        } else {
            gameBoard[playerInput - 1] = 'O';
        }

    }

    public static boolean checkWin(char[] gameBoard, char checkXOrO) {
        char letter = checkXOrO;
        for (int i = 0; i < 9; i += 3) {
            if (gameBoard[i] == letter && gameBoard[i + 1] == letter && gameBoard[i + 2] == letter) {
                return true;
            }
        }
        for (int i = 0; i < 3; i++) {
            if (gameBoard[i] == letter && gameBoard[i + 3] == letter && gameBoard[i + 6] == letter) {
                return true;
            }
        }
        if (gameBoard[0] == letter && gameBoard[4] == letter && gameBoard[8] == letter) {
            return true;
        }

        if (gameBoard[2] == letter && gameBoard[4] == letter && gameBoard[6] == letter) {
            return true;
        }
        return false;
    }

    public static void printBoard(char[] gameBoard) {
        for (int i = 0; i < 9; i += 3) {
            System.out.print(gameBoard[i]+ " ");
            System.out.print(gameBoard[i + 1]+ " ");
            System.out.print(gameBoard[i + 2]);
            System.out.println();
        }
    }

}