import java.util.*;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int randomNumber = rand.nextInt(100) + 1;
        int numberOfTries = 0;

        Scanner in = new Scanner(System.in);

        boolean win = false;

        while (!win) {
            System.out.print("Please enter a number between 0 and 100 ");
            int guess = in.nextInt();
            numberOfTries++;

            if (guess == randomNumber) {
                System.out.println("You Win!");
                System.out.println("The number was " + randomNumber);
                System.out.println("It took you " + numberOfTries + " tries");
                win = true;
            } else if (guess >= randomNumber) {
                System.out.println("Too High!");
            } else {
                System.out.println("Too Low!");
            }
        }
    }
}