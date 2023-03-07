package model;

import java.util.Scanner;
import java.util.Random;

class Desert {
    private Scanner scan = new Scanner(System.in);
    private Random rand = new Random();

    public int findTreasure() {
        // YOUR CODE HERE
        // A valid treasure trove must be greater than 0
        Random rand = new Random();
        int coins = rand.nextInt(500) + 1;
        double coinsAftertaxes=coins-coins/10;
        coins=(int) coinsAftertaxes;
        if (lost()) {
            if (lost()) {
                return 0;
            }
        }
        return coins;
    }

    public boolean lost() {
        System.out.println("You have gotten lost! Press 1 to try escaping the"
            + " Desert.\nHopefully you can make it out alive.");
        int move = scan.nextInt();
        return (move == 1) ? false : true;
    }
}
