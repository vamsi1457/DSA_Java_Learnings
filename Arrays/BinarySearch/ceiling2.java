package BinarySearch;

public class ceiling2 {
    public static void main(String[] args) {
        char[] list = {'c','f','g','h','i'};
        char target = 'c';
        int res=celling(list,target);
        System.out.println(list[res]);
    }
    // Return the the smallest character of the array which is greater than target
    static int celling(char[] list, char target){
        int start = 0;
        int end = list.length-1;
        int mid=0;
        while (start<=end) {
            mid = start + (end-start)/2;
            if(target<list[mid]){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return start;
    }
}
