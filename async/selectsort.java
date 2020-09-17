public class selectsort {
    public static void main(String[] args) {
        int arr[] = {23,45,67,11,99,2};

        int temp;
        for(int i=0; i<arr.length; i ++){
            for(int j=i; j<arr.length; j++){
                if(arr[i]>arr[j]){
                    temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]= temp;
                }

            }
        }

        int arr1[] = {23,45,67,11,99,2};

        int d=0;
        int temp1;
        
        do{
            int c=0;
            c+=d;
            do{
                if(arr1[d]>arr1[c]){
                    temp1 =arr1[c];
                    arr1[c]=arr1[d];
                    arr1[d]= temp1;
                }
                
                ++c;
            }while(c<6); 

            ++d;
        }while(d<5);





        for(int k=0; k<arr.length; k ++){
            System.out.printf("%3d",arr[k]);
            
            
        }System.out.println();
        for(int k=0; k<arr.length; k ++){
            System.out.printf("%3d",arr1[k]);
            
            
        }



    }
}
