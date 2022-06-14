public int solve(int[] A, int B) {
  int c = 0;
  HashMap<Integer,Integer> hm = new HashMap<>();
  for(int i=0;i< A.length;i++){
      int val = A[i]^B;
      if(hm.containsKey(val)){
          c++;
      }else{
          hm.put(A[i],i);
      }
  }
  return c;
}