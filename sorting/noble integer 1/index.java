// A: [1 -5  3  5  -10  4]
//sort array in ascending order
// A : [-10 -5  1  3  4  5  10]
// count of elements less than A[i]
// count : [ 0   1  2  3  4  5  6]

public static int countNobleIntegers(int[] A){
    int n = A.length;
    Arrays.sort();
    int c = 0;
    for(int i=0;i<n;i++){
      if(A[i] == i){
        count++;
      }
    }
    return c;
}
