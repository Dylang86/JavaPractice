public class Team {
    private String teamName;
    private String nameOne, nameTwo, nameThree;
    private Competition competitionOne, competitionTwo;

    public Team() {
        this.teamName = "";
        this.nameOne = "";
        this.nameTwo = "";
        this.nameThree = "";
        this.competitionOne = null;
        this.competitionTwo = null;
    }

    public Team(String teamName, String nameOne, String nameTwo, String nameThree, Competition competitionOne,
                Competition competitionTwo) {
        this.teamName = teamName;
        this.nameOne = nameOne;
        this.nameTwo = nameTwo;
        this.nameThree = nameThree;
        this.competitionOne = competitionOne;
        this.competitionTwo = competitionTwo;
    }

    //Deep copy constructor
    public Team(Team original) {
        if (original == null) {
            System.out.println("Fatal Error");
            System.exit(0);
        }
        this.teamName = original.teamName;
        this.nameOne = original.nameOne;
        this.nameTwo = original.nameTwo;
        this.nameThree = original.nameThree;
        this.competitionOne = original.competitionOne;
        this.competitionTwo = original.competitionTwo;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setNameOne(String nameOne) {
        this.nameOne = nameOne;
    }

    public String getNameOne() {
        return nameOne;
    }

    public void setNameTwo(String nameTwo) {
        this.nameTwo = nameTwo;
    }

    public String getNameTwo() {
        return nameTwo;
    }

    public void setNameThree(String nameThree) {
        this.nameThree = nameThree;
    }

    public Competition getCompetitionOne() {
        return competitionOne;
    }

    public Competition getCompetitionTwo() {
        return competitionTwo;
    }

    public String getNameThree() {
        return nameThree;
    }

    @Override
    public String toString() {
        return "Team " + getTeamName() + ". Members: " + getNameOne() + ", " + getNameTwo() + ", " + getNameThree() +
                ". " + getCompetitionOne();
    }
}