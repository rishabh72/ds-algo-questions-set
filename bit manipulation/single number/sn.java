 public int singleNumber(final int[] A) {
    int res = 0;
    for(int x: A){
        res = res^x;
    }
    return res;
}