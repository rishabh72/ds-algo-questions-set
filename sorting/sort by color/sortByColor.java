public static int[] sortColors(int[] A) {
		int zeros = 0;
		int ones = 0;
		int twos = 0;
		for(int x:A){
			if(x == 0){
				zeros++;
			}else if(x == 1){
				ones++;
			}else if(x == 2){
				twos++;
			}
		}
		int[] res = new int[A.length];
		int index = 0;
		for(int i=1;i<=zeros;i++){
			res[index] = 0;
			index++;
		}
		for(int i=1;i<=ones;i++){
			res[index] = 1;
		 index++;
		}
		for(int i=1;i<=twos;i++){
			res[index] = 2;
			index++;
		}
    return res;
}