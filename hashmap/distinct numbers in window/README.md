### You are given an array of N integers, A1, A2 ,..., AN and an integer B. Return the of count of distinct numbers in all windows of size B.

### Formally, return an array of size N-B+1 where i'th element in this array contains number of distinct elements in sequence Ai, Ai+1 ,..., Ai+B-1.

### NOTE: if B > N, return an empty array.

<hr>
Input:<br>
2 4 3 8 3 9 4 9 4 10<br>
Output: [4, 3, 3, 4, 3, 2, 3]<br>
Explanaton:<br>
[2,4,3,8],[4,3,8,3],[3,8,3,9],[8,3,9,4],[3,9,4,9],[9,4,9,4],[4,9,4,10]<br>
ans= [4, 3, 3, 4, 3, 2, 3]<br>
