public int solve(String A) {
		int n = A.length();
		int c = 0;
		for(int i=0;i< n ;i++){
			if(A.charAt(i) == 'b' && (i+1 < n && A.charAt(i+1) == 'o') && (i+2 < n && A.charAt(i+2) == 'b' )){
              c++;
			}
		}
    return c;
}