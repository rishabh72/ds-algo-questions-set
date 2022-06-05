public String solve(String A) {
		StringBuilder sb = new StringBuilder("");

		int n = A.length();
		for(int i=0;i< n;i++){

			char x = A.charAt(i);
			if(x < 'A' || x > 'Z'){
			   if(x == 'a' || x == 'e' || x == 'i' || x == 'o'|| x == 'u'){
				   sb.append('#');
			   }else{
            sb.append(x);

			   }
			}
			
		}
		
		String res = sb.toString()+sb.toString();
    return res;

}