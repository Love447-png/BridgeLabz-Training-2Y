import java.util.*;

public class RPSGame {
    public static String compChoice(){
        int r = (int)(Math.random()*3);
        if(r==0) return "rock";
        else if(r==1) return "paper";
        else return "scissors";
    }

    public static String findWinner(String user, String comp){
        if(user.equals(comp)) return "draw";
        if(user.equals("rock") && comp.equals("scissors")) return "user";
        if(user.equals("rock") && comp.equals("paper")) return "comp";
        if(user.equals("paper") && comp.equals("rock")) return "user";
        if(user.equals("paper") && comp.equals("scissors")) return "comp";
        if(user.equals("scissors") && comp.equals("paper")) return "user";
        if(user.equals("scissors") && comp.equals("rock")) return "comp";
        return "draw";
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of games: ");
        int n = sc.nextInt();

        int userWins=0, compWins=0, draws=0;

        for(int i=0;i<n;i++){
            System.out.print("rock/paper/scissors: ");
            String user = sc.next();
            String comp = compChoice();
            System.out.println("Computer: " + comp);
            String res = findWinner(user, comp);
            if(res.equals("user")) userWins++;
            else if(res.equals("comp")) compWins++;
            else draws++;
        }

        System.out.println("User wins: " + userWins);
        System.out.println("Computer wins: " + compWins);
        System.out.println("Draws: " + draws);
    }
}
