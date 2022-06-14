public int[] productExceptSelf(int[] nums) {
    int n= nums.length;
	  int[] L = new int[n];
	  int[] R = new int[n];
	  L[0] = nums[0];
	  for(int i=1;i<n;i++){
		  L[i] = L[i-1]*nums[i];
	  }
	  R[n-1] = nums[n-1];
	  for(int i=n-2;i>=0;i--){
		  R[i] = R[i+1]*nums[i];
	  }
	  int[] res = new int[n];
	  for(int i=0;i<n;i++){
		  if(i==0){
			  res[i] = R[i+1];
		  }else if(i==n-1){
			  res[i] = L[i-1];
		  }else{
			  res[i] = L[i-1]*R[i+1];
		  }
	  }
    return res;
}