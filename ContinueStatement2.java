import java.util.Scanner;

public class ContinueStatement2 {
    // Display all nos. entered by user except multiples of 10.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do{
            System.out.print("Enter a Value : ");
            int num = sc.nextInt();

            if(num % 10 == 0){
                continue;
            }
            System.out.println(num);

        }while(true);




    }
    
}
