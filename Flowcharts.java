import java.util.Scanner;

 public class Flowcharts {
    public static void main(String[] args) {
        //input
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int operator = sc.nextInt();

        switch (operator) {
          case 1:System.out.println(a + b);
          break;
          case 2:System.out.println(a - b);
          break;
          case 3:System.out.println(a*b);
          break;
          case 4: if(b == 0) {
            System.out.println("Invalid Division");
          } else {
            System.out.println(a/b);
          }
          break;
          case 5: if(b == 0){
            System.out.println("Invalid Division");
          } else {
            System.out.println(a%b);
          }
          break;
          default:System.out.println("Invalid Operator");

        }
       // int Months  = sc.nextInt();
        //switch (Months) {
        //  case 1:System.out.println("January");
         // break;
         // case 2:System.out.println("Feburary");
        //  break;
         // case 3:System.out.println("March");
          //break;
          //case 4:System.out.println("April");
          //break;
         // case 5:System.out.println("May");
         // break;
         // default:System.out.println("Invalid");
         // break;
        }
      }
    
        //if (button == 1) {
         // System.out.println("Hello");
        //} else if (button == 2){
        //  System.out.println("Namaste");
        //} else if (button == 3) {
        //  System.out.println("bonjour");
        //} else {
         // System.out.println("Invalid");
        //}
        //switch (button) {
          //case 1:System.out.println("Hello");
         // break;
         // case 2:System.out.println("Namaste");
         // break;
          //case 3:System.out.println("Bonjour");
         // break;
          //default:System.out.println("Invalid");
         // break;
        
 
        //if (x % 2 == 0) {
         // System.out.println("Even");
        

       // else {
         // System.out.println("Odd");
        

       // int a = sc.nextInt();
        //int b = sc.nextInt();
       // int sum = a + b;
        //nextInt()
        //nextfloat()

      
        //output
      /*System.out.print("Hello World from java\nTo This Side");
        /* */
        //Next line 
        /*System.out.println("*");
        System.out.println("**");
        System.out.println("***");
        System.out.println("****");
        /* */
        //Variables
        // int a = 10;
       // int b = 25;
        //int sum= a+b;
       // System.out.println(sum);
       // int diff= b-a;
        //System.out.println(diff);
        //int mul= a * b;
        //System.out.println(mul);/* */
         
    



       
        
    
