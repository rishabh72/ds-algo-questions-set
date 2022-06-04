public String solve(String A) {
    char[] Arr = A.toCharArray();
    reverse(Arr,0,Arr.length-1);
    int start = 0;
    int end = 0;
    for (int i=0;i< Arr.length;i++){
        if(Arr[i] == ' '){
             end = i-1;
            reverse(Arr,start,end);
            start = i+1;
        }
        if(i == Arr.length-1){
            end = i;
            reverse(Arr,start,end);

        }
    }
        
    return String.valueOf(Arr).trim();
}

public static void reverse(char[] c,int l,int r){
  while (l<r){
    char ele = c[l];
    c[l] = c[r];
    c[r] = ele;

    l += 1;
    r -= 1;
  }
}