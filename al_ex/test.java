import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        for(int i=0; i<5; i++){
          int ran =  (int)(Math.random()*20);
           
           list.add(ran);
        }
        list.add(34);
        list.get(0);

       System.out.println(list.toString());
    }
}
