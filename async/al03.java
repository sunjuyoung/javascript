public class al03 {
    /**
     *  1  2  3  4
        12 13 14  5
        11 16 15  6
        10  9  8  7
     */
    public static void main(String[] args) {
        int arr[][]=new int[4][4];
        int maxLen = arr[0].length;
        int num =0;


        int C=-1;
        int R=0;
       int K =1;
        int S=4;

        while(true){
            for(int P=0; P<S; P++){
                C+=K;
                arr[R][C] =++num;
                
            }
            --S;
            if(S<=0)break;
            for(int P=0; P<S; P++){
               R+=K;
                arr[R][C]=++num;
               
            }
            K*=-1;
        }

  for(int a=0; a<maxLen; a++){
            for(int b=0; b<maxLen; b++){
               System.out.printf("%3d",arr[a][b]);
            }System.out.println();
        }
     

    }
    
}
