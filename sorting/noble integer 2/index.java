// A = [-10 1 1 2 4 4 4 8 10]
// sort array in ascending order
// count
// c = [ 0 1 1 3 4 4 4 7 8 ]


public static int countNobleIntegers(int[] A){
  int n = A.length;
  int ans = 0;
  int c = 0
  if(A[0] == 0){
    ans = 1;
  }
  for(int i=1;i<n;i++){
    if(A[i] != A[i-1]){
      c = i;
    }
    if(A[i] == c){
      ans++;
    }

  }
  return ans;
}