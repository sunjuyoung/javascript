import java.util.Scanner;

public class al05 {
    public static void main(String[] args) {
        int arr1[] = new int[10]; //매출액
        int arr2[] = new int[10]; //석차

        
        Scanner sc = new Scanner(System.in);

        System.out.println("매출액입력");
        for(int a=0; a<arr1.length; a++){
            
            arr1[a] = sc.nextInt();
            arr2[a]=1;

        }

        for(int a=0; a<arr1.length; a++){
            for(int b=0; b<arr1.length; b++){
                
                int temp=arr1[a];
                if(arr1[a]>arr1[b]){
                    arr1[a]=arr1[b];
                    arr1[b]=temp;
                    
                }
            }
        }

        sc.close();
        for(int a=0; a<arr1.length; a++){
            for(int b=0; b<arr1.length; b++){
                
               
                if(arr1[a]<arr1[b]){
                   
                    arr2[b]+=1;
                }
            }
        }





        for(int a=0; a<10; a++){
            System.out.println(arr1[a] +" : "+ arr2[a]+"등");
        }


    }
    

}
