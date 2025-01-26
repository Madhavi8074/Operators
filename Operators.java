import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1=sc.nextInt();
        System.out.println("Enter the Second number: ");
        int num2=sc.nextInt();

        int sum=num1+num2;
        int difference=num1-num2;
        int product=num1*num2;
        int quotient =num1/num2;
        int remainder=num1%num2;

        boolean isEqual=num1==num2;
        boolean isNotEqual=num1 != num2;
        boolean isGreater = num1>num2;
        boolean isLesser=num1 < num2;
        boolean isGreaterEqual = num1>=num2;
        boolean isLesserEqual=num1 <= num2;
       
        boolean logicalAnd=(num1>0)&&(num2>0);
        boolean logicalOr=(num1>0)||(num2>0);
        boolean logicalNot=!(num1>num2);

        System.out.println("\nArithmetic Operations:");
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);
        
        System.out.println("\nRelational Operations:");
        System.out.println("Is Equal: " + isEqual);
        System.out.println("Is Not Equal: " + isNotEqual);
        System.out.println("Is Greater: " + isGreater);
        System.out.println("Is Lesser: " + isLesser);
        System.out.println("Is Greater or Equal: " + isGreaterEqual);
        System.out.println("Is Lesser or Equal: " + isLesserEqual);
        
        System.out.println("\nLogical Operations:");
        System.out.println("Logical AND: " + logicalAnd);
        System.out.println("Logical OR: " + logicalOr);
        System.out.println("Logical NOT: " + logicalNot);
        
        sc.close();

    }}

