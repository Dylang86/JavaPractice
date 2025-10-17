import java.util.Scanner;
public class PlayerScore {
    public static void main(String[] args) {
        PlayerInfo[] players = new PlayerInfo[10];
        Scanner scanner = new Scanner(System.in);
        while (true) {
            if (!menu(players, scanner)) {
                break;
            }
        }
        scanner.close();
    }

    public static boolean menu(PlayerInfo[] players, Scanner scanner) {
        System.out.println("1: Add Player");
        System.out.println("2: Remove Player");
        System.out.println("3: Get Players Score");
        System.out.println("4: Print Players");
        System.out.println("5: Exit");
        int input = scanner.nextInt();
        scanner.nextLine();
        System.out.println();
        switch (input) {
            case 1:
                addPlayer(players, scanner);
                break;
            case 2:
                removePlayer(players, scanner);
                break;
            case 3:
                getPlayersScore(players, scanner);
                break;
            case 4:
                printPlayers(players);
                break;
            case 5:
                return false;
        }
        return true;
    }

    public static void addPlayer(PlayerInfo[] players,  Scanner scanner) {
        boolean checkOpening = false;
        for (PlayerInfo p : players) {
            if (p == null) {
                checkOpening = true;
                break;
            }
        }
        if (checkOpening == false) {
            System.out.println("Cannot add anymore players, the list is full");
            return;
        }

        System.out.println("Adding Player");
        for (int i = 0; i < players.length; i++) {
            if (players[i] == null || players[i].equals("")) {
                System.out.println("Input player name: ");
                String name = scanner.nextLine();
                System.out.println("Input player score");
                int score = scanner.nextInt();
                scanner.nextLine();
                players[i] = new PlayerInfo(name, score);
                return;
            }
        }
        System.out.println("The list is full.");
    }

    public static void printPlayers(PlayerInfo[] players) {
        if (checkIfNull(players)) {
            System.out.println("There are no players in the list");
            return;
        }

        for (int i = 0; i < players.length; i++) {
            if (players[i] == null) {
                continue;
            }
            if (players[i] != null && !players[i].getName().isBlank()) {
                System.out.println("Name: " + players[i].getName());
                System.out.println("Score: " + players[i].getScore());
            }
        }
    }

    public static void getPlayersScore(PlayerInfo[] players,  Scanner scanner) {
        if (checkIfNull(players)) {
            System.out.println("There are no players scores in the list");
            return;
        }

        System.out.println("Input the name of the player you are looking for: ");
        String playerName = scanner.nextLine();

        for (int i = 0; i < players.length; i++) {
            if (playerName.equalsIgnoreCase(players[i].getName())) {
                System.out.println(players[i].getName() + "'s score is " + players[i].getScore());
                return;
            }
        }
        System.out.println("That player is not on the list");
    }

    public static void removePlayer(PlayerInfo[] players,  Scanner scanner) {
        if (checkIfNull(players)) {
            System.out.println("Cannot remove player, there are no players in the list.");
            return;
        }

        System.out.println("Input the name of the player you wish to remove.");
        String name = scanner.nextLine();
        for (int i = 0; i < players.length; i++) {
            String playerName = players[i].getName();
            if (playerName == null || playerName.isBlank()) {
                continue;
            }
            if (players[i].getName().equalsIgnoreCase(name)) {
                players[i] = null;
                System.out.println("The player " + name + " has been removed.");
                break;
            }
        }
    }

    public static boolean checkIfNull(PlayerInfo[] players) {
        if (players == null || players.length == 0) {
            return true;
        }

        for (PlayerInfo p : players) {
            if (p == null) {
                continue;
            }
            String name = p.getName();
            if (name != null && !name.isBlank()) {
                return false;
            }
        }
        return true;
    }
}