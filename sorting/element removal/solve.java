public static int solve(int[] A) {
    Integer[] Arr = new Integer[A.length];
    for (int i=0;i<A.length;i++){
        Arr[i] = Integer.valueOf(A[i]);
    }
    Arrays.sort(Arr,Collections.reverseOrder());
    int cost = 0;
    for(int i=0;i<A.length;i++){
        cost += Arr[i]*(i+1);
    }
    return cost;
}