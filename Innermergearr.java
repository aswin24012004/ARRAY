import java.util.*;
public class Innermergearr {

    
};

class mergearr {
    public static void mergeOfArray(int[] a,int[] b){
        int n = a.length;
        int m = b.length;
        int[] ans = new int[n+m];
        HashSet<Integer>set = new HashSet<>(); 
        for (int i : a) {
            set.add(i);
        }
        for (int i : b) {
            set.add(i);
        }
        System.out.println(set);
      
        
    }
    public static void main(String[] args) {
        int[] a = {1,8,6,4,2};
        int[] b = {3,5,7,9,0};           // OUTPUT
        mergeOfArray(a,b);            //   [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
    } 
}
