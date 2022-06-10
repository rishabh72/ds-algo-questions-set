public int repeatedNumber(final List<Integer> a) {
    int e1 = 0;
    int e2 = 0;
    int f1 = 0;
    int f2 = 0;
		int n = a.size();

    for (int x: a){
        if (x == e1) {
            f1++;
        }else if(x == e2){
            f2++;
        }else if(f1 == 0){
            e1 = x;
            f1 =1;
        }else if(f2 == 0 ){
            e2 = x;
            f2 = 1;
        }else if(x != e1 && x != e2){
            f1--;
            f2--;
        }
    }
		if(f1 == 0 && f2 == 0){
			return -1;
		}
		int e1Count = 0;
		int e2Count = 0;
		for(int x: a){
			if(e1 > 0 && e1 == x ){
				e1Count++;
			}
			if(e2 > 0 && e2 == x){
				e2Count++;
			}
		}
		if(e1Count > n/3){
			return e1;
		}else if(e2Count > n/3){
      return e2;
		}
		return -1;
	}