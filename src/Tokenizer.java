import java.util.Scanner;


public class Tokenizer {

    public static void main (String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Source Language: ");
        String input = sc.nextLine();
        String token[] = new String[]{};
        token = input.split(" ");

        for(int a=0;a<token.length;a++){

            if(token[a].equals("String") || token[a].equals("int") || token[a].equals("double")
                    || token[a].equals("char")){
                System.out.print("<datatype>");
            }

            else if(token[a].equals("+") || token[a].equals("-") || token[a].equals("/") || token[a].equals("*")
                    || token[a].equals("=")){
                System.out.print("<assignment_operator>");
            }

            else if(token[a].equals(";")){
                System.out.print("<delimiter>");
            }

            else if(token[a].contains("\"") || token[a].contains("\'") && token[a].endsWith(";")
                    || token[a].contains(".") && token[a].endsWith(";") || token[a].contains("0") && token[a].endsWith(";")
                    || token[a].contains("1") && token[a].endsWith(";") || token[a].contains("2") && token[a].endsWith(";")
                    || token[a].contains("3") && token[a].endsWith(";") || token[a].contains("4") && token[a].endsWith(";")
                    || token[a].contains("5") && token[a].endsWith(";") || token[a].contains("6") && token[a].endsWith(";")
                    || token[a].contains("7") && token[a].endsWith(";") || token[a].contains("8") && token[a].endsWith(";")
                    || token[a].contains("9") && token[a].endsWith(";") ){
                System.out.print("<value><delimiter>");
                break;
            }

            else if(token[a].endsWith(";") && !token.equals("String") && !token.equals("int")
                    && !token.equals("double") && !token.equals("char") && !token.equals("+")
                    && !token.equals("-") && !token.equals("*") && !token.equals("/")
                    && !token.equals("=")){
                System.out.print("<identifier><delimiter>");
            }

            else if(token[a].contains("\'") || token[a].contains(".") || token[a].contains("0")  || token[a].contains("1")
                    || token[a].contains("2") || token[a].contains("3") || token[a].contains("4") || token[a].contains("5")
                    || token[a].contains("6") || token[a].contains("7") || token[a].contains("8") || token[a].contains("9")){
                System.out.print("<value>");
            }

            else if(!token.equals("String") && !token.equals("int") && !token.equals("double")
                    && !token.equals("char") && !token.equals("+") && !token.equals("-") && !token.equals("*")
                    && !token.equals("/") && !token.equals("=")){
                System.out.print("<identifier>");
            }
        }
    }
}
