 public int solve(char[] A) {
		for(char x: A){
        if( x < '0' || (x> '9'&& x < 'A')|| (x > 'Z' && x < 'a') || x > 'z' ){
				  return 0;
		    }
    }

    return 1;
}