public static char[] to_upper(char[] A) {
    for(int i=0;i<A.length;i++){
        if(A[i] >= 'a' && A[i] <= 'z'){
				  int num = A[i] - ('a'-'A');
				  A[i] = (char) num;
			  }
		}
    return A;
}