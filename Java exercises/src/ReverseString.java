import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        char[] chars = input.toCharArray();
        for (int i = chars.length-1; i >=0 ; i--) {
            System.out.print(chars[i]);
        }
    }
}
