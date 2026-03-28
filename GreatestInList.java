import java.util.ArrayList;
import java.util.Scanner;

public class GreatestInList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }

        int size = list.size();
        if (size == 1) {
            System.out.println("The greatest number: " + list.get(0));
        } else if (size >= 1) {
            int count = 0;
            int next = 1;
            int start = 1;
            while (true) {
                int a = list.get(count);
                int b = list.get(next);
                if (a > b) {
                    count = count - 1;
                }
                if (b > a) {
                    count = next;
                    count = count - 1;

                }
                next = next + 1;
                count = count + 1;
                start = start + 1;
                a = list.get(count);
                if (start == size) {
                    System.out.println("The greatest number: " + a);
                    break;
                }

            }
        }
        // implement finding the greatest number in the list here
    }
}
