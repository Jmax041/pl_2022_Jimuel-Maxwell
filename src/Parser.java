import java.util.Scanner;

public class Parser {

    public static void main (String[] args){

        //take input from user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Tokens: ");
        String input = sc.nextLine();

        //put input into an array
        String[] token;
        token = input.split(" ");

        //correct token order: <data_type> <identifier> <assignment_operator> <value> <delimiter>
        String[] correct = {"<data_type>","<identifier>","<assignment_operator>","<value>","<delimiter>"};

        //array that stores comparing result
        String[] checking = new String[5];

        //compare input tokens to correct syntax order
        for(int a=0;a<token.length;a++){
            if(token[a].contentEquals(correct[a])){
                checking[a] = "true";
            }

            else {
                checking[a] = "false";
            }
        }

        //Prints Syntax Error if there's a false statement
        for (String s : checking) {
            if (s.contains("false")) {
                System.out.println("Syntax Error!");
                System.exit(0);
            }
        }

        //Prints Syntax is correct if all statements equal to true
        System.out.println("Syntax is Correct!");
    }
}
