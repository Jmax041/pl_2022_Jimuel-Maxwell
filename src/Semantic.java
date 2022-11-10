import java.util.Scanner;

public class Semantic {

    public static void main(String[] args){

        //take input from user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Expression: ");
        String input = sc.nextLine();

        //put input into an array
        String[] token;
        token = input.split(" ");

        //values needed
        String[] datatype = {"String","int","char","double"};
        String[] nums = {"1","2","3","4","5","6","7","8","9","0"};
        String[] chars = {"a","b","c","d","e","f","g","h","i","j","k","l",
                "m","n", "o","p","q","r","s","t","u","v","w","q","y","z"};

        //if input expression does not contain value
        if(token.length < 4){
            for (String s : datatype) {
                if (token[0].equals(s)) {
                    if (!token[1].contains("\"") && !token[1].contains("'") && token[1].endsWith(";")) {
                        System.out.print("Semantically Correct!");
                        System.exit(0);
                    }
                }
            }
            System.out.print("Semantically Incorrect!");
            System.exit(0);
        }

        //if input expression contains value
        else {

            //if input expression has a datatype of int
            if(token[0].equals("int")) {
                for (int a = 0; a < 10; a++) {
                    if (!token[3].contains(".") && token[3].contains(nums[a])) {
                        if (token[3].endsWith(";")) {
                            System.out.print("Semantically Correct!");
                            System.exit(0);
                        } else {
                            System.out.print("Semantically Incorrect!");
                            System.exit(0);
                        }
                    }
                }
                System.out.print("Semantically Incorrect!");
                System.exit(0);
            }

            //if input expression has a datatype of double
            else if(token[0].equals("double")) {
                for (int a = 0; a < 10; a++) {
                    if (token[3].contains(".") && token[3].contains(nums[a])) {
                        if (token[3].endsWith(";")) {
                            System.out.print("Semantically Correct!");
                            System.exit(0);
                        } else {
                            System.out.print("Semantically Incorrect!");
                            System.exit(0);
                        }
                    }
                }
                System.out.print("Semantically Incorrect!");
                System.exit(0);
            }

            //if input expression has a datatype of char
            else if(token[0].equals("char")){
                for (int a = 0; a < 26; a++) {
                    if (token[3].contains("'" + chars[a] +"'")) {
                        if (token[3].endsWith(";")) {
                            System.out.print("Semantically Correct!");
                            System.exit(0);
                        } else {
                            System.out.print("Semantically Incorrect!");
                            System.exit(0);
                        }
                    }
                }
                System.out.print("Semantically Incorrect!");
                System.exit(0);
            }

            //if input expression has a datatype of String
            else if(token[0].equals("String")){

                String stholder = "";
                for (String s : token) {
                    stholder += s;
                }

                if(token[3].startsWith("\"")){
                    if (stholder.endsWith("\";")) {
                        System.out.print("Semantically Correct!");
                        System.exit(0);
                    } else {
                        System.out.print("Semantically Incorrect!");
                        System.exit(0);
                    }
                }
                System.out.print("Semantically Incorrect!");
                System.exit(0);
            }

            //if input expression has NO datatype
            else{
                System.out.print("Semantically Incorrect!");
                System.exit(0);
            }
        }
    }
}
