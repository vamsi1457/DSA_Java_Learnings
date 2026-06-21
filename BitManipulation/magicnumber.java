package BitManipulation;

public class magicnumber {
    /*
    ex: for 3 = 0 1 1
    sol:- (0*5pow(3))+(1*5pow(2))+(1*5pow(1))
    number(n)  =   bits            -> magic number
    1         0 0 1                5
    2         0 1 0                25
    */
    public static void main(String[] args) {
        int n =6;
        int ans = 0;
        int base =5;
        while(n>0){
            int last = n&1; // find the last bit of a number
            n = n>>1;    // right shift the bits once
            ans += base * last;  
            base = base*5;   // update the base
        }
        System.out.println(ans);
    }
}
