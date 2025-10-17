public class Competition {
    private String competitionName;
    private String winningTeam;
    private String runnerUp;
    private int year;

    public Competition() {
        this.competitionName = "";
        this.winningTeam = "";
        this.runnerUp = "";
        this.year = 0;
    }

    public Competition(String competitionName, String winningTeam, String runnerUp, int year) {
        this.competitionName = competitionName;
        this.winningTeam = winningTeam;
        this.runnerUp = runnerUp;
        this.year = year;
    }

    //Copy constructor
    public Competition(Competition other) {
        this.competitionName = other.competitionName;
        this.winningTeam = other.winningTeam;
        this.runnerUp = other.runnerUp;
        this.year = other.year;
    }

    public void setCompetitionName(String competitionName) {
        this.competitionName = competitionName;
    }

    public String getCompetitionName() {
        return competitionName;
    }

    public void setWinningTeam(String winningTeam) {
        this.winningTeam = winningTeam;
    }

    public String getWinningTeam() {
        return winningTeam;
    }

    public void setRunnerUp(String runnerUp) {
        this.runnerUp = runnerUp;
    }

    public String getRunnerUp(){
        return runnerUp;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear(){
        return year;
    }

    @Override
    public String toString() {
        return getCompetitionName() + ", the winning team was " + getWinningTeam() + ". The runners up were " +
                getRunnerUp() + ". The year was " + getYear() + ".";
    }
}