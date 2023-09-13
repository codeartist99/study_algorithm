class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        while (n >= 10) {
                answer = answer + 120000;
                k = k - 1;
                n = n - 10;
        }
        answer = answer + (12000 * n) + (2000 * k);
        return answer;
    }
}