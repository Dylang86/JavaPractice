public class CopyConstructorDemo {

    // ====== Simple, mutable class ======
    static class Competition {
        private String name;
        private int year;

        public Competition(String name, int year) {
            this.name = name;
            this.year = year;
        }

        public Competition(Competition other) {
            this.name = other.name;
            this.year = other.year;
        }

        public String getName() { return name; }
        public void setName(String name) { this.name = name; }
        public int getYear() { return year; }
        public void setYear(int year) { this.year = year; }

        @Override
        public String toString() {
            return "Competition{name='" + name + "', year=" + year + "}";
        }
    }

    // ====== Class that CONTAINS another class ======
    static class Team {
        private String teamName;
        private Competition competition; // <-- reference to another object

        // Regular constructor
        public Team(String teamName, Competition competition) {
            this.teamName = teamName;
            this.competition = competition; // (for now) just store the reference
        }

        //Deep copy
        public Team(Team other) {
            this.teamName = other.teamName;
            if (other.competition == null) {
                this.competition = null;
            } else {
                this.competition = new Competition(other.competition);
            }
        }

        public String getTeamName() { return teamName; }
        public Competition getCompetition() { return competition; }

        @Override
        public String toString() {
            return "Team{teamName='" + teamName + "', competition=" + competition + "}";
        }
    }

    // ====== Demo ======
    public static void main(String[] args) {
        // Original objects
        Competition worldCup = new Competition("World Cup", 2026);
        Team original = new Team("Blue Hawks", worldCup);

        // Make a SHALLOW copy (using the shallow copy constructor above)
        Team shallowCopy = new Team(original);

        System.out.println("Before change:");
        System.out.println("  original    = " + original);
        System.out.println("  shallowCopy = " + shallowCopy);

        // Now mutate the shared Competition via original
        original.getCompetition().setYear(2030);
        original.getCompetition().setName("World Cup (moved)");

        System.out.println("\nAfter changing original.competition:");
        System.out.println("  original    = " + original);
        System.out.println("  shallowCopy = " + shallowCopy);
        // Notice how BOTH changed — that's the shallow copy problem!
    }
}