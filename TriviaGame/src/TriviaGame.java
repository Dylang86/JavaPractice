public class TriviaGame {
    private String question;
    private String answer;
    private int points;

    public TriviaGame() {
        this.question = "";
        this.answer = "";
        this.points = 0;
    }

    public TriviaGame(String question, String answer, int points) {
        this.question = question;
        this.answer = answer;
        this.points = points;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getQuestion() {
        return question;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getAnswer() {
        return answer;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getPoints() {
        return points;
    }

}