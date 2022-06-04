 public static void main(String args[]) {
        // Your code goes here

    String s = "scaler";
    solve(s);


  }

  public static String solve(String A) {
      StringBuilder sb = new StringBuilder(A);
      int N = A.length();
      int l=0;
      int r = N-1;
      while(l<r){
          char ele = sb.charAt(l);
          sb.setCharAt(l, sb.charAt(r));
          sb.setCharAt(r, ele);

      }
      // System.out.println(sb);
      return sb.toString();
  }
