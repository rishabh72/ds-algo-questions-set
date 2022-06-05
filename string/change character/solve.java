// A ="wfnfozvsrt" B = 4
//  [f,n,o,r,s,t,v,w,z] = [2,1,1,1,1,1,1,1,1];
//  sort array [1,1,1,1,1,1,1,1,2]
// iterate and if A[i] <= B then B -= A[i] and A[i] = 0
// count non zero elements


 public int solve(String A, int B) {

    char[] Ar = A.toCharArray();
    int[] counts = new int[26];

    for (int x: Ar){
        int id = x - 'a';
        counts[id] += 1;
    }
    Arrays.sort(counts);



    for (int i=0;i< counts.length;i++){
        if(counts[i] <= B ){
            B = B - counts[i];
            counts[i] = 0;
        }
    }

    int ans = 0;
    for (int x: counts){
        if(x != 0){
            ans++;
        }
    }
    return ans;

}