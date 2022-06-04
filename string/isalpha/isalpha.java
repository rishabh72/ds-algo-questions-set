public int solve(char[] A) {
    for(char x: A){
        if(x < 'A' || x > 'z' || (x > 'Z' && x < 'a') ){
            return 0;
        }
    }
    return 1;
}