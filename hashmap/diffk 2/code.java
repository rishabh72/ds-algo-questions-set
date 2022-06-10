public int diffPossible(final int[] A, int B) {
    int n = A.length;

    HashMap<Integer,Integer> hm = new HashMap<>();

    for (int x:A){
        if(hm.containsKey(x)){
            hm.put(x, hm.get(x)+1);
        }else{
            hm.put(x,1);
        }
    }

    for (int x: A){
        int val = x+B;
        if(x == val && hm.get(x) >= 2){
            return 1;
        }else if( x != val && hm.containsKey(val)){
          return 1;
        }
    }
    return 0;
}