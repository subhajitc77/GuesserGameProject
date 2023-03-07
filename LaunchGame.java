import java.util.Scanner;

class Player
{
    int numGuess;
    public void guessNumber() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hey Player, Guess the Number");
        numGuess=sc.nextInt();
    }

}

class Guesser
{
    int numGuess;
    public void guessNumber() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hey Guesser, Guess the Number");
        numGuess=sc.nextInt();
    }
    
}

class Umpire 
{
    Guesser guesser;
    Player p1, p2, p3;

    public void getNumberFromGuesser() 
    {
        guesser = new Guesser();
        guesser.guessNumber();
    }

    public void collectFromPlayers()
    {
       p1 = new Player();
       p2 = new Player();
       p3 = new Player();
       p1.guessNumber();
       p2.guessNumber();
       p3.guessNumber();  
    }

    public void calcResult() 
    {
       System.out.println(guesser.numGuess + " " + p1.numGuess + " " + p2.numGuess + " " + p3.numGuess);
       if(guesser.numGuess == p1.numGuess)
       {
           if(guesser.numGuess == p2.numGuess && guesser.numGuess == p3.numGuess)
            System.out.println("All are Winners");
           else if (guesser.numGuess == p2.numGuess)
            System.out.println("Players 1 and 2 are the Winners");
           else if (guesser.numGuess == p3.numGuess)
            System.out.println("Players 1 and 3 are the Winners");
           else 
             System.out.println("Player 1 is the Winner");
       }
       else if (guesser.numGuess == p2.numGuess)
        {
            if(guesser.numGuess == p3.numGuess)
             System.out.println("Players 2 and 3 are the Winners");
            else
             System.out.println("Player 2 is the Winner");
        }
       else if(guesser.numGuess == p3.numGuess)
         {
            System.out.println("P3 is the Winner");
         }
       else 
         {
            System.out.println("All are Losers");
         }
    }
}



public class LaunchGame 
{
public static void main(String[] args) 
{
    Umpire umpire = new Umpire();
    umpire.getNumberFromGuesser();
    umpire.collectFromPlayers();
    umpire.calcResult();
}
    
}
