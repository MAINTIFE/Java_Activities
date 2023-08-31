 /* 
    this is a game program that detects if a user is done playing a game/lost 
    in the game and calculates the user's score by performing a simple arithmetic 
    operation with the score, level and bonus obtained during the game :)
    */

import java.util.Scanner;

public class Gamify {
    public static void main(String[] args) {
        // boolean gameOver = true; 

        Scanner scanner = new Scanner (System.in);

        System.out.print("Enter the level completed: ");
        int levelCompleted = scanner.nextInt();

        if (levelCompleted > 5){
            System.out.println("Error!");
            System.exit(0);
        } 

        System.out.print("Enter the bonus obtained: ");
        int bonus = scanner.nextInt();

        System.out.print("Enter the score: ");
        int score = scanner.nextInt();

        int finalScore = score + (levelCompleted * bonus);

        int accumulatedScores = score + score;
        System.out.println(accumulatedScores);
        
        
            if (finalScore == 700  && levelCompleted == 1) {
                System.out.println("Awesome! Your final score is " + finalScore + " :). Proceed to level 2.");
            }else if (finalScore == 900 && levelCompleted == 2){
                System.out.println("Awesome! Your final score is " + finalScore + " :). Proceed to level 3.");
            }else if (accumulatedScores == 1600 && levelCompleted == 2){
                System.out.println("Great!");
            }else{
                System.out.println("You've lost!");
            }
        // }else if (finalScore == 1100 && levelCompleted == 3) {
        //     System.out.println("Awesome! Your final score is " + finalScore + " :). Proceed to level 4.");
        // }else if (accumulatedScores > 1500 && levelCompleted == 2){
        //     System.out.println("Sorry you have lost. Try again.");
        // }else if (finalScore <= 1500){
        //     System.out.println();
        // }else{
        //     System.out.println("You lost! :(");
        // }
        
      
       scanner.close();
    }
}

// maximum of 5 levels
// input score and bonus on each level