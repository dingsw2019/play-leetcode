import java.util.HashSet;

class Solution {

    public int nextNumber(int n){
        int num = 0;
        while (n > 0) {
            int e = n%10;
            n /= 10;
            num += e*e;
        }
        return num;
    }

    public boolean isHappy(int n) {

        HashSet<Integer> seen = new HashSet<>();
        while (n != 1 && !seen.contains(n)) {
            seen.add(n);
            n = nextNumber(n);
        }

        return n == 1;
    }

    public static void main(String[] args) {
        boolean res;
        res = (new Solution()).isHappy(20);
        System.out.println(res);
    }
}