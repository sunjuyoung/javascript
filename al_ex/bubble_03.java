public class bubble_03 {
    public static void main(String[] args) {
        int arr[] ={34,65,2,1,77,8};
        int n = arr.length;

        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

        
        int E[] ={23,45,11,21,56,78};
        int i=0;
        int t=0;
        do{

            int j=0;
            do{
               if(E[j]>E[j+1]){
                    
               } 

            }while(j<4-i);

            ++i;
        }while(i<4);






        for(int a=0; a<n; a++){
            System.out.println(arr[a]);
        }

    }
}
