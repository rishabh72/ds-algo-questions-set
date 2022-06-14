public int[] solve(int[] A, int B) {
  HashMap<Long,Integer> hm = new HashMap<>();
  int n = A.length;
  long sum = 0;
  int s = -1;
  int e = -1;
  Long zero = new Long(0);
  hm.put(zero, -1);
  for(int i=0;i< n;i++){
    sum += A[i];
    long val = sum - B;
    
    if(hm.containsKey(val) ){
      s = hm.get(val)+1;
      e = i;
      break;
    }else{
      hm.put(sum, i);
    }
  }
  if(s < 0 || e < 0){
    int[] ans = new int[1];
    ans[0] = -1;
    return ans;
  }

  int[] ans = new int[e-s+1];
  int id = 0;
  for(int i=s;i<=e;i++){
    ans[id] = A[i];
    id++;
  }
  return ans;
}