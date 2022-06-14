public int[] singleNumber(int[] nums) {
   int val = 0;
	 for(int x: nums){
		 val = val^x;
	  }
	 int rsb = -1;
	 
	 for(int i=0;i<32;i++){
		 if( ((val>>i)&1) == 1 ){
			 rsb = i;
			 break;
		 }
	 }
	 int n1 = 0;
	 int n2 = 0;
	 for(int x:nums){
		 if(((x>>rsb)&1)== 1 ){
			 n1 = n1^x;
		 }else{
			 n2 = n2^x;
		 }
	 }
   int[] res = {n1,n2};
   return res;
}