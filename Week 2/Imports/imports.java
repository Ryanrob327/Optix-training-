import java.util.Scanner;
import java.lang.Math;

public class imports {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int rand = (int)Math.floor(Math.random()*(101));
        System.out.println(rand);
        int guess = scanner.nextInt();
        
        while (guess != rand){
            if (guess <= rand){
                System.out.println("to low");
                guess = scanner.nextInt();
            }
            else if (guess >= rand){
                System.out.println("to high");
                guess = scanner.nextInt();
            }
        System.out.println("correct");
        }
    }
}
