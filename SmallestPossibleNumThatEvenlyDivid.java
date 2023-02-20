//need to change ArrayList to array
import java.util.ArrayList;
class SmallestPossibleNumThatEvenlyDivisibleAllNumInARange{
    static boolean primechk(int n){
        boolean flag=false;
        if(n==2 || n==3) return true;
        for(int i=2;i<Math.sqrt(n);i++){
            flag=true;
            if(n%i==0) {
                flag=false;
                break;
            }
        }
        return flag;
    }
    static ArrayList<Integer> primeGen(int n){
        ArrayList<Integer> primeList=new ArrayList<Integer>();
        for(int i=0;i<=n;i++){
            if(primechk(i)) {primeList.add(i);
            System.out.println(i);}
        }
        return primeList;
    }
    public static void main(String[] args) {
        primeGen(20);
    }
}