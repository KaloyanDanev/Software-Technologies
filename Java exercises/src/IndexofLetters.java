import java.util.Scanner;

public class IndexofLetters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char[] englishLetters =
                {
                        'a','b','c','d','e','f','g','h','i','j',
                        'k','l','m','n','o','p','q','r','s','t',
                        'u','v','w','x','y','z'
                };
        char[] lettersArray = scan.nextLine().toLowerCase().toCharArray();
        for (int i = 0; i <lettersArray.length; i++) {
            for (int j = 0; j <englishLetters.length; j++) {
                if (lettersArray[i] == englishLetters[j]){
                    System.out.println(lettersArray[i] + " -> "+ j);
                }
            }
        }
    }
}
