import java.util.Arrays;

public class brute_force_01 {
    public static void main(String[] args) {
        
        String str[]= {"45","345","234","1111"};
        String str1[]= {"45","345","234","1111"};

        Arrays.sort(str);

        for(int a=0; a<str.length;a++){
            System.out.printf("%s ,",str[a]);
        }


        

    }
}
