import java.util.Scanner;

public class greedy2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("크기:");
        int N = sc.nextInt();
        String dir = "";

        System.out.println("z는 끝");
        while(true){
            System.out.println("이동키:");
            String x = sc.next();
            if("z".equals(x) || "Z".equals(x)){
                break;
            }
            dir+=x;

        }

        int R=0;
        int C=0;
        for(int i=0; i<dir.length(); i++){
           int x = dir.charAt(i);
            switch (x) {
                case 76: if(C>0)--C;
                    break;
                case 82: if(C<N)++C;
                    break;
                case 85: if(R>0)--R;
                    break;
                case 68: if(R<N)++R;
                    break;
                default:
                    break;
            }

        }
        System.out.println(R+":"+C);

    }
}
 