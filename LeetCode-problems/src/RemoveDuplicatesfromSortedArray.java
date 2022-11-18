import java.util.LinkedList;

public class RemoveDuplicatesfromSortedArray {

    public int removeDuplicates(int[] nums) {
        int result=0;

        for (int i = 0; i < nums.length; i++) {
            if(i<nums.length-1 && nums[i]==nums[i+1]){
                continue;
            }
            nums[result] = nums[i];
            result++;
        }
        return result;
    }

    public static void main(String[] args) {
        RemoveDuplicatesfromSortedArray r = new RemoveDuplicatesfromSortedArray();

        int[] arr = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(r.removeDuplicates(arr));
    }

}
