import java.util.*;

public class SpaceRace {
    // 'private static' for class-level access
    // final to prevent modification
    private static final String EAGLE_5 = "5";
    private static final String ENTERPRISE = "E";

    private static int eagle5Position = 1;
    private static int enterprisePosition = 1;

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the spacecraft race simulation!");

        // while loop until either spacecraft reaches 70
        while (eagle5Position < 70 && enterprisePosition < 70) {
            System.out.println("Press any key for next step or type 'run' to run the simulation:");
            String input = scanner.nextLine();
            if (input.equals("run")) {
                while (eagle5Position < 70 && enterprisePosition < 70) {
                    moveSpacecraft();
                    displayRace();
                }
                break;
            } else {
                moveSpacecraft();
                displayRace();
            }
        }
        // condition to check the winner
        if (eagle5Position >= 70 && enterprisePosition >= 70) {
            System.out.println("It's a tie!");
        } else if (eagle5Position >= 70) {
            System.out.println("Eagle 5 wins!");
        } else if (enterprisePosition >= 70) {
            System.out.println("Enterprise wins!");
        }
        scanner.close();
    }

    // method to move the spacecraft
    private static void moveSpacecraft() {
        // calls method for each spacecraft
        int eagle5Move = getMoveType("Eagle 5");
        int enterpriseMove = getMoveType("Enterprise");

        // update the position of each spacecraft
        eagle5Position += eagle5Move;
        enterprisePosition += enterpriseMove;

        if (eagle5Position < 1)
            eagle5Position = 1;
        if (enterprisePosition < 1)
            enterprisePosition = 1;
    }

    private static int getMoveType(String spacecraft) {
        // two random numbers are generated for each spacecraft
        int roll = (int) (Math.random() * 10) + 1;
        // gets movement for eagle 5
        if (spacecraft.equals("Eagle 5")) {
            if (roll <= 5) {
                return 1;
            } else if (roll <= 7) {
                return -3;
            } else {
                return 5;
            }
            // gets movement for enterprise
        } else {
            if (roll == 1) {
                return 0;
            } else if (roll <= 4) {
                return 7;
            } else if (roll <= 8) {
                return -4;
            } else {
                return 1;
            }
        }
    }

    // method to display the current track in iteration
    private static void displayRace() {
        StringBuilder raceTrack = new StringBuilder("|");
        for (int i = 1; i <= 70; i++) {
            if (eagle5Position == i && enterprisePosition == i) {
                raceTrack.append("BUMP!");
            } else if (eagle5Position == i) {
                raceTrack.append(EAGLE_5);
            } else if (enterprisePosition == i) {
                raceTrack.append(ENTERPRISE);
            } else {
                raceTrack.append("-");
            }
        }
        raceTrack.append("|");
        System.out.println(raceTrack);
    }
}