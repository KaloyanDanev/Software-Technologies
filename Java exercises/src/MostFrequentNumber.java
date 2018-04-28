import java.util.Scanner;
public class MostFrequentNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        String[] inputToArray = input.split("\\s+");
        int inputSize = inputToArray.length;
        int[] integerArray = new int[inputSize];
        for(int i = 0; i < inputSize; i++)
        {
            integerArray[i] = Integer.parseInt(inputToArray[i]);
        }

        int count = 1;
        int bestCount = 0;
        int currentIndex = 0;
        for (int i = 0; i <integerArray.length; i++) {
            for (int j = 0; j <integerArray.length ; j++) {
                if (integerArray[i] == integerArray[j] && i != j){
                    count++;
                    if (count > bestCount){
                        bestCount = count;
                        currentIndex = i;
                    }
                }
            }
            count = 1;
        }
        System.out.println(integerArray[currentIndex]);
    }
}
