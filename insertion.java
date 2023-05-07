import java.util.Random;
class insertion{
    public static void main(String[] args){
        int num[]=new int[100000];
        Random r= new Random();
        for(int i=0; i<num.length;i++){
            num[i]=r.nextInt();
        }
        int j,i, n;
       long start = System.currentTimeMillis();
        for(i=1; i<num.length ;i++){
             n = num[i];
            j=i-1;
            while(j>=0 && num[j]>n){
                num[j+1] = num[j];
                j=j-1;
            }
            num[j+1]= n;
        }
        long end = System.currentTimeMillis();
        long elapsedTime = end - start;
        System.out.println(elapsedTime);
    }
    
    
}