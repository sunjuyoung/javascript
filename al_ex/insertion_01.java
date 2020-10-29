public class insertion_01 {
    public static void main(String[] args) {
       
        int arr[]={23,45,11,21,56,78};
        int n = arr.length;

        for(int i=0; i<n-1; i++){
            int min=i;
            for(int j=1+i; j<n; j++){

                if(arr[min]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j]=temp;
                  
                }
            }
        }

        int E[] ={23,45,11,21,56,78};
        int i=0;
        int t=0;
        do{

            int j=i+1;
            do{
                if(E[i]>E[j]){
                    t=E[i];
                    E[i]=E[j];
                    E[j]=t;
                }


                ++j;
            }while(j<5);
            ++i;
        }while(i<4);



        for(int a=0; a<n; a++){
            System.out.println(E[a]);
        }
        
        System.out.println("=======");

        for(int a=0; a<n; a++){
            System.out.println(arr[a]);
        }
        
    }
}
