public int solve(String A) {
    int n = A.length();
		int c =0 ;
		long ans = 0;
		for(int i=n-1;i>=0;i--){
			char x = A.charAt(i);
			if((x >= 'A' && x <= 'Z') || (x >= 'a' && x <= 'z')){
		      c++;
			}

		  if(x == 'A' || x == 'E' || x =='I'|| x == 'O' || x == 'U' || x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u'){
			   ans += c;
		  }

		}
   return ans;
}