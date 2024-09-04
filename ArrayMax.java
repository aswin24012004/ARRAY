package arraymax;
/**
 *
 * @author aswin
 */
public class ArrayMax {
    public static int findMax(int[] a){
        int n = a.length;
        int max = a[0];
        for(int i=1;i<n;i++){
            if(max<a[i]){
                max = a[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        // TODO code application logic 
        int a[] ={4,8,6,5,6,4};
        System.out.println(findMax(a));   //output 8
    }
    
}
