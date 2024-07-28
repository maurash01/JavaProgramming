import java.util.Scanner;

public class BreakStatement2 {
    // Print no. from user & break while enetering multiple of 10 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do{
            System.out.print("Enter a value : ");
            int num = sc.nextInt();
            if(num % 10 == 0){
                break;
            }
            System.out.println(num);
        }while(true);
        
    }}