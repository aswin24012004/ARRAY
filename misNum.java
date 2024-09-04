 class misNum {
  
    public static int arryMissing(int[] a,int n){
        int sum = 0;
        int totalSum = n*(n+1)/2;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return totalSum-sum;   
    }
    public static void main(String[] args) {
     int[] a = {1,2,3,5};
     int n = 5;                                                                  //OUTPUT
     System.out.println("The Missing Element is "+arryMissing(a,n));     //  The Missing Element is 4
    }
}
