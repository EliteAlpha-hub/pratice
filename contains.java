import java.util.Scanner;
public class contains {
    



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String word = scanner.nextLine();
            String[] array= word.split(" ");
            int i=0;
            for(i=0;i<array.length;i++) {
                if (array[i].contains("av")) {
                    System.out.println(array[i]);
                }
            }
            if (word.equals("")) {
                break;
            }
        }


    }


}
