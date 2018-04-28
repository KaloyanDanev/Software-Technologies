import java.util.ArrayList;
import java.util.Scanner;

public class BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> integers = new ArrayList<>();
        String s = scanner.nextLine();
        String[] sArr = s.split(" ");
        for (String s1 : sArr) {
            integers.add(Integer.parseInt(s1));
        }
        s = scanner.nextLine();
        sArr = s.split(" ");
        int bomb = Integer.parseInt(sArr[0]);
        int power = Integer.parseInt(sArr[1]);
        int sum = 0;
        while (integers.contains(bomb)) {
            int indexOfBomb = integers.indexOf(bomb);
            int firstIndex = indexOfBomb - power;
            if (firstIndex < 0) firstIndex = 0;
            int lastIndex = indexOfBomb + power;
            if (lastIndex > integers.size() - 1) lastIndex = integers.size() - 1;
            for (int i = 0; i <= lastIndex - firstIndex; i++) {
                integers.remove(firstIndex);
            }
        }
        for ( Integer integer : integers) {
            sum += integer;
        }
        System.out.println(sum);
    }
}
