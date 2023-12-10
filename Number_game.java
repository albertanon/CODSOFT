import java.util.*;
public class Number_game {
    public static int random_number_generator(){
        Random rn=new Random();
        int r_num=rn.nextInt(100)+1;
        return r_num;
    }
    public static void user_input(){
        int r_num=random_number_generator();
        Scanner sc=new Scanner(System.in);
        int score=0;
        System.out.println("You have only 10 chance to guess the correct number. Let's start the game...");
        int i=1;
        while (i<=10){
            System.out.println("Chance "+i);
            System.out.print("Enter your guess in range 1 to 100: ");
            int guess_num=sc.nextInt();
            if (guess_num==r_num){
                System.out.println("Congratulation! You guessed it right.");
                r_num=random_number_generator();
                score++;
            }
            else {
                if(guess_num>r_num){
                    System.out.println("Your guess is too high from the original number...");
                }
                else {
                    System.out.println("Your guess is too low from the original number...");
                }
                if(i==10){
                    System.out.println("Ohh.. sorry, your all chance are over, the original number was "+r_num);
                }
            }
            i++;
        }
        System.out.println("Your total score out of 10 is "+score);
        return;
    }
    public static void main(String[] args) {
        //user_input();
        Scanner sc=new Scanner(System.in);
        while (true){
            System.out.println("Do you want to play(Y|N)");
            char choice=sc.next().charAt(0);
            if(choice=='y' || choice=='Y'){
                user_input();
            }
            else{
                break;
            }
        }
    }
}
