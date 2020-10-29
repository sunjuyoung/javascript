public class bubble_02 {
    public static void main(String[] args) {
        int arr[]={8,6,11,3,22,99,1,2};
        int n = arr.length;
       
        int k = 0;

         while(k<n-1){
             int last = n-1; //마지막 교환
            for(int j=n-1; j>k; j--){
                if(arr[j]<arr[j-1]){
                    last=j;
                    swap(arr, j,j-1);
                }
            }k=last;
        }

        for(int i=0; i<n; i++){
            System.out.println(arr[i]);
        }
       
    }

    public static void swap(int[]arr,int a, int b){
        int temp = arr[a];
          arr[a] = arr[b];
          arr[b]=temp;
    }
}
