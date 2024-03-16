import java.util.Scanner;

public class PlayingBoard {

    private final int rows = 3;
    private final int columns = 3;

    private final Space[] board = new Space[9];

    public void startTheGame(){

        System.out.println("""
                ==========================
                Welcome to 3x3 Tic Tac Toe!
                ==========================""");
    }

    public void move(){
        Scanner sc = new Scanner(System.in);
        System.out.println("""
                """);
    }

    public String checkWinner(){
        return null;
    }








}
