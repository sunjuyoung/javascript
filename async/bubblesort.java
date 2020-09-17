public class bubblesort {
    public static void main(String[] args) {
        
        int arr[] = {45,67,23,11,78,3};
        int n = arr.length;

        for(int i=0; i<n-1; i++){
            for(int j=n-1; j>i; j--){
                if(arr[j-1]>arr[j]){
                    int temp = arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
            }
          
        }



        for(int a=0; a<n; a++){
            for(int b=0; b<n; b++){
               System.out.printf("%3d",arr[a][b]);
            }System.out.println();
        }


       
        int j=0;
        int max=arr[j];
        for(int i=1; i<arr.length; i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println(max);

    }

   
}
