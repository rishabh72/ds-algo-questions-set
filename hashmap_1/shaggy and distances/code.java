public int solve(int[] A) {
  HashMap<Integer, List<Integer>> af = new HashMap<>();

  for (int i=0;i< A.length;i++){
      if(af.containsKey(A[i])){
          List<Integer> el = af.get(A[i]);
          el.add(i);
          af.put(A[i],el);
      }else {
          List<Integer> al = new ArrayList<>();
          al.add(i);
          af.put(A[i], al );
      }
  }

  HashSet<Integer> as = new HashSet<>();

  for (int x: A){
      as.add(x);
  }


      
  int ans = Integer.MAX_VALUE;

  for (int x: as){
      List<Integer> value = af.get(x);
      if(value.size() >= 2){
          int diff = value.get(0) - value.get(1);
          int ab_diff = Math.abs(diff);
          ans = Math.min(ab_diff,ans);
      }


  }
  if(ans == Integer.MAX_VALUE){
      ans = -1;
  }
  return ans;
}