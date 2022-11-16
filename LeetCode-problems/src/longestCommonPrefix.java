import java.util.ArrayList;

public class longestCommonPrefix {

    public String longestCommonPrefix(String[] strs){
        if(strs.length==0) return "";
        String preFix = strs[0];
        for (int i = 0; i < strs.length; i++) {
            while(strs[i].indexOf(preFix)!=0){
                preFix = preFix.substring(0,preFix.length()-1);
            }
        }

        return preFix;
    }


    public static void main(String[] args) {
        longestCommonPrefix p = new longestCommonPrefix();
        String[] arr = {"flower","sdsd","fdssisdght"};
        System.out.println(p.longestCommonPrefix(arr));
    }
}
