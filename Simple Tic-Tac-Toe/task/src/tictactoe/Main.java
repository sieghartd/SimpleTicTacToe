package tictactoe;
import java.util.Scanner;

public class Main {

    public static String[][] ticTacToe = new String[3][3];

    public static void displayGame() {
        System.out.println("---------");
        System.out.println("| " + ticTacToe[0][0] + " " + ticTacToe[0][1] + " " + ticTacToe[0][2] + " |");
        System.out.println("| " + ticTacToe[1][0] + " " + ticTacToe[1][1] + " " + ticTacToe[1][2] + " |");
        System.out.println("| " + ticTacToe[2][0] + " " + ticTacToe[2][1] + " " + ticTacToe[2][2] + " |");
        System.out.println("---------");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        String userInput = input.nextLine();
//        char[] letters = userInput.toCharArray();
        int xCount = 0;
        int oCount = 0;
        int turnCount = 0;

        int XXX = 264;
        int OOO = 237;


//        String[][] ticTacToe = new String[3][3];

//        for (int i = 0; i < letters.length; i++) {
//            if (letters[i] == 'X') {
//                xCount++;
//            } else if (letters[i] == 'O') {
//                oCount++;
//            }
//        }
        boolean xWins = false;
        boolean oWins = false;
        boolean rightCor = false;
        boolean turnSwap = false;


//        if (userInput.matches(".........")) {
//            ticTacToe[0][0] = String.valueOf(userInput.charAt(0));
//            ticTacToe[0][1] = String.valueOf(userInput.charAt(1));
//            ticTacToe[0][2] = String.valueOf(userInput.charAt(2));
//            ticTacToe[1][0] = String.valueOf(userInput.charAt(3));
//            ticTacToe[1][1] = String.valueOf(userInput.charAt(4));
//            ticTacToe[1][2] = String.valueOf(userInput.charAt(5));
//            ticTacToe[2][0] = String.valueOf(userInput.charAt(6));
//            ticTacToe[2][1] = String.valueOf(userInput.charAt(7));
//            ticTacToe[2][2] = String.valueOf(userInput.charAt(8));



        ticTacToe[0][0] = " ";
        ticTacToe[0][1] = " ";
        ticTacToe[0][2] = " ";
        ticTacToe[1][0] = " ";
        ticTacToe[1][1] = " ";
        ticTacToe[1][2] = " ";
        ticTacToe[2][0] = " ";
        ticTacToe[2][1] = " ";
        ticTacToe[2][2] = " ";

        int p2 = ' ';
//        int p1 = Integer.parseInt(ticTacToe[0][0]);

        System.out.println("---------");
            System.out.println("| " + ticTacToe[0][0] + " " + ticTacToe[0][1] + " " + ticTacToe[0][2] + " |");
            System.out.println("| " + ticTacToe[1][0] + " " + ticTacToe[1][1] + " " + ticTacToe[1][2] + " |");
            System.out.println("| " + ticTacToe[2][0] + " " + ticTacToe[2][1] + " " + ticTacToe[2][2] + " |");
            System.out.println("---------");





            System.out.println("Input coordinates");
            while (rightCor == false && turnCount != 10) {
                if ((ticTacToe[0][0] + ticTacToe[0][1] + ticTacToe[0][2]).equals("XXX") ||
                        ((ticTacToe[1][0] + ticTacToe[1][1] + ticTacToe[1][2]).equals("XXX")) ||
                        ((ticTacToe[2][0] + ticTacToe[2][1] + ticTacToe[2][2]).equals("XXX")) ||
                        ((ticTacToe[0][0] + ticTacToe[1][0] + ticTacToe[2][0]).equals("XXX")) ||
                        ((ticTacToe[0][1] + ticTacToe[1][1] + ticTacToe[2][1]).equals("XXX")) ||
                        ((ticTacToe[0][2] + ticTacToe[1][2] + ticTacToe[2][2]).equals("XXX")) ||
                        ((ticTacToe[0][0] + ticTacToe[1][1] + ticTacToe[2][2]).equals("XXX")) ||
                        ((ticTacToe[0][2] + ticTacToe[1][1] + ticTacToe[2][0]).equals("XXX"))) {
                    xWins = true;
                } else if ((ticTacToe[0][0] + ticTacToe[0][1] + ticTacToe[0][2]).equals("OOO") ||
                        ((ticTacToe[1][0] + ticTacToe[1][1] + ticTacToe[1][2]).equals("OOO")) ||
                        ((ticTacToe[2][0] + ticTacToe[2][1] + ticTacToe[2][2]).equals("OOO")) ||
                        ((ticTacToe[0][0] + ticTacToe[1][0] + ticTacToe[2][0]).equals("OOO")) ||
                        ((ticTacToe[0][1] + ticTacToe[1][1] + ticTacToe[2][1]).equals("OOO")) ||
                        ((ticTacToe[0][2] + ticTacToe[1][2] + ticTacToe[2][2]).equals("OOO")) ||
                        ((ticTacToe[0][0] + ticTacToe[1][1] + ticTacToe[2][2]).equals("OOO")) ||
                        ((ticTacToe[0][2] + ticTacToe[1][1] + ticTacToe[2][0]).equals("OOO"))) {
                    oWins = true;
                } else if (turnCount == 9){
                    System.out.println("Draw");
                }

                String input2 = input.nextLine();

                if (xWins && !oWins) {
                    System.out.println("X wins");
                    System.exit(0);
                } else if (oWins && !xWins) {
                    System.out.println("O wins");
                    System.exit(0);
                } else if (Math.abs(xCount - oCount) > 1 || xWins && oWins) {
                    System.out.println("Impossible");
                } else if (xCount + oCount == 9) {
                    System.out.println("Draw");
                }
//                else if (xCount + oCount != 9) {
//                    System.out.println("Game not finished");
//                }

                if (input2.matches("\\d*\\s*\\d*")) {
                    String[] convert = input2.split("\\s");
                    int number1 = Integer.parseInt(convert[0]) - 1;
                    int number2 = Integer.parseInt(convert[1]) - 1;

                    if (number1 >= 3 || number1 < 0 || number2 >= 3 || number2 < 0) {
                        System.out.println("Coordinates should be from 1 to 3!");
                    } else if (ticTacToe[number1][number2].equals(" ") && turnSwap == false) {
                        ticTacToe[number1][number2] = "X";
                        displayGame();
                        turnCount++;
//                        rightCor = true;
                        turnSwap = true;
                    } else if (ticTacToe[number1][number2].equals(" ") && turnSwap == true) {
                        ticTacToe[number1][number2] = "O";
                        displayGame();
//                        rightCor = true;
                        turnCount++;
                        turnSwap = false;
                    } else {
                        System.out.println("This cell is occupied! Choose another!");
                    }
            } else {
                    System.out.println("You should enter numbers!");
                }


            }

        }
    }