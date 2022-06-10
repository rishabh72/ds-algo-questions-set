public int[] solve(int[] A, int[] B) {
  HashMap<Integer,Integer> fb = new HashMap<Integer,Integer>();

  ArrayList<Integer> res = new ArrayList<>(Math.min(A.length,B.length));


  for (int x: B){
    if(fb.containsKey(x)){
        fb.put(x,fb.get(x)+1);
    }else{
        fb.put(x,1);
    }
  }

  for (int x: A){
    if(fb.containsKey(x) && fb.get(x) > 0){
      res.add(x);
      fb.put(x, fb.get(x)-1);
    }
  }
  int[] ans = new int[res.size()];
  for (int i=0;i< res.size();i++){
      ans[i] = res.get(i);
  }
  return ans;
}