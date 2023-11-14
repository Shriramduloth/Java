import java.util.Scanner;



class Guesser {
    int guessNum;

    public int guessNumber() {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Guesser! kindly guess the number");
            guessNum = scan.nextInt();
        }
        return guessNum;
    }
}

class Player {

    int pguessNum;

    public int pguessNumber() {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Player! kindly guess the number");
            pguessNum = scan.nextInt();
        }
        return pguessNum;
    }
}

class Umpire {
    int numFromGuesser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;

    public void collectNumFromGuesser() {
        Guesser G = new Guesser();
        numFromGuesser = G.guessNumber();
    }

    public void collectNumFromPlayer() {
        Player P1 = new Player();
        Player P2 = new Player();
        Player P3 = new Player();
    
        numFromPlayer1= P1.pguessNumber();
        numFromPlayer2= P2.pguessNumber();
        numFromPlayer3= P3.pguessNumber();
    }
    void compare() {

        if (numFromGuesser == numFromPlayer1) {
            if (numFromGuesser == numFromPlayer2 && numFromGuesser == numFromPlayer3) {
                System.out.println("All win!");
            } else if (numFromGuesser == numFromPlayer2) {
                System.out.println("Player 1 & 2 won the game!");
            } else if (numFromGuesser == numFromPlayer3) {
                System.out.println("Player 1 & 3 won the game!");
            } else {
                System.out.println("Player 1 won the game!");
            }

        } else if (numFromGuesser == numFromPlayer2) {
            if (numFromGuesser == numFromPlayer3) {
                System.out.println("Player 2 & 3 won the game!");
            } else {
                System.out.println("Player 2 won the game!");
            }
        } else if (numFromGuesser == numFromPlayer3) {
            System.out.println("Player 3 won the game!");
        } else {
            System.out.println("All Lost!");
        }

    }

}

class guessGame {
    public static void main(String[] args) {
        System.out.println("Game started!");
        Umpire u =new Umpire();
        u.collectNumFromGuesser();
        u.collectNumFromPlayer();
        u.compare();
    }
}
