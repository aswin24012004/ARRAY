 class twosum {
    public static int[] sumOfTwo(int[] a,int target){
        for (int i = 0; i < a.length;i++) {
            for (int j = i+1; j < a.length; j++) {
                if (a[i]+a[j] == target) {
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }
    public static void main(String[] args) {
        int[] a = {2,7,11,15,6,3};
        int target = 10;
        int[] result = sumOfTwo(a,target);
        if(result != null){                                                      
            System.out.println(result[0]+" index and "+result[1]+" index");             //OUTPUT
        }                                                                //        1 index and 5 index
        else{
            System.out.println("The Solution is Not Found!");
        }
    }    
}
