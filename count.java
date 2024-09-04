
public class count {
    public static int counts(int[] a,int target){
        int count = 0;
        for (int index = 0; index < a.length; index++) {
            if(a[index]==target) count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int value = 2;
        int[] a = {5,2,6,2,4,3,2};                         //The Value 2 is 3 times Occurred.
        System.out.println("The Value "+value+" is "+counts(a,value)+" times Occurred.");
    }
}