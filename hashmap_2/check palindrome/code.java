public int solve(String A) {
  HashMap<Character,Integer> hm = new HashMap<>();
  HashSet<Character> hs = new HashSet<>();
  int odd =0;
  for(int i=0;i< A.length();i++){
        char c = A.charAt(i);
      hs.add(c);
      if(hm.containsKey(c)){
        hm.put(c,hm.get(c)+1);
      }else{
        hm.put(c,1);
      }
  }
  for(char c: hs ){
    int count = hm.get(c);
    if(count%2 == 1){
      odd++;
    }
  }
  if(A.length() % 2 == 0 && odd == 0){
    return 1;
  }
  if(A.length() % 2 == 1 && odd == 1){
    return 1;
  }
	  
	  
	return 0;
}