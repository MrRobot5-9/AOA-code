 import java.util.Random;
class selection{
    public static void main(String[] args){
        int arr[]=new int[100000];
        Random r= new Random();
        for(int i=0; i<arr.length;i++){
            arr[i]=r.nextInt();
        }
        int j,i, n;
       long start = System.currentTimeMillis();
        n = arr.length;
 
        
        for ( i = 0; i < n-1; i++)
        {
            
            int min_idx = i;
            for ( j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;
 
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];  
            arr[i] = temp;
        }
        long end = System.currentTimeMillis();
        long elapsedTime = end - start;
        System.out.println(elapsedTime);
    }
}
