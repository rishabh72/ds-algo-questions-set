public int[] twoSum(final int[] A, int B) {
    int n= A.length;	  
	  int s = -1;
	  int e = -1;
	  
	  HashMap<Integer,Integer> hm = new HashMap<>();
	  
	  for(int i=0;i<n;i++){
		  int num = B-A[i];
		  if(hm.containsKey(num)){
			int[] res = new int[2];
			 
			 res[0]= hm.get(num)+1;
			 res[1] = i+1;
			 return res;

		 }
		 if(!hm.containsKey(A[i])){
			hm.put(A[i],i);

		 }
		  
	  }
	   
	  int[] res = new int[0];
	  return res;
}