import java.util.Scanner;

public class demo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Give a number:");
            int number = scanner.nextInt();

            if (number < 0) {
                System.out.println("Unsuitable number");
                continue;
            } else if (number == 0) {
                break;
            } int total = 1;

                int times = 1;
            while (true) {
               

                if (times >= number+1) {
                    break;
                }

                total = total * 2;
                times = times + 1;
               

            } System.out.println("2^"+number+" = "+total);
             
            

        }
    }
}    

