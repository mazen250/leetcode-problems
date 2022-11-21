import java.util.ArrayList;
import java.util.Arrays;

public class plusOne {
    public int[] plusOne(int[] digits) {
        int number = digits.length;
        if(number==1){
            if (digits[0]==9){
                int [] res = {1,0};
                return res;
            }
            else{
                digits[0]=digits[0]+1;
                return digits;
            }
        }
        for (int i = number-1; i >= 0; i--) {
            if(digits[i]<9){
                digits[i] = digits[i]+1;
                return digits;
            }
            digits[i] = 0;
        }
        int[] result = new int[number +1];
        result[0] = 1;
        return result;
    }

    public static void main(String[] args) {
        plusOne p = new plusOne();
        int[] arr = {8,9,9,9};
        int[] result = p.plusOne(arr);
        System.out.println(Arrays.toString(result));
    }
}
