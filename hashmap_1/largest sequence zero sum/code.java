public int[] lszero(int[] A) {   
   // created hash map   	 
	 HashMap<Integer,Integer> hm = new HashMap<>();
	 
	 int sum = 0;
	 int n = A.length;
	 int s = -1;
	 int e = -1;
	 
   //for handling sum 0 from index 0 
	 hm.put(0,-1);
	 
	for(int i=0;i< n;i++){
			sum += A[i];
			if(hm.containsKey(sum)){
					int startPoint = hm.get(sum);
					int endPoint = i;
					int cur_len = s<0 && e<0? 0: (e-s+1);
					int new_len = endPoint-startPoint+1;
					if(new_len> cur_len){
						e = endPoint;
						s =startPoint;
					}
					
			}
			if(!hm.containsKey(sum)){
					hm.put(sum, i);
			}
			
		}
		if(s< 0 && e<0){
			int[] result = new int[0];
			return result;
		}
		int s_pt = s+1;
		int e_pt = e;
		
		int[] result = new int[e_pt-s_pt+1];
		int id = 0;
		for(int i=s_pt;i<=e_pt;i++){
			result[id] = A[i];
			id++;
		}
		return result;
}