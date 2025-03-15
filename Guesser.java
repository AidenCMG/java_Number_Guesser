import java.lang.Math;
import java.util.Scanner;

public class Guesser {
    int guess = 0;
    int correct = 0;

    public static void main(String[] args){
        Guesser game = new Guesser();
        game.start();
    }
    public Guesser(){
        // As empty as my fridge
    }

    public void start(){
        boolean keepGoing = true;
        while(keepGoing){
            String selection = menu();
            if(selection.equals("0")){
                keepGoing = false;
            }
            else if(selection.equals("1")){
                humanGuesser();
            }
            else{
                computerGuesser();
            }
        }
    }
    public String menu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("0) Exit");
        System.out.println("1) Human Guesser");
        System.out.println("2) Computer Guesser");
        System.out.println("Please choose 0-2");
        String choice = scanner.nextLine();
        return choice;
    }
    public void humanGuesser(){
        Scanner scanner = new Scanner(System.in);
        correct = (int)(Math.random()* 100) + 1;
        /* For testing
        System.out.println(correct);
        */
        boolean keepGoing = true;
        int turnTracker = 1;
        while(keepGoing){
            System.out.println(turnTracker + ") Guess a number");
            guess = scanner.nextInt();
            scanner.nextLine();
            if(guess < correct){
                System.out.println("Too low");
            }
            else if(guess > correct){
                System.out.println("Too high");
            }
            else{
                System.out.println("Correct!");
                keepGoing = false;
            }
            turnTracker++;
        }
    }
    public void computerGuesser(){
        Scanner scanner = new Scanner(System.in);
        int low = 1;
        int high = 100;
        boolean keepGoing = true;

        int turnTracker = 1;
        while(keepGoing && low <= high){
            guess = (low +(high - low) / 2);

            System.out.println(turnTracker + ") I guess " + guess);
            System.out.println("Too (H)igh, Too (L)ow, or (C)orrect? ");
            String response = scanner.nextLine().toLowerCase();

            if(response.equals("h")){
                high = guess - 1;
            }
            else if(response.equals("l")){
                low = guess + 1;
            }
            else if(response.equals("c")){
                System.out.println("EZ");
                keepGoing = false;
            }
            else{
                System.out.println("Invalid input!");
            }
            turnTracker++;
        }
        if(low > high){
            System.out.println("01011001 01101111 01110101 00100000 01100100 01101111 01101110 00100111 01110100 00100000 01101011 01101110 01101111 01110111 00100000 01101000 01101111 01110111 00100000 01101110 01110101 01101101 01100010 01100101 01110010 01110011 00100000 01110111 01101111 01110010 01101011 00101110 00101110 00101110 >:(");
        }
    }
}