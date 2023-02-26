import java.lang.Math;
import java.util.ArrayList;
public class findNthPrime {
    static boolean primeck(int n){
        if(n==1||n==0) return false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0) return false;
        }
        return true;
    }
    static ArrayList<Integer> genPrime(int n){
        ArrayList<Integer> list=new ArrayList<>();
        int limit=n,i=0,stuff=0;
        while(limit!=0){
            if(primeck(i)){
                list.add(i);
                limit--;
            }
            i++;
        }
        return list;
    }
    public static void main(String[] args) {
        ArrayList<Integer> primes=genPrime(10001);
        System.out.println(primes.get(primes.size()-1));
    }
}
