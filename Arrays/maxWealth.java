public class maxWealth {
    public static void main(String[] args) {
        int[][] bank = {{1,2,3},{2,3,4},{6,7,2}};
        System.out.println(wealth(bank));
    }
    static int wealth(int[][] arr){
        int max = 0;
        for(int person=0; person<arr.length; person++){
            int rowsum =0;
            for(int account=0; account<arr[person].length; account++){
                rowsum += arr[person][account];
            }
            if(max<rowsum){
                max = rowsum;
            }
        }
        return max;
    }
}
