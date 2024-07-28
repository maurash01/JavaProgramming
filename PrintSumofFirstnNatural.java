import java.util.Scanner;

public class PrintSumofFirstnNatural {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int range = sc.nextInt();

        int counter = 1 , sum = 0; 
        while (counter <= range) {
            System.out.print(counter+" ");
            sum = sum + counter;
            counter++;
            
        }
        System.out.println();
        System.out.println("Sum of Natural numbers upto "+range+" are:"+sum);
    }
    
}
