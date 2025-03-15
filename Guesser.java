import java.lang;
import java.util;

public class Guesser {
    int guess = 0;
    int correct = 0;
    int turntracker = 0;

    public static void main(){
        Guesser game = new Guesser()
    }
    public Guesser(){
        bool keepGoing = true;
        while(keepGoing){
            String selection = menu();
            if(selection == "0"){
                keepGoing = false;
            }
            else if(selection == "1"){
                humanGuesser();
            }
            else{
                computerGuesser();
            }
        }
    }
    public menu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("0) Exit");
        System.out.println("1) Human Guesser");
        System.out.println("2) Computer Guesser");
        System.out.println("Please choose 0-2");
        String choice = scanner.nextLine();
        return choice;
    }
    public humanGuesser(){
        Scanner scanner = new Scanner(System.in);
        correct = (int)(Math.random()* 100) + 1;
        bool keepGoing = true
        while(keepGoing){
            System.out.println("Guess a number");
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
        }
    }
    public computerGuesser(){
        Scanner scanner = new Scanner(System.in);
        int low = 1;
        int high = 100;
        boolean keepGoing = true;

        while(keepGoing){
            guess = (low +(high - low) / 2);
            System.out.println(turntracker + ") I guess " + guess);
            System.out.println("Too (H)igh, too (L)ow, or (C)orrect? ");
            String response = scanner.nextLine().toLowerCase();

        }
    }
}