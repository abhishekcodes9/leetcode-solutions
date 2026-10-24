// ==========================================================
// 204. Count Primes
// Difficulty : Medium
// Language   : Java
// Solution   : #1
// Runtime    : 124 ms (Beats 86%)
// Memory     : 50.7 MB (Beats 95%)
// Link       : https://leetcode.com/problems/count-primes/
// ==========================================================


class Solution {
    public int countPrimes(int n) {
        boolean[] prime = new boolean[n];

        for (int i = 2; i < n; i++) {
            prime[i] = true;
        }

        for (int i = 2; i * i < n; i++) {
            if (prime[i]) {
                for (int j = i * i; j < n; j += i) {
                    prime[j] = false;
                }
            }
        }

        int count = 0;

        for (int i = 2; i < n; i++) {
            if (prime[i]) {
                count++;
            }
        }

        return count;
    }
}
