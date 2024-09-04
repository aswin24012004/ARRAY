package arrayleaders;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author aswin
 */
public class ArrayLeaders {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] ar = {"new list "};
        int n = ar.length;
        ArrayList<Integer>list = new ArrayList<>();
        int max = -1;
        System.out.println(max);
        for(int i=n-1;i>=0;i--){
            if(ar[i]>=max){
                max=ar[i];
                list.add(ar[i]);
                System.out.println("max value "+max);
            }
        }
        System.out.println("old list "+list);
        Collections.reverse(list);
        System.out.println("new list "+list);
    }
    
}
