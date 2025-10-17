public class Event {
    private String eventName;
    private int score;

    public Event() {
        this.eventName = "";
        this.score = 0;
    }

    public Event(String eventName, int score) {
        this.eventName = eventName;
        this.score = score;
    }

    //Copy constructor for event (used by deep copy)
    public Event(Event other) {
        this.eventName = other.eventName;
        this.score = other.score;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventName() {
        return eventName;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return " The event is " + getEventName() + ". The contestent " + " scored " + getScore()
                + " points.";
    }
}