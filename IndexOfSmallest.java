import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        while(true) {
        int number=scanner.nextInt();
        if (number==9999) {
            break;
        } list.add(number);
        } System.out.println("");
        // implement here a program that reads user input
        // until the user enters 9999
        
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times
        int size =list.size();
        if (size==1) {
            System.out.println("Smallest number: "+list.get(0));
        }
        if (size>1) {
        int count = 0;
        int next =1 ;
        int start=1;
        int i = 0;
        int times=0;
        while (true) {
          int a = list.get(count);
          int b = list.get(next);
          if (a<=b) {
              count = count-1;
               
          } 
          
          if (a>b) {
              count=next;
              count = count -1;
              i = i+1;
          }  
                       count = count + 1;
            next = next + 1;
            start = start + 1;
            a = list.get(count);
            if (size == start) {
                System.out.println("Smallest number: " + a);
              

            break;
        }
            } int zeta = list.get(count);
            int j = 0;
            while (true) {
                int b = list.get(j);
                if (zeta == b) {
                    System.out.println("Found at index: " + j);
                }
                j++;
                if (size == j) {
                    break;
                }
            }
        }
        
    }
}

    

