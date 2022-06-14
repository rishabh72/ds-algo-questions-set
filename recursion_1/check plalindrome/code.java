public int solve(String A) {
  return check(A,0,A.length()-1);     
}

public static int check(String s,int i,int j){
  if(i > j){
      return 1;
  }
  if(s.charAt(i) == s.charAt(j)){
      return check(s, i+1, j-1); 
  }else{
      return 0;
  }
}