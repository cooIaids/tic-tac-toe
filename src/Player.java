import java.util.Scanner;

public class Player {
    private String turn;
    private final String x = "X";
    private int col;
    private int row;
    private boolean taken;

    public void makeMove(){
        Scanner sc = new Scanner(System.in);
        System.out.print("MAKE_MOVE\n INPUT_COLUMN:");
        col = sc.nextInt();
        System.out.print("INPUT_ROW");
        row = sc.nextInt();
    }

    public String getTurn() {
        return turn;
    }

    public void setTurn(String turn) {
        this.turn = turn;
    }
}
