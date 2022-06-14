public int solve(int[] A) {

  long[] P = new long[A.length];

  P[0] = A[0];
  for(int i=1;i< A.length;i++){
      P[i] =(long) (A[i]+P[i-1]);
  }
  HashMap<Long,Long> hm = new HashMap<>();
  for(long x: P){
      long val = 1;
      if(hm.containsKey(x)){
            val = hm.get(x)+1;
          hm.put(x,val);
      }else{
          hm.put(x,val);
      }
  }
  Long zero = new Long(0);
  if(hm.containsKey(zero)){
      return 1;
  }

  HashSet<Long> hs = new HashSet<>();

  for(long x: P){
  hs.add(x);
  }

  if(hs.size() < P.length ){
      return 1;
  }
  return 0;
}