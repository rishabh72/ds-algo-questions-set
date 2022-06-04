public static char[] to_lower(char[] A) {
		for(int i=0;i<A.length;i++){
            if(A[i] >= 'A' && A[i] <= 'Z'){
				        int num = A[i] + ('a'-'A');
				        A[i] = (char) num;
			      }
		}
    return A;
}