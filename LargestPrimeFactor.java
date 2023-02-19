import java.lang.Math;
public class LargestPrimeFactor{
    public static boolean primechk(Long n) {
        boolean flag=true;
        for(long i=2L;i<Math.sqrt(n);i++){
            if(n%i==0) {
                flag=false;
                break;
            }
        }
        return flag;
    }
    public static void main(String[] args) {
        long num=600851475143L,largest=0L;
        if(num<=1) {
            System.out.println("No prime factors");
        }
        else if(num==2) {
            largest=2;
            System.out.println(largest);
        }
        else{
            for(Long i=3L;i<=num;i=i+2){
                //System.out.println(i);
                if(num%i==0){
                    if(primechk(i)){
                        largest=i;
                    }
                }
            } 
            System.out.println(largest);
        }
    }
}