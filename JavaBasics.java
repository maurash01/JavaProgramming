import java.util.*;

public class JavaBasics{
    public static void main(String args[]){ //boilerplatecode 
        System.out.print("Hello World");
        System.out.print("1 2 3 4 5 "); 
        // This will print in Single line 

        System.out.println("Hello World "); //println - Print k baad 1 line ka space 
        System.out.println("1 2 3 4 5 "); 
        System.out.print("10 20 30  \n "); 
        System.out.println("15 30 45  "); // \n khi bhi line gap k liye 


        System.out.println("-----------------------------------------");
        //Printing Given Star Patterns
        System.out.println("****");
        System.out.println("***");
        System.out.println("**");
        System.out.println("*");
        System.out.println("-----------------------------------------");

        // Variables In Java 
        int a = 10; 
        int b = 5 ;
        System.out.println(a+b); 
        String name = "Tony Stark";
        System.out.println(name);
        System.out.println("-----------------------------------------");

        //Datatypes in Java 

        byte  byn =8;
        System.out.println(b);
        char c = 'a';
        System.out.println(a);
        boolean var = true ;
        int number = 200 ;
        System.out.println("--------------------------------------------");
        //Sum of a & b 
        int ash = 10;
        int bsh =20;
        int sum =  ash+bsh  ;
        System.out.println(sum); 
        System.out.println("-------------------------------------------");

            Scanner sc = new Scanner(System.in);
            //String input = sc.next();  // sc.next() will not consider spaces in input  
            //System.out.println(input);

            //String newname = sc.nextLine();   //sc.nextLine() will consider spaces 
            //System.out.println(newname);

            //int numberr = sc.nextInt();    //for numbers 
            //System.out.println(numberr); 

           // float flvalue = sc.nextFloat();
            // System.out.println(flvalue);
        System.out.println("------------------------------------------------");    

        // Printing Sum of two nos.

           /* int a1 = sc.nextInt();
            int b1 = sc.nextInt();
            int summ = (a1+b1);
            //System.out.println(summ);
            
        // Product of Two Numbers 
        
            int p1 = sc.nextInt();
            int p2 = sc.nextInt();
            int prod = p1*p2 ;
            System.out.println(prod); 
        
        // Find Area of a circle 
        
            float  rad = sc.nextFloat();
            float  area = 3.14f *rad*rad ; 
            System.out.println(area); */ 


        // Type conversion 
        // #only in 'type compatible' like : int <--> float 
        // Condition :- destination type > Source type 
        // byte -> Short -> int -> float -> long -> double 

            int val1 = 25 ;
            long val2 = val1 ;
            System.out.println(val2);

        // if long val1 and int val2 = error ; long < int    
        
           /* Scanner scn = new Scanner(System.in);
            float numberr = scn.nextInt();
            System.out.println(numberr); */


        // Type Casting in Java 

            Scanner scn = new Scanner(System.in);
            float a11 = 30.12f ;
            int b11 = (int)a11 ; 
            System.out.println(b11);

        // converting a character into number 
        
            char ch = 'A';
            int num = ch ;
            System.out.println(num);

        // Type promotion 
        // byte,short, char to int 
        // long,float,double to double 

        //Byte case type promotion 

        // wrong 
        //byte b= 5 ;
        //b= b*2;

        //right 
       // byte b = 5 ; 
       // b = (byte) (b*2);

       
            
    }
}
