package OOPS.qsn1;

import java.util.*;

class Game {
    public int num;
    public int noOfGuesses;
    public int userInput;

    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }

    Game() {
        Random rand = new Random();
        this.num = rand.nextInt(100);

    }

    void takeUserInput() {
        System.out.println("Guess the number");
        Scanner sc = new Scanner(System.in);
        userInput = sc.nextInt();

    }

    boolean isCorrect() {
        noOfGuesses++;
        if (userInput == num) {
            System.out.format("Yes you guessed it right, it was %d \nYou guessed it in %d attempts", num, noOfGuesses);
            return true;
        } else if (userInput < num) {
            System.out.println("guesss higher");
        } else if (userInput > num) {
            System.out.println("guesss lower");
        }
        return false;

    }
}

public class guess {

    public static void main(String[] args) {

        Game g = new Game();
        g.takeUserInput();
        boolean b = false;
        while (!b) {
            g.takeUserInput();
            b = g.isCorrect();
        }

    }
}
