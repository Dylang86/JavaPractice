public class TestFile {
    public static void main(String[] args) {
        Competition competitionOne = new Competition("First Competition",
                "Tigers", "The shitters", 1993);
        Competition competitionTwo = new Competition("Second Competition", "The retards",
                "The mangos", 1994);
        Team teamOne = new Team("Antelopes", "Bob", "Dylan", "Terrence",
                competitionOne, competitionTwo);
        System.out.println(teamOne.toString());
        Team teamTwo = new Team("Tigers", "charles", "bongo", "beep",
                competitionOne, competitionTwo);
        Team copy = new Team(teamOne);
        copy.setNameOne("Ashley");
        copy.setNameTwo("Riley");
        System.out.println(copy.toString());
        System.out.println(teamOne.toString());

        Competition compOneCopy = new Competition(competitionOne);
        compOneCopy.setYear(1939);
        System.out.println(compOneCopy.toString());
        System.out.println(competitionOne.toString());
        System.out.println(compOneCopy);
        System.out.println(competitionOne);

        Team copyTwo = new Team(teamTwo);
        System.out.println();
        System.out.println(teamTwo);
        System.out.println();

        System.out.println(copyTwo);
        System.out.println(teamTwo.getCompetitionOne());
        copyTwo.getCompetitionTwo().setYear(1939);
        System.out.println();
        System.out.println(copyTwo.getCompetitionTwo());
        System.out.println(teamTwo.getCompetitionTwo());
    }
}