public class christmassTree {

    public static void printStars(int number) {
        // part 1 of the exercise
        int i = 1;
        while (true) {
            System.out.print("*");
            i = i + 1;
            if (i > number) {
                System.out.println("");
                break;
            }

        }
    }

    public static void printSpaces(int number) {
        int i = 1;
        while (true) {
            System.out.print(" ");
            i = i + 1;
            if (i > number) {
                break;
            }

        }
        // part 1 of the exercise
    }

    public static void printTriangle(int size) {
        int count = size;

        int j = 1;
        while (true) {
            printSpaces(count);
            int k = 1;
            while (true) {

                if (k > j) {
                    System.out.println("");
                    break;
                }

                System.out.print("*");
                k = k + 1;
            }
            count = count - 1;
            j = j + 1;
            if (count <= 0 || j > size) {
                break;
            }
        }

    }

    //while1 termination
    // part 2 of the exercise
    public static void christmasTree(int height) {
        int count = height;
        int i = 0;
        while (true) {
            printSpaces(count);
            int j = 1;
            int k = (2 * i) + 1;
            while (true) {

                if (j > k) {
                    System.out.println("");
                    break;
                }
                System.out.print("*");
                j = j + 1;
            }
            count = count - 1;
            i = i + 1;
            if (count == 0 || i == height) {
                break;
            }
        }
        int m = 1;
        while (true) {
            printSpaces(height - 1);
            int l = 1;
            while (true) {

                System.out.print("*");
                l = l + 1;
                if (l > 3) {
                    System.out.println("");
                    break;
                }
            }
            m = m + 1;
            if (m > 2) {
                break;
            }
        }
        // part 3 of the exercise
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }


    
}
