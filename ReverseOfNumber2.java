public class ReverseOfNumber2 {
    public static void main(String[] args) {
        int number = 10899;
        int rev = 0;
        
        while (number > 0) {
            int lastdigit = number%10 ; 
            rev =   (rev * 10 ) + lastdigit;
            number = number/10 ; 
            
        }
        System.out.println(rev);
    }
    
}
