import java.util.Scanner;

public class Tokenizer {

    public static void main (String args[]){

        //take input from user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Source Language: ");
        String input = sc.nextLine();

        //put input into an array
        String token[] = new String[]{};
        token = input.split(" ");

        //lexemes for tokens
        String datatype[]={"int","double","char","String"};
        String value[]={"\"", "\'", ".","1","2","3","4","5","6","7","8","9","0"};

        for(int a=0;a<token.length;a++){

            for(int b=0;b<datatype.length;b++){
                if(token[a].equals(datatype[b])){
                    System.out.print("<datatype>");
                    break;
                }
            }

            for(int b=0;b<value.length;b++){
                if(token[a].contains(value[b])){
                    System.out.print("<value>");
                    break;
                }
            }

            if(!token[a].equals("String") && !token[a].equals("int") && !token[a].equals("double")
                    && !token[a].equals("char") && !token[a].contains("0")  && !token[a].contains("1")
                    && !token[a].contains("2") && !token[a].contains("3") && !token[a].contains("4")
                    && !token[a].contains("5") && !token[a].contains("6") && !token[a].contains("7")
                    && !token[a].contains("8") && !token[a].contains("9") && !token[a].contains("\"")
                    && !token[a].contains("\'") && !token[a].equals(";") && !token[a].equals("=")){
                System.out.print("<identifier>");
            }

            if(token[a].equals("=")){
                System.out.print("<assignment operator>");
            }

            if(token[a].endsWith(";")){
                System.out.print("<delimiter>");
            }

        }
    }
}