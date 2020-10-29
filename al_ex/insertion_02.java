public class insertion_02 {
    public static void main(String[] args) {
        
        int [] numbers= {6,10,2,23,999};

        //최대값
        int max = numbers[0];
         for(int j=1; j<numbers.length; j++){
             if(max<numbers[j]){
                 max=numbers[j];
             }
         }
         //최대값 자리수
        int s = (Integer.toString(max)).length();   

        //같은자리수 만들기
        for(int i=0; i<numbers.length; i++){
            int c = (Integer.toString(numbers[i])).length();
         
            if(c<s){
                numbers[i] =(int)numbers[i] * (int)Math.pow(10, s-c);
            }
        }

        

        //정렬
        for(int i=0; i<numbers.length; i++){
            for(int j=1+i; j<numbers.length; j++){
                if(numbers[i]<numbers[j]){
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        
       
        //자리수 복구
        for(int i=0; i<numbers.length; i++){
            int c = (Integer.toString(numbers[i])).length();
           
            if(c<s){
                numbers[i] =(int)numbers[i] / (int)Math.pow(10, s-c);
            }
        }


        //붙이기


     
        for(int a=0; a<numbers.length;a++){
            System.out.println(numbers[a]);
        }
    
    }

 
}
