package lecture_6.java;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first Number");
         double a = sc.nextDouble();
        System.out.println("Enter the Operator ('+' '-' '/' '*') ");
        char operator = sc.next().charAt(0);
        System.out.println("Enter the second Number");
        double b = sc.nextDouble();
        double result;
        switch(operator){
            case '+':
                System.out.println(result=a+b);
                break;
            case'-':
                System.out.println(result=a-b);
                break;
            case'*':
                System.out.println(result=a*b);
                break;
            case'/':
                if(b!=0)
                {
                    System.out.println(result = a/b);
                }
                else{
                    System.out.println("Error!!");
                }

                break;
            default:
                System.out.println("Invalid Operator");
        }

    }
}
