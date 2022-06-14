public int getSum(int A, int B, int[] C) {

  HashMap<Integer,Integer> hm = new HashMap<>();
  HashSet<Integer> hs = new HashSet<>();
  for(int x:C){
    hs.add(x);
      if(hm.containsKey(x)){
      hm.put(x, hm.get(x)+1);
    }else{
      hm.put(x,1);
    }
  }
	 
	int sum = 0;
  boolean found = false;
	for(int x: hs){
		 int frq = hm.get(x);
		 if(frq == B){
       found = true;
			 sum += x;
		 }
	}
  if(!found){
    return -1;
  }
     
  return sum;
}