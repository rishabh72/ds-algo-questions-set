// A = [3,5,1]
// sort array = [1,3,5]
// then check difference between each is same or not

public static int solve(int[] A){
        int n = A.length;
        Arrays.sort(A);
        int d = A[1]-A[0];
        for(int i=2;i<n;i++){
            int cur_d = A[i]-A[i-1];
            if(cur_d != d){
                return 0;
            }

        }
        return 1;
}