package sumofarr;

/**
 *
 * @author aswin
 */
public class SumOfarr {
    
    public static int findArrSum(int[] a){
        int sum = 0;
        for(int i=0;i<a.length;i++){
            sum += a[i];
        }
        return sum;
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        int[] a = {1,3,4,2,5};                   //Sum of Elements :  15
        System.out.println("Sum of Elements : "+findArrSum(a));
    }
    
}
