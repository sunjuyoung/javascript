public class al02 {
    public static void main(String[] args) {
        
        int arr[][]=new int[4][4];
        int maxLen = arr[0].length;
        int num =0;

        for(int a=0; a<maxLen; a++){
            for(int b=0+a; b<maxLen; b++){
                arr[a][b]=++num;
            }
        }


       
        int V=0;
        int C=0;
        int arr1[][]=new int[4][4];
        while(C<4){
            int R=C;
            while(R<4){
                arr1[C][R] = ++V;
                ++R;
            }
            ++C;
        }



        for(int a=0; a<maxLen; a++){
            for(int b=0; b<maxLen; b++){
               System.out.printf("%3d",arr[a][b]);
            }System.out.println();
        }

        System.out.println("=========");

        for(int a=0; a<maxLen; a++){
            for(int b=0; b<maxLen; b++){
               System.out.printf("%3d",arr1[a][b]);
            }System.out.println();
        }
    }
}
