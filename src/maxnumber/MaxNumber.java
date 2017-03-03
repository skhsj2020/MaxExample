
package maxnumber;
import java.util.Scanner;
public class MaxNumber {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int x = sc.nextInt();
        System.out.print("Enter second number: ");
        int z = sc.nextInt();
        System.out.println("Max number is: " + maxNumber(x,z));
        
    }
    public static int maxNumber(int num1 , int num2){
        int max;
        if(num1 > num2)
            max = num1;
        else 
            max = num2;
        return max;
    }
}
