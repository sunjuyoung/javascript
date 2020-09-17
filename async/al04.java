public class al04 {
    public static void main(String[] args) {
        

        int arr[][] = new int[4][4];
        int maxLen = arr[0].length;
        int num =0;
        int R=0,C=-1;
        int S=1;

        while(true){
           

            for(int P=0; P<maxLen; P++){
               C+=S;
                arr[R][C]=++num;

            }
            ++R;
            ++C;
            S*=-1;
            if(R>=4)break;
            for(int P=0; P<maxLen; P++){
                C+=S;
                arr[R][C]=++num;
            }
            ++R;
            --C;
            S*=-1;
            if(R>=4)break;
           
        }

        for(int a=0; a<maxLen; a++){
            for(int b=0; b<maxLen; b++){
               System.out.printf("%3d",arr[a][b]);
            }System.out.println();
        }

    }
}
