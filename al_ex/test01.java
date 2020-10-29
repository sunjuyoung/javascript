import java.util.Arrays;
import java.util.Collections;

public class test01 {
    public static void main(String[] args) {
        long n = 349587;

        int a = (int)n;

        String number = Integer.toString(a);

        int idx = number.length();
        String[] str = new String[idx];
        for(int i=0; i<idx; i++){
            str[i] =number.substring(i,1+i);
        }

        Arrays.sort(str,Collections.reverseOrder());

        String val = "";
        for(int i=0; i<idx; i++){
           val+=str[i];
        }

        int value = Integer.parseInt(val);
        long anser = (long)value;

        System.out.println(anser);
     

        
        
    }
}
