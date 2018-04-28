import java.util.HashMap;
import java.util.Scanner;

public class Phonebook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String , String>phonebook = new HashMap<>();
        while (true){
            String input = scanner.nextLine();
           if (input.equals("END")) break;
           String[] inputArgs = input.split(" ");
           if (inputArgs[0].equals("A")){
               phonebook.put(inputArgs[1], inputArgs[2]);
           }
           else if (inputArgs[0].equals("S")){
               if (phonebook.containsKey(inputArgs[1])) {
                   System.out.println(inputArgs[1] + " -> " + phonebook.get(inputArgs[1]));
               }else {
                   System.out.println("Contact " + inputArgs[1] + " does not exist.");
               }
           }
        }
    }
}
