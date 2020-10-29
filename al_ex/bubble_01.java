public class bubble_01 {
    public static void main(String[] args) {
        
        int arr[]={8,6,11,3,22,99,1,2};
        int n = arr.length;
       

        for(int i=0; i<n; i++){
            int count=0;
            for(int j=n-1; j>i; j--){
                if(arr[j]<arr[j-1]){
                    ++count;
                    swap(arr, j,j-1);
                }
            }if(count ==0)break; //교환되지 않으면 멈춤
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
