//need to change ArrayList to array
import java.lang.Math;
import java.util.ArrayList;
class SmallestPossibleNumThatEvenlyDivisibleAllNumInARange{
    //check for prime
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
    //returns array list of primes <n
    static ArrayList<Integer> primeGen(int n){
        ArrayList<Integer> primeList=new ArrayList<Integer>();
        for(int i=0;i<=n;i++)
            if(primechk(i)) primeList.add(i);
        return primeList;
    }
    //checks for highest power less than number
    static int highestPower(int n,int max){
        int pow=0;
        Double count=0.0;
        while(true){
            if(count>=max) break;
            count=Math.pow(n, pow);
            pow++;
        }
        pow=pow-2;
        return pow;
    }
    //returns array list of power of primes that are less than n
    static ArrayList<Integer> powlessthan(ArrayList<Integer> arr){
        ArrayList<Integer> powerList=new ArrayList<Integer>(); 
        int size=arr.size();
        for(int i=0;i<size;i++){

        }
        return powerList;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list=primeGen(20);
        int size=list.size();
        for(int i=0;i<size;i++){
            System.out.println(list.get(i));
        }
        System.out.println(highestPower(4, 100));
    }
}