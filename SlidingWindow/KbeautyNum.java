package SlidingWindow;
// leetcode: 2269
// Input: num = 430043, k = 2
// Output: 2
// Explanation: The following are the substrings of num of length k:
// - "43" from "430043": 43 is a divisor of 430043.
// - "30" from "430043": 30 is not a divisor of 430043.
// - "00" from "430043": 0 is not a divisor of 430043.
// - "04" from "430043": 4 is not a divisor of 430043.
// - "43" from "430043": 43 is a divisor of 430043.
// Therefore, the k-beauty is 2.
public class KbeautyNum {
    static int beautyNumber(int num, int k){
        int digits = (int)Math.log10(num)+1;
        int times = digits-k+1;
        int tenk = (int)Math.pow(10,k);
        int count = 0;
        int original = num;
        while(times > 0){
            int div = num % tenk;
            if(div != 0 && original%div == 0){
                count++;
            }
            num /= 10;
            times--;
        }
        return count;
    }
    public static void main(String[] args) {
        int num = 430043;
        System.out.println(beautyNumber(num, 2));
    }
}
