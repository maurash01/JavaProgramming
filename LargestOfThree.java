import java.util.*;

public class LargestOfThree {
    public static void main(String[] args) {
        int A = 10 , B = 70 , C = 30;
        if (A >= B && A >= C  ) {
            System.out.println("A is Largest");
            
        } else if (B>=C) {
            System.out.println(" B is Largest");
            
        }
        else{
            System.out.println("C is Largest");
        }
    }
    
}
