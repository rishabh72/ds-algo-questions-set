public int isValidSudoku(final String[] A) {
    for (int i=0;i< A.length;i++){
      HashMap<Character,Integer> r_hm = new HashMap<>();
      for (int j=0;j< A[0].length();j++){
          char c = A[i].charAt(j);
          if(c == '.'){
              continue;
          }
          if(r_hm.containsKey(c)){
              return 0;

          }else {
              r_hm.put(c, j);
          }
      }
    }

    for (int j=0;j< A[0].length();j++){
        HashMap<Character,Integer> c_hm = new HashMap<>();
        for (int i=0;i< A.length;i++){
            char c = A[i].charAt(j);
            if(c == '.'){
                continue;
            }
            if(c_hm.containsKey(c)){
                return 0;

            }else {
                c_hm.put(c, j);
            }
        }
    }
    for(int i=0;i<A.length;i=i+3){
        for(int j=0;j<A[0].length();j=j+3){
            int code =  checkGrid(A,i,j);
            if(code == 0){
                return 0;
            }

        }
    }

    return 1;
}

public static int checkGrid(String[] A,int r,int c){
  HashMap<Character,Integer> hm = new HashMap<>();

  for(int i=r;i< r+3;i++){
      for(int j=c;j< c+3;j++){
          char z = A[i].charAt(j);
          if(z == '.'){
              continue;
          }
          if(hm.containsKey(z)){
              return 0;
          }else{
              hm.put(z,1);
          }

      }
  }
  return 1;
}