import java.util.ArrayList;
import java.util.List;

/**
 * Al_01
 */
public class Al_01 {

    public static void main(String[] args) {
        System.out.println("hi");
    }

    public String solution(int[] numbers) {
        String answer = "";
        
        return answer;
    }
    
    public void number(){
        int arr[] = new int [5];
        int len = arr.length;
        for(int i=0; i<len;i++){
            arr[i]= (int)Math.random()*20;
        }

        List<String> list = new ArrayList();

       
        

        for(int i=0; i<len; i++){
            int maxNum= SearchMaxNum(arr,arr.length);
            
        }

        
        
    }

    public int SearchMaxNum(int[]num, int len){

        int max = num[0];
        for(int i=1; i<len; i++){
            if(max<num[i]){
                max = num[i];
            }
        }
        return max;
    }
}