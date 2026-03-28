 import java.util.Scanner;
import java.util.ArrayList;
public class iDidTheImpossible {
   


     public static void main(String[] args) {
         Scanner scanner= new Scanner(System.in);
         ArrayList<String>allparts= new ArrayList<>();
         String[] parts= null;
         int count = 0;
        while(true) {
            String personal= scanner.nextLine();
                if(personal.equals("")) {
                    break;
                }  parts=personal.split(",");
                count++;
                for (int i=0;i<parts.length;i++) {
                    String next=parts[i];
                    allparts.add(next);
                }
        } System.out.println(allparts.size());
        int i = 1;
        int j ;
        
        int n;
        int size = (allparts.size()/2)+1;
           
           ;
           for (n=1;n<size;n++) {
               j=(2*n)-1;
           if (Integer.valueOf(allparts.get(i))<=Integer.valueOf(allparts.get(j))) {
               i=j;
           }
        
        
    } System.out.println("Age of the oldest: "+allparts.get(i));
    }

    
}
