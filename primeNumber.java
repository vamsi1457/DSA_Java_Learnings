public class primeNumber {
    public static void main(String[] args) {
         PrimeChecker(13); 
    }
    static void PrimeChecker(int n){
        if(n<=1){
            System.out.println("not prime");
        }
        for(int i=2; i<Math.sqrt(n); i++){
            if(n%i == 0){
                System.out.println("not prime");
            }
        }
        System.out.println("prime");
    }
}
