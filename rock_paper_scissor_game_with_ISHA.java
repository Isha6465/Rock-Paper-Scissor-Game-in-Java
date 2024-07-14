import java.util.Random;
import java.util.Scanner;
public class rock_paper_scissor_game_with_ISHA {
    public static void main(String[] args) 
    {
        System.out.println("let's play Rock Paper Scissor Game ");
        System.out.println("_________________________________");
        System.out.println("_____ARE YOU READY?________");
        System.out.println("ENTER 0 FOR ROCK 1 FOR PAPER AND 2 FOR SCISSOR");
        Scanner sc = new Scanner(System.in);
        int isha = sc.nextInt();
Random random = new Random();
int computer = random.nextInt(3);
if(isha == 0 && computer== 1||isha == 2 && computer == 1||isha == 1 && computer == 0){
    System.out.println("CONGRATULATIONS YOU WIN!");
}
else
{
    System.out.println("COMPUTER WON");
 }
 System.out.println("let's see what computer have entered");
 if(computer == 0)
 {
    System.out.println("computer choosed ROCK");
 }
 if(computer == 1)
 {
    System.out.println("computer choosed PAPER");
 }
 if(computer == 2)
 {
    System.out.println("compuer choosed SCISSOR");
 }
 System.out.println("hope so you enjoyed the game!");
 sc.close();
 }
}
