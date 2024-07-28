public class ContinueStatement {
    public static void main(String[] args) {
        // Continue keyword is used to SKIP an iteration 

        for (int i=1 ; i<=10 ; i++){
            if( i==3 ){
                continue;
            }
            System.out.println(i);
        }
    }
    
}
