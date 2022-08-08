import java.util.Scanner;

public class Operation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first number");
        int number1 = input.nextInt();
        System.out.println("Enter your second number");
        int number2 = input.nextInt();
        System.out.println("Choose your operation :");
        String operator = input.next();
        try {


        if(operator == "+"){
            System.out.println("result of + is "+(number1+number2));
            
        } else if (operator == "-") {
            System.out.println("result of - is "+(number1-number2));
        } else if (operator == "*") {
            System.out.println("result of * is "+(number1*number2));
        } else if (operator == "/") {
            System.out.println("result of / is "+(number1/number2));
        }}catch (Exception e){
            System.out.println(" please enter input as number only ");
        }
    }
}
