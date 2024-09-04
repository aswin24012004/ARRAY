 class rotate {
    public static void rotateTheArray(int[] a,int k){
        int n = a.length;
        for (int i = 0; i < k; i++) {
            int temp = a[0];
            for (int j = 1; j < a.length; j++) {
                a[j-1] = a[j];
            }
            a[n-1] = temp;
        }
    }
public static void main(String[] args) {
    int[] a = {1,2,3,4,5};
    int k = 3;
    rotateTheArray(a,k);
    for (int i : a) {
        System.out.print(i+"  ");  //OUTPUT = 4  5  1  2  3 
    }
}    
}
