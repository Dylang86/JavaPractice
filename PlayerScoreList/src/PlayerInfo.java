public class PlayerInfo {
    private String name;
    private int score;

    public PlayerInfo() {
        this.name = "";
        this.score = 0;
    }

    public PlayerInfo(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }
}