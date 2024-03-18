import java.util.Scanner;

public class PlayingBoard {
    Scanner sc = new Scanner(System.in);
    private final Space[] board = new Space[9];
    private final String[] spaceString = new String[9];
    String board_g;
    private int x;

    public void createBoard() {
        String index;
        for (int i = 0; i < spaceString.length; i++) {
            index = String.valueOf(i + 1);
            spaceString[i] = index;
            board[i] = new Space(false, false);
        }
        board_g = "   |   |\n " +
                spaceString[0] + " | " + spaceString[1] + " | " + spaceString[2] +
                "\n___|___|___\n " +
                spaceString[3] + " | " + spaceString[4] + " | " + spaceString[5] +
                "\n___|___|___\n " +
                spaceString[6] + " | " + spaceString[7] + " | " + spaceString[8] +
                "\n   |   |   \n ";
        System.out.println(board_g);
    }

    public void updateBoard() {
        board_g = "   |   |\n " +
                spaceString[0] + " | " + spaceString[1] + " | " + spaceString[2] +
                "\n___|___|___\n " +
                spaceString[3] + " | " + spaceString[4] + " | " + spaceString[5] +
                "\n___|___|___\n " +
                spaceString[6] + " | " + spaceString[7] + " | " + spaceString[8] +
                "\n   |   |   \n ";
    }

    public void startTheGame() {

        System.out.println("""
                ==========================
                Welcome to 3x3 Tic Tac Toe!
                ==========================""");
    }

    public void move(){
        System.out.println(board_g);
        System.out.print("CHOOSE_A_PLACE_ON_THE_BOARD 1-9: ");
        x = sc.nextInt();
        if (x >= 1 && x <= 9 && !board[x - 1].isTakenByComp() && !board[x - 1].isTakenByPlayer()) {
            spaceString[x - 1] = "x";
            board[x-1].setTakenByPlayer(true);
            System.out.println(board[x-1].isTakenByPlayer());
        } else {
            System.out.println("WRONG");
        }
        updateBoard();
        System.out.println(board_g);

    }

    public String checkWinner() {
        return null;
    }


}
