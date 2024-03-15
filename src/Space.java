public class Space {
    private boolean takenByPlayer;
    private boolean takenByComp;
    private int col;
    private int row;
    private int[][] coordinates = new int[3][3];

    public Space(boolean takenByPlayer, boolean takenByComp, int col, int row, int[][] coordinates) {
        this.takenByPlayer = takenByPlayer;
        this.takenByComp = takenByComp;
        this.col = col;
        this.row = row;
        this.coordinates = coordinates;
    }
}
