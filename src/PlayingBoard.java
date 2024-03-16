import java.util.Scanner;

public class PlayingBoard {

    private final int rows = 3;
    private final int columns = 3;

    private final Space[] board = new Space[9];
    private String[] spaceString = new String[9];
    public void createBoard(){
        String index;
        for(int i = 0; i<spaceString.length; i++){
            index = String.valueOf(i+1);
            spaceString[i] = index;
        }
        String board_g = "   |   |\n " +
                spaceString[0] + " | " + spaceString[1] + " | " + spaceString[2] +
                "\n___|___|___\n "+
                spaceString[3] + " | " + spaceString[4] + " | " + spaceString[5] +
                "\n___|___|___\n "+
                spaceString[6] + " | " + spaceString[7] + " | " + spaceString[8] +
                "\n   |   |   \n ";
        System.out.println(board_g);
    }

    public void startTheGame(){

        System.out.println("""
                ==========================
                Welcome to 3x3 Tic Tac Toe!
                ==========================""");
    }

    public void move(){
        Scanner sc = new Scanner(System.in);
        System.out.println("""
                CHOOSE_A_PLACE_ON_THE_BOARD""");
    }

    public String checkWinner(){
        return null;
    }








}
