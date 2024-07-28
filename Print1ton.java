import java.util.*;

public class Print1ton {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int counter = 1;
        System.out.println("Select value of n :");
        int range = sc.nextInt();
        while (counter <= range ) {
            System.out.print(counter+" ");

            counter++;
            
        }
        System.out.println();
    }
    
}
