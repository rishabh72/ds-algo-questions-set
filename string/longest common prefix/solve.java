public String longestCommonPrefix(String[] A) {
    int n = A.length;
    String ans = A[0];
    for (int i=1;i< n;i++){
       ans =  solve(ans, A[i]);
    }
    return ans;
}

public static String solve(String first, String second){
    char[] s1 = first.toCharArray();
    char[] s2 = second.toCharArray();
    int e = -1;
    int n =Math.min(s1.length,s2.length);
      for (int i=0;i< n;i++){
         if(s1[i] != s2[i]){
            break;
          }else {
            e = i;
          }
      }
    return first.substring(0,e+1);
}