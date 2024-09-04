import java.util.Arrays;

class secbig {
    public static int secondLargestNum(int[] a){
        int n = a.length;
        Arrays.sort(a);
        return a[n-2];

    }
public static void main(String[] args) {
    int[] a = {1,8,6,4,5,9,3};                     //output ==>  Second Largest Element is 8
    System.out.println("Second Largest Element is "+secondLargestNum(a));
}    
}
