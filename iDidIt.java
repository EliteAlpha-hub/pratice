
public class iDidIt {

    public static void main(String[] args) {

        //The tests are not checking the main, so you can modify it freely.
        //NB: If the tests don't seem to pass, you should try the methods here
        //in the main to make sure they print the correct shapes!
        printStars(5);
        printStars(3);
        printStars(9);
        System.out.println("\n---");  // printing --- between the shapes
        printSquare(4);
        System.out.println("\n---");
        printRectangle(5, 6);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");
    }

    public static void printStars(int number) {
        int i = 1;
        while (true) {
            System.out.print("*");
            i = i + 1;
            if (i > number) {
                System.out.println("");
                break;
            }

        }
        // first part of the exercise
    }

    public static void printSquare(int size) {
        int i = 1;
        while (true) {
            int j = 1;
            while (true) {
                System.out.print("*");
                j = j + 1;
                if (j > size) {
                    System.out.println(" ");
                    break;

                }

            }
            i = i + 1;
            if (i > size) {
                break;
            }
        }
        // second part of the exercise
    }

    public static void printRectangle(int width, int height) {
        int i = 1;
        while (true) {
            int j = 1;

            while (true) {
                System.out.print("*");
                j = j + 1;
                if (j > width) {
                    System.out.println(" ");
                    break;
                }

            }
            i = i + 1;
            if (i > height) {
                break;
            }
        }
        // third part of the exercise
    }

    public static void printTriangle(int size) {
        int i = 1;

        while (true) {

            int j = 1;

            while (true) {
                if (j > i) {
                    System.out.println(" ");
                    break;
                }
                System.out.print("*");

                j = j + 1;
            }
            if (i == size) {
                break;
            }
            i = i + 1;

        }

        // fourth part of the exercise
    }
}
