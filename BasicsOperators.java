import java.util.*;
public class BasicsOperators {
    public static void main ( String args[]){
        int A = 10;
        int B = 5;

        // Binary operators 
        System.out.println("add= " + (A+B));
        System.out.println("Subtract=" + (A-B));
        System.out.println("Multiply" + (A*B));
        System.out.println("Divide=" + (A/B));
        System.out.println("--------------------------");

        // Unary Operators 
        // i.e. a++ => a = a+1 
        // types 1. PreIncrement : ++a = First Change then use 
        // types 1. PostIncrement : a++ = First use then Change  

        
      /*int a = 10;
        int b = ++a;  // PreIncrement 
        System.out.println(a);
        System.out.println(b); //Result: a=11,b=11


        int a = 10;
        int b = a++;  // PostIncrement 
        System.out.println(a);
        System.out.println(b);  // result : a= 11 , b= 10 */ 

        // a-- : PreDecrement & --a : Post Decrement 

       /* int a = 10;
        int b= --a ; 
        System.out.println(a);
        System.out.println(b); 


        int a = 10;
        int b= a-- ; 
        System.out.println(a);
        System.out.println(b); */ 


        // Relational Operators

         

       /*  int a = 10;
        int b= 5 ;
        System.out.println(a==b); // Equals to 

        System.out.println(a!=b); // Not equals to 

        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a>=b);
        System.out.println(a<=b);   */ 


        // Logical Operators 

        //1.Laogical AND ; && 

        System.out.println((3>2) && (5>0));

        // 2. Logical OR : ||
        System.out.println((3>2) || (0>5));

        //3.Logical Not : 

        System.out.println(!(0>5));

        System.out.println("-----------------------------");


        //Assignment Operators ie. '='

        //Some More are : 
        // += : a=a+1
        // -= : a=a-1
        // *= : a=a*1
        // /= : a=a/1 

        int a = 10;
        a += 10;
        System.out.println(a);

        int b= 20;
        b -= 10;
        System.out.println(b);


        int c=5;
        c *= 5 ;
        System.out.println(c);
         










    }
    
}
