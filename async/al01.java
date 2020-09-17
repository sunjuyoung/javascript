public class al01{
    public static void main(String[] args) {
     
        int arr[][] = new int[4][4];
        int arr1[][] = new int[4][4];
        int maxLen = arr[1].length;
        int num =0;

        for(int a=0; a<maxLen; a++){
            for(int b=0; b<maxLen; b++){
                arr[b][a] = ++num;
            }
        }   

        int R =0;
        int V =0;
        while(R<4){
            int C =0;
            while(C<4){
                arr1[C][R]=++V;
                ++C;
            }
            ++R;
        }


        


        for(int ar[] : arr){
            for(int a : ar){
                System.out.printf("%3d ",a);
            }System.out.println();
        }
        System.out.println("=================");
        for(int ar1[] : arr1){
            for(int a1 : ar1){
                System.out.printf("%3d ",a1);
            }System.out.println();
        }
    }
}