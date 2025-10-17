public class DuelDemo {
    public static void main(String[] args) {
        runDuels(10000, 0);
        System.out.println();
        System.out.println("Aaron first shot missing technique");
        runDuels(10000, 1);

    }

    public static void runDuels(int amountOfDuels, int typeOfDuel) {
        int aaronWins = 0;
        int bobWins = 0;
        int charlieWins = 0;

        for (int i = 0; i < amountOfDuels; i++) {
            String outcome;
            if (typeOfDuel == 0) {
                outcome = duel(0);
            } else {
                outcome = duel(1);
            }
            switch (outcome) {
                case "aaron":
                    aaronWins++;
                    break;
                case "bob":
                    bobWins++;
                    break;
                case "charlie":
                    charlieWins++;
                    break;
            }
        }
        System.out.printf("Aaron won %,d / %,d duels or %.2f%%%n", aaronWins, amountOfDuels,
                ((double) aaronWins/amountOfDuels) * 100);
        System.out.printf("Bob won %,d / %,d duels or %.2f%%%n", bobWins, amountOfDuels,
                ((double) bobWins/amountOfDuels) * 100);
        System.out.printf("Charlie won %,d / %,d duels or %.2f%%%n", charlieWins, amountOfDuels,
                ((double) charlieWins/amountOfDuels) * 100);


    }

    public static String duel(int typeOfDuel) {
        Duelist aaron = new Duelist("Aaron", (double) 1/3, true);
        Duelist bob = new Duelist("Bob", (double) 1/2, true);
        Duelist charlie = new Duelist("Charlie", 1, true);

        while (true) {
            if (typeOfDuel == 1) {
                typeOfDuel++;
            } else if (aaron.checkAlive()) {
                if (charlie.checkAlive()) {
                    aaron.shootAtTarget(charlie);
                } else if (bob.checkAlive()) {
                    aaron.shootAtTarget(bob);
                } else {
                    return "aaron";
                }
            }

            if (bob.checkAlive()) {
                if (charlie.checkAlive()) {
                    bob.shootAtTarget(charlie);
                } else if (aaron.checkAlive()) {
                    bob.shootAtTarget(aaron);
                } else {
                    return "bob";
                }
            }

            if (charlie.checkAlive()) {
                if (bob.checkAlive()) {
                    charlie.shootAtTarget(bob);
                } else if (aaron.checkAlive()) {
                    charlie.shootAtTarget(aaron);
                } else {
                    return "charlie";
                }
            }
        }
    }
}