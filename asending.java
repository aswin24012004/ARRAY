 class asending {
    public static String check(int[] a){
        int n = a.length;
        for (int i = 0; i < n-1; i++) {
            if(a[i]>a[i+1]) return "Not";
        }
        return "the";
    }
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};                //The Array is the Asending Order
        System.out.println("The Array is "+check(a)+" Asending Order");
    }
}
