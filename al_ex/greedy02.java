import java.util.Scanner;

/**곱하기 혹은 더하기
 * greedy02
 */
public class greedy02 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        int num=0;


       // int result = n.charAt(0) -'0';

        for(int i=0; i<n.length(); i++){
            int x = Integer.parseInt(n.substring(i, i+1));
           if(x<2){
            num+=x;
           }else{
               if(num==0)num+=1;
            num*=x;
        }
        System.out.println(num);

    }
}
}