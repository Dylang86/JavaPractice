public class Team {
    private String teamName;
    private Event event;

    public Team(String teamName, Event event) {
        this.teamName = teamName;
        this.event = event;
    }

    //Deep copy constructor; Creates a new event with the same data.
    public Team(Team other) {
        this.teamName = other.teamName;
        if (this.event )
    }
}