public int solve(int[] A) {
  HashMap<Integer, Integer> frq = new HashMap<Integer,Integer>();

  for (int x: A){
      if(frq.containsKey(x)){
        frq.put(x, frq.get(x)+1);
      }else{
        frq.put(x, 1);
      }
  }

  for (int x: A){
      if(frq.get(x) > 1){
        return x;
      }
  }
  return -1;
}