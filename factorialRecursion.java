/**
 * @author Arzun Giri
 */
import java.util.Scanner;
public class factorialRecursion {
    public static int fact(int n){
        if(n==0)
            return 1;
        else
            return (n*fact(n-1));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        System.out.println("Factorial: "+ fact(sc.nextInt()));
        sc.close();
    }
    
}
