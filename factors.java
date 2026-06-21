public class factors {
    public static void main(String[] args) {
        FindFactors(20);
    }
    static void FindFactors(int n){
        for(int i=1; i<=n; i++){
            if(n%i == 0) System.out.print(i+" ");
        }
    }
}
