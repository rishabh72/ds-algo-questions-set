public int solve(String[] A, String B) {
    HashMap<Character, Integer> hm = new HashMap<>();
    for(int i=0;i< B.length();i++){
        hm.put(B.charAt(i),i);
    }
    for(int i=0;i< A.length-1;i++){
        String first = A[i];
        String second = A[i+1];
      
        if(first.length() > second.length()){
            return 0;
        }
        
        if(first.length() < second.length()){
            continue;
        }
        
        if(first.length() == second.length()){
            for(int j=0;j< first.length();j++){
              char char_first = first.charAt(j);
              char char_second = second.charAt(j);
              int val_first = hm.get(char_first);
              int val_second = hm.get(char_second);
              if(val_first > val_second){
                  return 0;
              }
              if(val_first < val_second){
                  break;
              }
            }
        } 
    }
    
    return 1;
}