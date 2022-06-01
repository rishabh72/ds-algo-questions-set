// A = [3,2,1,3]
// sort in descending way
// sorted array = [3 3 2 1]
// count elements greater than A[i]
// count = [0 0 2 3]

 public static int checkNobleIntegers(int[] A){
        int n = A.length;
        Integer[] Arr = new Integer[n];
        for(int i=0;i< n;i++){
            Arr[i] = Integer.valueOf(A[i]);
        }
        Arrays.sort(Arr,Collections.reverseOrder());

        int c = 0;

        if(Arr[0] == 0){
            return 1;
        }


        for(int i=1;i< n;i++){

            if(Arr[i] != Arr[i-1]){
                c= i;
            }
            if(c == Arr[i]){
                return 1;
            }

        }
        return -1;
}