class  MyComparator implements  Comparator<Integer>{
    public int compare(Integer a, Integer b){
      String str_a = String.valueOf(a);
      String str_b = String.valueOf(b);
      long n1 = Long.parseLong(str_a+str_b);
      long n2 = Long.parseLong(str_b+str_a);

      if(n1 > n2){
            return -1;
      }else if(n2> n1){
             return 1;
      }


      return 0;
    }
}

public String largestNumber(final int[] A) {
    int n = A.length;
    Integer[] Arr = new Integer[n];
    boolean allzeros = true;
    for(int i=0;i< n;i++){
        if(A[i] != 0){
            allzeros = false;
        }
        Arr[i] = Integer.valueOf(A[i]);
    }
    if(allzeros){
        return "0";
    }
    MyComparator c = new MyComparator();
    Arrays.sort(Arr,c);
    String res = "";
    for (int x: Arr){
        res += x;
    }
    
    return res;
        
}