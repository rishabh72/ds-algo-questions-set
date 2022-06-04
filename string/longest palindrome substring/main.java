
class Main{
  public static void main(String args[]){
      String s = "madam";
      System.out.print(lps(s));
      
  }

  public static String lps(String s){
    int max = 1;
    int start = 0;
    int end = 1;
    for (int i=0;i< s.length();i++){
         int p1 = i; int p2 = i;
         int[] result = solve(s,p1,p2);
         if(result[0] > max ){
             max = result[0];
             start = result[1]+1;
             end = result[2];
         }

         p1=i;
         p2=i+1;
         result = solve(s,p1,p2);
         if(result[0] > max){
             max = result[0];
             start = result[1]+1;
             end = result[2];
         }

    }
    return s.substring(start,end);

  }


  public static int[] solve(String  s, int p1, int p2){

    while (p1>=0 && p2< s.length() &&  s.charAt(p1) == s.charAt(p2)){
              p1 = p1-1;
              p2 = p2+1;
    }
  
    int len = p2-p1-1;
    int[] res = {len,p1,p2};
    return res;
  
  }

}
