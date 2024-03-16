public class Space {
    private boolean takenByPlayer;
    private boolean takenByComp;

    public Space(boolean takenByPlayer, boolean takenByComp) {
        this.takenByPlayer = takenByPlayer;
        this.takenByComp = takenByComp;
    }

    public boolean isTakenByPlayer() {
        return takenByPlayer;
    }

    public void setTakenByPlayer(boolean takenByPlayer) {
        this.takenByPlayer = takenByPlayer;
    }

    public boolean isTakenByComp() {
        return takenByComp;
    }

    public void setTakenByComp(boolean takenByComp) {
        this.takenByComp = takenByComp;
    }
}
