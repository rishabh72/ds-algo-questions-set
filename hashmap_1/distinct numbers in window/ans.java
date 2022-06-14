public int[] dNums(int[] A, int B) {
       
  int n = A.length;
  int[] res = new int[n-B+1];


  if(B > n){
    int[] r = new int[0];
    return  r;
  }
 
  HashMap<Integer,Integer> hm = new HashMap<>();
  int x = 1;

  for (int i=0; i< B;i++){
    if(hm.containsKey(A[i])){
        hm.put(A[i],hm.get(A[i])+1);
    }else{
        hm.put(A[i],1);
    }
  }

  res[0] = hm.size();


  int i =1;
  int j = B;

  while (j < n){
    int prev = A[i-1];
    hm.put( prev, hm.get(prev) -1);
    if(hm.get(prev) == 0){
        hm.remove(prev);
    }
    int addition = A[j];
    if(hm.containsKey(addition)){
        hm.put(addition, hm.get(addition)+1);
    }else {
        hm.put(addition, 1);
    }
    res[x] = hm.size();
         

    x++;
    i++;
    j++;
  }
  return res;
}