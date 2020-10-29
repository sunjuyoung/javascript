public class select_01 {
    public static void main(String[] args) {
        //단순 선택 정렬 
        //가장 작은 요소부터 선택해 알맞은 위치로 옮긴다

        int arr[] ={34,65,2,1,77,8};
        int n = arr.length;

        for(int i=0; i<n-1; i++){
            int min=i;
            for(int j=1+i; j<n; j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
                    swap(arr, i, min);
            }
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
