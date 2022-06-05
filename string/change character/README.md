### You are given a string A of size N consisting of lowercase alphabets.

### You can change at most B characters in the given string to any other lowercase alphabet such that the number of distinct characters in the string is minimized.

### Find the minimum number of distinct characters in the resulting string

<hr>
1 <= N <= 100000
<br>
0 <= B < N
<hr>
Input: A = "abcabbccd" B= 3<br>
Output: 2<br>
Explanation: We can change both 'a' and one 'd' into 'b'.So the new string becomes "bbcbbbccb".<br>
So the minimum number of distinct character will be 2.
