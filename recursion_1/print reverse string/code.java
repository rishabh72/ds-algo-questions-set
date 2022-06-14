public static void main(String[] args) {
   
  Scanner sc = new Scanner(System.in);
  String s = sc.next();
  reverse(s,0);   
}
public static void reverse(String s,int k){
  if( k == s.length() ){
    return;
  }
  reverse(s,k+1);
  System.out.print(s.charAt(k));
}