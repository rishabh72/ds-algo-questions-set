 public int singleNumber(int[] nums) {
   int ans = 0;
	 for(int i=0;i< 32;i++){
		 int setbits = 0;
		  for(int j=0;j< nums.length;j++){
			  if( ((nums[j]>>i)& 1) == 1 ){
			  	setbits++;
			  }
		  }
		  if(setbits%3 == 1){
			  ans += (1<<i);
		  }
	 }
   return ans;
}